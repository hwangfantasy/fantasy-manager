package com.fantasy.manager.dao;

import com.fantasy.manager.bean.SysLog;
import com.fantasy.manager.bean.SysLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_log
     *
     * @mbg.generated Wed May 31 16:05:44 CST 2017
     */
    long countByExample(SysLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_log
     *
     * @mbg.generated Wed May 31 16:05:44 CST 2017
     */
    int deleteByExample(SysLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_log
     *
     * @mbg.generated Wed May 31 16:05:44 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_log
     *
     * @mbg.generated Wed May 31 16:05:44 CST 2017
     */
    int insert(SysLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_log
     *
     * @mbg.generated Wed May 31 16:05:44 CST 2017
     */
    int insertSelective(SysLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_log
     *
     * @mbg.generated Wed May 31 16:05:44 CST 2017
     */
    List<SysLog> selectByExample(SysLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_log
     *
     * @mbg.generated Wed May 31 16:05:44 CST 2017
     */
    SysLog selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_log
     *
     * @mbg.generated Wed May 31 16:05:44 CST 2017
     */
    int updateByExampleSelective(@Param("record") SysLog record, @Param("example") SysLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_log
     *
     * @mbg.generated Wed May 31 16:05:44 CST 2017
     */
    int updateByExample(@Param("record") SysLog record, @Param("example") SysLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_log
     *
     * @mbg.generated Wed May 31 16:05:44 CST 2017
     */
    int updateByPrimaryKeySelective(SysLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_log
     *
     * @mbg.generated Wed May 31 16:05:44 CST 2017
     */
    int updateByPrimaryKey(SysLog record);
}