package com.fantasy.manager.bean;

import java.util.Date;

public class SysLog {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.id
     *
     * @mbg.generated Thu Jun 01 14:45:55 CST 2017
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.operate_user
     *
     * @mbg.generated Thu Jun 01 14:45:55 CST 2017
     */
    private String operateUser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.operation
     *
     * @mbg.generated Thu Jun 01 14:45:55 CST 2017
     */
    private String operation;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.method
     *
     * @mbg.generated Thu Jun 01 14:45:55 CST 2017
     */
    private String method;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.parameter
     *
     * @mbg.generated Thu Jun 01 14:45:55 CST 2017
     */
    private String parameter;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.ip
     *
     * @mbg.generated Thu Jun 01 14:45:55 CST 2017
     */
    private String ip;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_log.operate_time
     *
     * @mbg.generated Thu Jun 01 14:45:55 CST 2017
     */
    private Date operateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.id
     *
     * @return the value of sys_log.id
     *
     * @mbg.generated Thu Jun 01 14:45:55 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_log
     *
     * @mbg.generated Thu Jun 01 14:45:55 CST 2017
     */
    public SysLog withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.id
     *
     * @param id the value for sys_log.id
     *
     * @mbg.generated Thu Jun 01 14:45:55 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.operate_user
     *
     * @return the value of sys_log.operate_user
     *
     * @mbg.generated Thu Jun 01 14:45:55 CST 2017
     */
    public String getOperateUser() {
        return operateUser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_log
     *
     * @mbg.generated Thu Jun 01 14:45:55 CST 2017
     */
    public SysLog withOperateUser(String operateUser) {
        this.setOperateUser(operateUser);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.operate_user
     *
     * @param operateUser the value for sys_log.operate_user
     *
     * @mbg.generated Thu Jun 01 14:45:55 CST 2017
     */
    public void setOperateUser(String operateUser) {
        this.operateUser = operateUser == null ? null : operateUser.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.operation
     *
     * @return the value of sys_log.operation
     *
     * @mbg.generated Thu Jun 01 14:45:55 CST 2017
     */
    public String getOperation() {
        return operation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_log
     *
     * @mbg.generated Thu Jun 01 14:45:55 CST 2017
     */
    public SysLog withOperation(String operation) {
        this.setOperation(operation);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.operation
     *
     * @param operation the value for sys_log.operation
     *
     * @mbg.generated Thu Jun 01 14:45:55 CST 2017
     */
    public void setOperation(String operation) {
        this.operation = operation == null ? null : operation.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.method
     *
     * @return the value of sys_log.method
     *
     * @mbg.generated Thu Jun 01 14:45:55 CST 2017
     */
    public String getMethod() {
        return method;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_log
     *
     * @mbg.generated Thu Jun 01 14:45:55 CST 2017
     */
    public SysLog withMethod(String method) {
        this.setMethod(method);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.method
     *
     * @param method the value for sys_log.method
     *
     * @mbg.generated Thu Jun 01 14:45:55 CST 2017
     */
    public void setMethod(String method) {
        this.method = method == null ? null : method.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.parameter
     *
     * @return the value of sys_log.parameter
     *
     * @mbg.generated Thu Jun 01 14:45:55 CST 2017
     */
    public String getParameter() {
        return parameter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_log
     *
     * @mbg.generated Thu Jun 01 14:45:55 CST 2017
     */
    public SysLog withParameter(String parameter) {
        this.setParameter(parameter);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.parameter
     *
     * @param parameter the value for sys_log.parameter
     *
     * @mbg.generated Thu Jun 01 14:45:55 CST 2017
     */
    public void setParameter(String parameter) {
        this.parameter = parameter == null ? null : parameter.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.ip
     *
     * @return the value of sys_log.ip
     *
     * @mbg.generated Thu Jun 01 14:45:55 CST 2017
     */
    public String getIp() {
        return ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_log
     *
     * @mbg.generated Thu Jun 01 14:45:55 CST 2017
     */
    public SysLog withIp(String ip) {
        this.setIp(ip);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.ip
     *
     * @param ip the value for sys_log.ip
     *
     * @mbg.generated Thu Jun 01 14:45:55 CST 2017
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_log.operate_time
     *
     * @return the value of sys_log.operate_time
     *
     * @mbg.generated Thu Jun 01 14:45:55 CST 2017
     */
    public Date getOperateTime() {
        return operateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_log
     *
     * @mbg.generated Thu Jun 01 14:45:55 CST 2017
     */
    public SysLog withOperateTime(Date operateTime) {
        this.setOperateTime(operateTime);
        return this;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_log.operate_time
     *
     * @param operateTime the value for sys_log.operate_time
     *
     * @mbg.generated Thu Jun 01 14:45:55 CST 2017
     */
    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }
}