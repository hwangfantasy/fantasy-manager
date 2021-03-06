package com.fantasy.manager.bean;

import java.util.Date;

public class SysPermission {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_permission.id
     *
     * @mbg.generated Thu Jun 01 14:45:55 CST 2017
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_permission.name
     *
     * @mbg.generated Thu Jun 01 14:45:55 CST 2017
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_permission.type
     *
     * @mbg.generated Thu Jun 01 14:45:55 CST 2017
     */
    private Short type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_permission.parent_id
     *
     * @mbg.generated Thu Jun 01 14:45:55 CST 2017
     */
    private Integer parentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_permission.url
     *
     * @mbg.generated Thu Jun 01 14:45:55 CST 2017
     */
    private String url;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_permission.permission
     *
     * @mbg.generated Thu Jun 01 14:45:55 CST 2017
     */
    private String permission;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_permission.available
     *
     * @mbg.generated Thu Jun 01 14:45:55 CST 2017
     */
    private Boolean available;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_permission.create_user
     *
     * @mbg.generated Thu Jun 01 14:45:55 CST 2017
     */
    private Integer createUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_permission.create_time
     *
     * @mbg.generated Thu Jun 01 14:45:55 CST 2017
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_permission.modify_user
     *
     * @mbg.generated Thu Jun 01 14:45:55 CST 2017
     */
    private Integer modifyUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_permission.modify_time
     *
     * @mbg.generated Thu Jun 01 14:45:55 CST 2017
     */
    private Date modifyTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_permission.id
     *
     * @return the value of sys_permission.id
     *
     * @mbg.generated Thu Jun 01 14:45:55 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permission
     *
     * @mbg.generated Thu Jun 01 14:45:55 CST 2017
     */
    public SysPermission withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_permission.id
     *
     * @param id the value for sys_permission.id
     *
     * @mbg.generated Thu Jun 01 14:45:55 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_permission.name
     *
     * @return the value of sys_permission.name
     *
     * @mbg.generated Thu Jun 01 14:45:55 CST 2017
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permission
     *
     * @mbg.generated Thu Jun 01 14:45:55 CST 2017
     */
    public SysPermission withName(String name) {
        this.setName(name);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_permission.name
     *
     * @param name the value for sys_permission.name
     *
     * @mbg.generated Thu Jun 01 14:45:55 CST 2017
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_permission.type
     *
     * @return the value of sys_permission.type
     *
     * @mbg.generated Thu Jun 01 14:45:55 CST 2017
     */
    public Short getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permission
     *
     * @mbg.generated Thu Jun 01 14:45:55 CST 2017
     */
    public SysPermission withType(Short type) {
        this.setType(type);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_permission.type
     *
     * @param type the value for sys_permission.type
     *
     * @mbg.generated Thu Jun 01 14:45:55 CST 2017
     */
    public void setType(Short type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_permission.parent_id
     *
     * @return the value of sys_permission.parent_id
     *
     * @mbg.generated Thu Jun 01 14:45:55 CST 2017
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permission
     *
     * @mbg.generated Thu Jun 01 14:45:55 CST 2017
     */
    public SysPermission withParentId(Integer parentId) {
        this.setParentId(parentId);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_permission.parent_id
     *
     * @param parentId the value for sys_permission.parent_id
     *
     * @mbg.generated Thu Jun 01 14:45:55 CST 2017
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_permission.url
     *
     * @return the value of sys_permission.url
     *
     * @mbg.generated Thu Jun 01 14:45:55 CST 2017
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permission
     *
     * @mbg.generated Thu Jun 01 14:45:55 CST 2017
     */
    public SysPermission withUrl(String url) {
        this.setUrl(url);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_permission.url
     *
     * @param url the value for sys_permission.url
     *
     * @mbg.generated Thu Jun 01 14:45:55 CST 2017
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_permission.permission
     *
     * @return the value of sys_permission.permission
     *
     * @mbg.generated Thu Jun 01 14:45:55 CST 2017
     */
    public String getPermission() {
        return permission;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permission
     *
     * @mbg.generated Thu Jun 01 14:45:55 CST 2017
     */
    public SysPermission withPermission(String permission) {
        this.setPermission(permission);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_permission.permission
     *
     * @param permission the value for sys_permission.permission
     *
     * @mbg.generated Thu Jun 01 14:45:55 CST 2017
     */
    public void setPermission(String permission) {
        this.permission = permission == null ? null : permission.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_permission.available
     *
     * @return the value of sys_permission.available
     *
     * @mbg.generated Thu Jun 01 14:45:55 CST 2017
     */
    public Boolean getAvailable() {
        return available;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permission
     *
     * @mbg.generated Thu Jun 01 14:45:55 CST 2017
     */
    public SysPermission withAvailable(Boolean available) {
        this.setAvailable(available);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_permission.available
     *
     * @param available the value for sys_permission.available
     *
     * @mbg.generated Thu Jun 01 14:45:55 CST 2017
     */
    public void setAvailable(Boolean available) {
        this.available = available;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_permission.create_user
     *
     * @return the value of sys_permission.create_user
     *
     * @mbg.generated Thu Jun 01 14:45:55 CST 2017
     */
    public Integer getCreateUser() {
        return createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permission
     *
     * @mbg.generated Thu Jun 01 14:45:55 CST 2017
     */
    public SysPermission withCreateUser(Integer createUser) {
        this.setCreateUser(createUser);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_permission.create_user
     *
     * @param createUser the value for sys_permission.create_user
     *
     * @mbg.generated Thu Jun 01 14:45:55 CST 2017
     */
    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_permission.create_time
     *
     * @return the value of sys_permission.create_time
     *
     * @mbg.generated Thu Jun 01 14:45:55 CST 2017
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permission
     *
     * @mbg.generated Thu Jun 01 14:45:55 CST 2017
     */
    public SysPermission withCreateTime(Date createTime) {
        this.setCreateTime(createTime);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_permission.create_time
     *
     * @param createTime the value for sys_permission.create_time
     *
     * @mbg.generated Thu Jun 01 14:45:55 CST 2017
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_permission.modify_user
     *
     * @return the value of sys_permission.modify_user
     *
     * @mbg.generated Thu Jun 01 14:45:55 CST 2017
     */
    public Integer getModifyUser() {
        return modifyUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permission
     *
     * @mbg.generated Thu Jun 01 14:45:55 CST 2017
     */
    public SysPermission withModifyUser(Integer modifyUser) {
        this.setModifyUser(modifyUser);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_permission.modify_user
     *
     * @param modifyUser the value for sys_permission.modify_user
     *
     * @mbg.generated Thu Jun 01 14:45:55 CST 2017
     */
    public void setModifyUser(Integer modifyUser) {
        this.modifyUser = modifyUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_permission.modify_time
     *
     * @return the value of sys_permission.modify_time
     *
     * @mbg.generated Thu Jun 01 14:45:55 CST 2017
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_permission
     *
     * @mbg.generated Thu Jun 01 14:45:55 CST 2017
     */
    public SysPermission withModifyTime(Date modifyTime) {
        this.setModifyTime(modifyTime);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_permission.modify_time
     *
     * @param modifyTime the value for sys_permission.modify_time
     *
     * @mbg.generated Thu Jun 01 14:45:55 CST 2017
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}