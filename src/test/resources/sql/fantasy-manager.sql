/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50714
Source Host           : localhost:3306
Source Database       : fantasy-manager

Target Server Type    : MYSQL
Target Server Version : 50714
File Encoding         : 65001

Date: 2017-05-31 16:04:15
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sys_log
-- ----------------------------
DROP TABLE IF EXISTS `sys_log`;
CREATE TABLE `sys_log` (
  `id` int(11) NOT NULL,
  `username` varchar(25) DEFAULT NULL COMMENT '用户名',
  `operation` varchar(25) DEFAULT NULL COMMENT '用户操作',
  `method` varchar(100) DEFAULT NULL COMMENT '请求方法',
  `parameter` varchar(255) DEFAULT NULL COMMENT '请求参数',
  `ip` varchar(20) DEFAULT NULL COMMENT 'ip地址',
  `operate_time` datetime DEFAULT NULL COMMENT '操作时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_log
-- ----------------------------

-- ----------------------------
-- Table structure for sys_resource
-- ----------------------------
DROP TABLE IF EXISTS `sys_resource`;
CREATE TABLE `sys_resource` (
  `id` int(11) NOT NULL COMMENT '资源id',
  `name` varchar(50) DEFAULT NULL COMMENT '资源名称',
  `type` smallint(1) DEFAULT NULL COMMENT '类型：1菜单，2按钮',
  `priority` int(2) DEFAULT NULL COMMENT '顺序优先级',
  `parent_id` int(11) DEFAULT NULL COMMENT '父权限id',
  `parent_ids` varchar(50) DEFAULT NULL COMMENT '父权限列表',
  `permission` varchar(255) DEFAULT NULL COMMENT '权限字符串',
  `available` tinyint(1) DEFAULT '1' COMMENT '是否可用',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_resource
-- ----------------------------

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `id` int(11) NOT NULL COMMENT '主键，角色id',
  `role` varchar(50) DEFAULT NULL COMMENT '角色名称',
  `description` varchar(100) DEFAULT NULL COMMENT '角色描述',
  `resource_ids` varchar(100) DEFAULT NULL COMMENT '拥有权限的资源',
  `available` tinyint(1) DEFAULT '1' COMMENT '是否可用',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_role
-- ----------------------------

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `username` varchar(100) DEFAULT NULL COMMENT '用户名',
  `password` varchar(100) DEFAULT NULL COMMENT '密码',
  `salt` varchar(50) DEFAULT NULL COMMENT '盐值',
  `role_ids` varchar(100) DEFAULT NULL COMMENT '角色列表',
  `phone` varchar(20) DEFAULT NULL COMMENT '手机号',
  `locked` tinyint(1) DEFAULT '0' COMMENT '账户是否锁定',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('1', 'admin', '5bd5e34f690351e3c62cd481964a11af', 'fc41e42ed873b99c2b46f7cbae596444', null, null, '0', '2017-05-27 16:43:41');
