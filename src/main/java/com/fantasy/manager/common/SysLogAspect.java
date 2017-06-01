package com.fantasy.manager.common;

import com.alibaba.fastjson.JSON;
import com.fantasy.manager.annotation.OperationLog;
import com.fantasy.manager.bean.SysLog;
import com.fantasy.manager.bean.SysUser;
import com.fantasy.manager.service.LogService;
import com.fantasy.manager.util.IpUtil;
import org.apache.shiro.SecurityUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;

/**
 * @作者 hwangfantasy
 * @创建时间: 2017/5/31 <br/>
 * @方法描述: SysLogAspect. <br/>
 */
@Aspect
@Component
public class SysLogAspect {
    @Autowired
    private LogService logService;

    @Pointcut("@annotation(com.fantasy.manager.annotation.OperationLog)")
    public void logPointCut() {}

    @Before("logPointCut()")
    public void saveSysLog(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();

        SysLog sysLogBean = new SysLog();
        OperationLog operationLog = method.getAnnotation(OperationLog.class);
        if (operationLog != null) {
            // 注解上的描述
            sysLogBean.setOperation(operationLog.value());
        }
        // 请求的方法名
        String className = joinPoint.getTarget().getClass().getName();
        String methodName = methodSignature.getName();
        sysLogBean.setMethod(className + "." + methodName + "()");

        // 请求的参数
        Object[] args = joinPoint.getArgs();
        String params = JSON.toJSONString(args[0]);
        sysLogBean.setParameter(params);

        // 获取request
        HttpServletRequest request =
                        ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        // 设置IP地址
        sysLogBean.setIp(IpUtil.getIpAddress(request));

        // 用户名
        SysUser sysUser = (SysUser) SecurityUtils.getSubject().getPrincipal();
        sysLogBean.setOperateUser(sysUser.getUsername());

        // 保存系统日志
        logService.saveSysLog(sysLogBean);
    }
}
