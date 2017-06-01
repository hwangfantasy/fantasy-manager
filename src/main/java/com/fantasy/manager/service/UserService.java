package com.fantasy.manager.service;

import com.fantasy.manager.bean.*;
import com.fantasy.manager.common.PasswordGenerator;
import com.fantasy.manager.dao.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.*;

/**
 * @作者 hwangfantasy
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
    private SysPermissionMapper sysPermissionMapper;

    @Autowired
    private SysUserRoleMapper sysUserRoleMapper;

    @Autowired
    private SysRolePermissionMapper sysRolePermissionMapper;

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
        List<Integer> roleIdList = findRoleIdsByUserId(user.getId());
        Set<SysRole> sysRoles = findSysRoleByIds(roleIdList.toArray(new Integer[0]));
        Set<String> roles = new HashSet<>();
        for(SysRole sysRole : sysRoles){
            roles.add(sysRole.getRole());
        }
        return roles;
    }

    public List<Integer> findRoleIdsByUserId(Integer userId){
        SysUserRoleExample sysUserRoleExample = new SysUserRoleExample();
        sysUserRoleExample.createCriteria().andUserIdEqualTo(userId).andAvailableEqualTo(true);
        List<SysUserRole> sysUserRoleList =  sysUserRoleMapper.selectByExample(sysUserRoleExample);
        if(CollectionUtils.isEmpty(sysUserRoleList)){
            return Collections.EMPTY_LIST;
        }
        List<Integer> roleIds = new ArrayList<>();
        for (SysUserRole sysUserRole : sysUserRoleList){
            roleIds.add(sysUserRole.getRoleId());
        }
        return roleIds;
    }

    public Set<String> findPermissionsByUsername(String username){
        SysUser user = findSysUserByUsername(username);
        if(user == null)
            return Collections.EMPTY_SET;
        List<Integer> roleIdList = findRoleIdsByUserId(user.getId());
        Set<SysRole> sysRoles = findSysRoleByIds(roleIdList.toArray(new Integer[0]));
        Set<String> permissions = new HashSet<>();
        for (SysRole sysRole : sysRoles){
           permissions.addAll(findPermissionByIds(findPermissionIdsByRoleId(sysRole.getId()).toArray(new Integer[0])));
        }
        return permissions;
    }

    public List<Integer> findPermissionIdsByRoleId(Integer roleId){
        SysRolePermissionExample sysRolePermissionExample = new SysRolePermissionExample();
        sysRolePermissionExample.createCriteria().andRoleIdEqualTo(roleId).andAvailableEqualTo(true);
        List<SysRolePermission> sysRolePermissionList =  sysRolePermissionMapper.selectByExample(sysRolePermissionExample);
        if(CollectionUtils.isEmpty(sysRolePermissionList)){
            return Collections.EMPTY_LIST;
        }
        List<Integer> permissionIds = new ArrayList<>();
        for (SysRolePermission sysRolePermission : sysRolePermissionList){
            permissionIds.add(sysRolePermission.getPermissionId());
        }
        return permissionIds;
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

    public Set<String> findPermissionByIds(Integer... permissionIds){
        Set<String> permissions = new HashSet<>();
        if(permissionIds.length == 0)
            return Collections.EMPTY_SET;
        for (Integer permissionId : permissionIds){
            SysPermission permission = sysPermissionMapper.selectByPrimaryKey(permissionId);
            permissions.add(permission.getPermission());
        }
        return permissions;
    }
}
