/*
Navicat MySQL Data Transfer

Source Server         : MySql
Source Server Version : 50722
Source Host           : localhost:3306
Source Database       : mall

Target Server Type    : MYSQL
Target Server Version : 50722
File Encoding         : 65001

Date: 2020-02-23 15:16:19
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tbuser
-- ----------------------------
DROP TABLE IF EXISTS `tbuser`;
CREATE TABLE `tbuser` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL,
  `userpwd` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `createdate` date NOT NULL,
  `userstatus` int(255) NOT NULL,
  `role` int(255) NOT NULL,
  `image` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1030 DEFAULT CHARSET=utf8 ROW_FORMAT=REDUNDANT;

-- ----------------------------
-- Records of tbuser
-- ----------------------------
INSERT INTO `tbuser` VALUES ('1004', '霞霞', '123', '123@qq.com', '2019-04-30', '1', '1', '936d57572cb74c0181cc8a32df3b42c3');
INSERT INTO `tbuser` VALUES ('1005', '王五', '123', '123@qq.com', '2019-05-01', '0', '0', '79e9ea4ef0244cecb412e32cdf932760');
INSERT INTO `tbuser` VALUES ('1008', '刘四', '123456', '123@qq.com', '2019-05-01', '1', '1', null);
INSERT INTO `tbuser` VALUES ('1009', '王建林', '123', '456@qq.com', '2019-04-29', '1', '1', null);
INSERT INTO `tbuser` VALUES ('1010', '马化腾', '123', '123@qq.com', '2019-04-29', '1', '1', null);
INSERT INTO `tbuser` VALUES ('1011', '马建林', '123', '123@qq.com', '2019-05-01', '1', '1', null);
INSERT INTO `tbuser` VALUES ('1012', 'admin', '123456', '123@qq.com', '2019-05-10', '0', '0', null);
INSERT INTO `tbuser` VALUES ('1013', '李三', '123', '123@qq.com', '2019-05-01', '1', '1', null);
INSERT INTO `tbuser` VALUES ('1018', 'wqq', '123456', '1729625382@qq.com', '2019-06-04', '1', '1', null);
INSERT INTO `tbuser` VALUES ('1019', 'wewew', 'a123456', '1729625382@qq.com', '2019-06-01', '1', '1', '');
INSERT INTO `tbuser` VALUES ('1020', 'ddddd', 'a123456', '1729625382@qq.com', '2019-06-01', '1', '1', '');
INSERT INTO `tbuser` VALUES ('1021', 'wewaa', 'a123456', '1729625382@qq.com', '2019-06-01', '1', '1', '');
INSERT INTO `tbuser` VALUES ('1022', 'test', 'w123456', '1729625382@qq.com', '2019-06-01', '1', '1', '');
INSERT INTO `tbuser` VALUES ('1023', 'wwww', 'a123456', '1729625382@qq.com', '2019-06-01', '1', '1', '');
INSERT INTO `tbuser` VALUES ('1024', 'weweww', 'a1234567', '1729625382@qq.com', '2019-06-01', '1', '1', '');
INSERT INTO `tbuser` VALUES ('1026', 'wewr', 'a123456', '1729625382@qq.com', '2019-06-01', '1', '1', 'c8000b99f2dd4cbcb9cbef7954e85b36');
INSERT INTO `tbuser` VALUES ('1027', 'wq', 'a123456', '1729625382@qq.com', '2019-06-01', '1', '0', null);
INSERT INTO `tbuser` VALUES ('1028', '丽丽', 'z123456', '1729625382@qq.com', '2019-06-01', '1', '0', null);
INSERT INTO `tbuser` VALUES ('1029', 'wqwqw', 'a123456', '1729625382@qq.com', '2019-07-03', '1', '1', '5963066db0a14bc4918eaf3468889e17');
