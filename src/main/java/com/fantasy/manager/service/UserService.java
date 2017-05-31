package com.fantasy.manager.service;

import com.fantasy.manager.bean.SysResource;
import com.fantasy.manager.bean.SysRole;
import com.fantasy.manager.bean.SysUser;
import com.fantasy.manager.bean.SysUserExample;
import com.fantasy.manager.common.PasswordGenerator;
import com.fantasy.manager.dao.SysResourceMapper;
import com.fantasy.manager.dao.SysRoleMapper;
import com.fantasy.manager.dao.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

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
    private SysResourceMapper sysResourceMapper;

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
        SysUser user = findSysUserByUsername(username);
        if(user == null)
            return Collections.EMPTY_SET;
        List<Integer> roleIdList = user.getRoleIdList();
        Set<SysRole> sysRoles = findSysRoleByIds(roleIdList.toArray(new Integer[0]));
        Set<String> roles = new HashSet<>();
        for(SysRole sysRole : sysRoles){
            roles.add(sysRole.getRole());
        }
        return roles;
    }

    public Set<String> findPermissionsByUsername(String username){
        SysUser user = findSysUserByUsername(username);
        if(user == null)
            return Collections.EMPTY_SET;
        List<Integer> roleIdList = user.getRoleIdList();
        Set<SysRole> sysRoles = findSysRoleByIds(roleIdList.toArray(new Integer[0]));
        Set<String> permissions = new HashSet<>();
        for (SysRole sysRole : sysRoles){
           permissions.addAll(findPermissionByIds(sysRole.getResourceIdList().toArray(new Integer[0])));
        }
        return permissions;
    }

    public Set<SysRole> findSysRoleByIds(Integer... roleIds){
        Set<SysRole> roles = new HashSet<>();
        if(roleIds.length == 0)
            return Collections.EMPTY_SET;
        for (Integer roleId : roleIds){
            SysRole role = sysRoleMapper.selectByPrimaryKey(roleId);
            roles.add(role);
        }
        return roles;
    }

    public Set<String> findPermissionByIds(Integer... resourceIds){
        Set<String> permissions = new HashSet<>();
        if(resourceIds.length == 0)
            return Collections.EMPTY_SET;
        for (Integer resourceId : resourceIds){
            SysResource resource = sysResourceMapper.selectByPrimaryKey(resourceId);
            permissions.add(resource.getPermission());
        }
        return permissions;
    }
}
