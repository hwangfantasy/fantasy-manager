/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50714
Source Host           : localhost:3306
Source Database       : fantasy-manager

Target Server Type    : MYSQL
Target Server Version : 50714
File Encoding         : 65001

Date: 2017-07-10 15:29:35
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
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_log
-- ----------------------------
INSERT INTO `sys_log` VALUES ('1', 'SYSTEM', '创建用户', 'com.fantasy.manager.controller.UserController.createUser()', '\"jackson\"', '127.0.0.1', '2017-06-30 15:35:38');

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
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_permission
-- ----------------------------
INSERT INTO `sys_permission` VALUES ('1', '用户管理', '1', '0', null, 'users:list', '1', '1', '2017-07-10 15:12:53', null, null);
INSERT INTO `sys_permission` VALUES ('2', '添加用户', '2', '1', null, 'users:add', '1', '1', '2017-07-10 15:12:56', null, null);
INSERT INTO `sys_permission` VALUES ('3', '删除用户', '2', '1', null, 'users:delete', '1', '1', '2017-07-10 15:12:59', null, null);
INSERT INTO `sys_permission` VALUES ('4', '禁用用户', '2', '1', null, 'users:disable', '1', '1', '2017-07-10 15:13:01', null, null);

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
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_role
-- ----------------------------
INSERT INTO `sys_role` VALUES ('1', 'ADMIN', '管理员', '1', '0', '2017-07-04 14:09:49', null, null);
INSERT INTO `sys_role` VALUES ('2', 'OPERATOR', '操作人员', '1', '1', '2017-07-04 14:11:21', null, null);
INSERT INTO `sys_role` VALUES ('3', 'NORMALUSER', '普通用户', '1', '1', '2017-07-04 14:11:49', null, null);

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
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_role_permission
-- ----------------------------
INSERT INTO `sys_role_permission` VALUES ('1', '1', '1', '1', '2017-07-10 15:12:30', null, null, '1');
INSERT INTO `sys_role_permission` VALUES ('2', '1', '2', '1', '2017-07-10 15:12:33', null, null, '1');
INSERT INTO `sys_role_permission` VALUES ('3', '1', '3', '1', '2017-07-10 15:12:36', null, null, '1');
INSERT INTO `sys_role_permission` VALUES ('4', '1', '4', '1', '2017-07-10 15:12:39', null, null, '1');

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
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES ('1', 'admin', '2e6418dc549dc867dfb88094ec4cc16b', '0977f3f881cbb24ce1a5522c90f194e2', null, '0', null, '2017-06-30 15:20:06', null, null);
INSERT INTO `sys_user` VALUES ('2', 'hwangfantasy', '51960d29e22b4ef49c1b0da955a66f85', '882bad6594fa3311fc22d7a069bfe5b1', null, '0', null, '2017-06-30 15:22:01', null, null);
INSERT INTO `sys_user` VALUES ('3', 'jackson', '5492150479f160d87f44756c2bd385d5', 'd0d812ebe570f5c4d9ea359e4ee979fb', null, '0', null, '2017-06-30 15:35:38', null, null);

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
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user_role
-- ----------------------------
INSERT INTO `sys_user_role` VALUES ('1', '1', '1', '0', '2017-07-04 14:12:15', null, null, '1');
INSERT INTO `sys_user_role` VALUES ('2', '2', '2', '1', '2017-07-04 14:12:25', null, null, '1');
INSERT INTO `sys_user_role` VALUES ('3', '2', '2', '1', '2017-07-04 14:12:34', null, null, '1');
