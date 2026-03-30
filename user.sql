/*
SQLyog Community v13.1.8 (64 bit)
MySQL - 8.0.18 : Database - ssm
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`ssm` /*!40100 DEFAULT CHARACTER SET utf8 */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `ssm`;

/*Table structure for table `t_clazz` */

DROP TABLE IF EXISTS `t_clazz`;

CREATE TABLE `t_clazz` (
  `clazz_id` varchar(10) NOT NULL COMMENT '班级id',
  `clazz_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '班级名称',
  `clazz_cremarks` varchar(100) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`clazz_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `t_clazz` */

insert  into `t_clazz`(`clazz_id`,`clazz_name`,`clazz_cremarks`) values 
('2001','20计算机1班','20计算机1班'),
('2101','21计算机1班','21计算机1班'),
('2201','22计算机1班','22计算机1班'),
('2202','22计算机2班','22计算机2班'),
('2203','22计算机3班','22计算机3班'),
('2204','22计算机4班','22计算机4班');

/*Table structure for table `t_clazz_course` */

DROP TABLE IF EXISTS `t_clazz_course`;

CREATE TABLE `t_clazz_course` (
  `c_id` varchar(20) NOT NULL COMMENT '课程编号',
  `clazz_id` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '班级编号',
  PRIMARY KEY (`c_id`,`clazz_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `t_clazz_course` */

insert  into `t_clazz_course`(`c_id`,`clazz_id`) values 
('CST_2218','2101'),
('CST_2813','2101'),
('CST_2813','2203'),
('CST_3210','2101'),
('CST_3210','2202'),
('CST_3210','2203'),
('CST_3210','2204'),
('CST_3221','2001'),
('CST_3814','2204'),
('CST_3827','2001');

/*Table structure for table `t_course` */

DROP TABLE IF EXISTS `t_course`;

CREATE TABLE `t_course` (
  `c_id` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '课程编号',
  `c_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '课程名称',
  `c_redit` int(10) NOT NULL COMMENT '课程学分',
  `c_hours` int(10) NOT NULL COMMENT '课程学时',
  PRIMARY KEY (`c_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `t_course` */

insert  into `t_course`(`c_id`,`c_name`,`c_redit`,`c_hours`) values 
('CST_2218','电子技术与数字电路',3,48),
('CST_2813','电子技术与数字电路实验',1,32),
('CST_3210','操作系统',3,48),
('CST_3221','javaweb开发框架',2,32),
('CST_3814','操作系统实验',1,32),
('CST_3827','javaweb开发框架实验',1,32);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
