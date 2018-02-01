/*
Navicat MySQL Data Transfer

Source Server         : native_mysql
Source Server Version : 50558
Source Host           : localhost:3306
Source Database       : blog_test

Target Server Type    : MYSQL
Target Server Version : 50558
File Encoding         : 65001

Date: 2018-02-01 17:15:46
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for blog_user
-- ----------------------------
DROP TABLE IF EXISTS `blog_user`;
CREATE TABLE `blog_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(255) DEFAULT NULL,
  `pwd` varchar(255) DEFAULT NULL,
  `iphone` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;
