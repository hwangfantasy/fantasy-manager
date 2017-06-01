/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50714
Source Host           : localhost:3306
Source Database       : fantasy-manager

Target Server Type    : MYSQL
Target Server Version : 50714
File Encoding         : 65001

Date: 2017-06-01 14:45:25
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for sys_log
-- ----------------------------
DROP TABLE IF EXISTS `sys_log`;
CREATE TABLE `sys_log` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `operate_user` varchar(25) DEFAULT NULL COMMENT '用户名',
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
-- Table structure for sys_permission
-- ----------------------------
DROP TABLE IF EXISTS `sys_permission`;
CREATE TABLE `sys_permission` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '资源id',
  `name` varchar(50) DEFAULT NULL COMMENT '模块名称',
  `type` smallint(1) DEFAULT NULL COMMENT '类型：1菜单，2按钮',
  `parent_id` int(11) DEFAULT NULL COMMENT '父权限id',
  `url` varchar(255) DEFAULT NULL COMMENT 'url',
  `permission` varchar(255) DEFAULT NULL COMMENT '权限字符串',
  `available` tinyint(1) DEFAULT '1' COMMENT '是否可用',
  `create_user` int(11) DEFAULT NULL COMMENT '创建者id',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `modify_user` int(11) DEFAULT NULL COMMENT '修改者id',
  `modify_time` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_permission
-- ----------------------------

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键，角色id',
  `role` varchar(50) DEFAULT NULL COMMENT '角色名称',
  `description` varchar(100) DEFAULT NULL COMMENT '角色描述',
  `available` tinyint(1) DEFAULT '1' COMMENT '是否可用',
  `create_user` int(11) DEFAULT NULL COMMENT '创建者id',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `modify_user` int(11) DEFAULT NULL COMMENT '修改者id',
  `modify_time` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_role
-- ----------------------------

-- ----------------------------
-- Table structure for sys_role_permission
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_permission`;
CREATE TABLE `sys_role_permission` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_id` int(11) DEFAULT NULL,
  `permission_id` int(11) DEFAULT NULL,
  `create_user` int(11) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `modify_user` int(11) DEFAULT NULL,
  `modify_time` datetime DEFAULT NULL,
  `available` tinyint(1) DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_role_permission
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
  `email` varchar(50) DEFAULT NULL COMMENT '邮箱',
  `locked` tinyint(1) DEFAULT '0' COMMENT '账户是否锁定',
  `create_user` int(11) DEFAULT NULL COMMENT '创建者id',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `modify_user` int(11) DEFAULT NULL COMMENT '修改者id',
  `modfiy_time` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('1', 'admin', '5bd5e34f690351e3c62cd481964a11af', 'fc41e42ed873b99c2b46f7cbae596444', null, '0', null, '2017-05-27 16:43:41', null, null);

-- ----------------------------
-- Table structure for sys_user_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_role`;
CREATE TABLE `sys_user_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `role_id` int(11) DEFAULT NULL,
  `create_user` int(11) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `modify_user` varchar(255) DEFAULT NULL,
  `modify_time` datetime DEFAULT NULL,
  `available` tinyint(1) DEFAULT '1',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user_role
-- ----------------------------
