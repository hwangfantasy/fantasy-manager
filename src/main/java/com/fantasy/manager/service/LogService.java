package com.fantasy.manager.service;

import com.fantasy.manager.bean.SysLog;
import com.fantasy.manager.dao.SysLogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @作者 yunfeiyang
 * @创建时间: 2017/5/31 <br/>
 * @方法描述: LogService. <br/>
 */
@Service
public class LogService {
    @Autowired
    private SysLogMapper sysLogMapper;

    public void saveSysLog(SysLog sysLog){
        sysLog.setOperateTime(new Date());
        sysLogMapper.insertSelective(sysLog);
    }
}
