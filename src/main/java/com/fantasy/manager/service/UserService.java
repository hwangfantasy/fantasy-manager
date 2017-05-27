package com.fantasy.manager.service;

import com.fantasy.manager.bean.SysUser;
import com.fantasy.manager.bean.SysUserExample;
import com.fantasy.manager.common.PasswordGenerator;
import com.fantasy.manager.dao.SysRoleMapper;
import com.fantasy.manager.dao.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * @作者 yunfeiyang
 * @创建时间: 2017/5/27 <br/>
 * @方法描述: SysUserServiceImpl. <br/>
 */
@Service
public class UserService {
    @Autowired
    private SysUserMapper sysUserMapper;

    @Autowired
    private SysRoleMapper sysRoleMapper;

    @Autowired
    private PasswordGenerator passwordGenerator;

    public SysUser findSysUserById(Integer id) {
        return sysUserMapper.selectByPrimaryKey(id);
    }

    public SysUser findSysUserByUsername(String username) {
        SysUserExample sysUserExample = new SysUserExample();
        sysUserExample.createCriteria().andUsernameEqualTo(username).andLockedEqualTo(false);
        List<SysUser> sysUsers = sysUserMapper.selectByExample(sysUserExample);
        if (sysUsers != null && sysUsers.size() != 0)
            return sysUsers.get(0);
        return null;
    }

    public boolean createUser(String username, String password) {
        SysUser user = new SysUser();
        user.withUsername(username).withPassword(password);
        passwordGenerator.encryptPassword(user);
        user.setCreateTime(new Date());
        return sysUserMapper.insertSelective(user) > 0 ? true : false;
    }

    public Set<String> findRolesByUsername(String username){
        return null;
    }
    public Set<String> findPermissionsByUsername(String username){
        return null;
    }
}
