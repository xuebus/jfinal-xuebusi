/*
Navicat MySQL Data Transfer

Source Server         : windows-localhost
Source Server Version : 50634
Source Host           : localhost:3306
Source Database       : jfinal_demo

Target Server Type    : MYSQL
Target Server Version : 50634
File Encoding         : 65001

Date: 2017-07-02 23:55:54
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(40) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `sex` int(11) DEFAULT NULL,
  `remark` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
