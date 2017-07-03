package com.fantasy.manager.service;

import com.fantasy.manager.bean.SysLog;
import com.fantasy.manager.bean.SysLogExample;
import com.fantasy.manager.dao.SysLogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @作者 hwangfantasy
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

    public List<SysLog> findAllSysLogs(){
        SysLogExample sysLogExample = new SysLogExample();
        sysLogExample.createCriteria().andIdIsNotNull();
        List<SysLog> sysLogs = sysLogMapper.selectByExample(sysLogExample);
        return sysLogs;
    }
}
