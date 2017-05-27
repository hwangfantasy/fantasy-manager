package com.fantasy.manager.service;

import com.fantasy.manager.bean.SysUser;
import com.fantasy.manager.common.PasswordGenerator;
import com.fantasy.manager.dao.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @作者 yunfeiyang
 * @创建时间: 2017/5/27 <br/>
 * @方法描述: SysUserServiceImpl. <br/>
 */
@Service
public class SysUserService {
    @Autowired
    SysUserMapper sysUserMapper;

    @Autowired
    PasswordGenerator passwordGenerator;

    public SysUser findSysUserById(Integer id) {
        return sysUserMapper.selectByPrimaryKey(id);
    }

    public boolean createUser(String username,String password){
        SysUser user = new SysUser();
        user.withUsername(username).withPassword(password);
        passwordGenerator.encryptPassword(user);
        user.setCreateTime(new Date());
        return sysUserMapper.insertSelective(user) > 0 ? true : false;
    }
}
