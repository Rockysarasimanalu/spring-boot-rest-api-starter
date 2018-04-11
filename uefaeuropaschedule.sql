/*
SQLyog Community v12.5.1 (64 bit)
MySQL - 10.1.30-MariaDB : Database - uefaeuropaschedule
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`uefaeuropaschedule` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `uefaeuropaschedule`;

/*Table structure for table `hasil` */

DROP TABLE IF EXISTS `hasil`;

CREATE TABLE `hasil` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `hari` varchar(20) NOT NULL,
  `id_liga` int(11) NOT NULL,
  `tanggal` varchar(20) NOT NULL,
  `tim1` varchar(100) NOT NULL,
  `skor` varchar(20) NOT NULL,
  `tim2` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `hasil` */

insert  into `hasil`(`id`,`hari`,`id_liga`,`tanggal`,`tim1`,`skor`,`tim2`) values 
(1,'TUE',1,'2018-04-22','Chelsea','2-2','As Roma');

/*Table structure for table `liga` */

DROP TABLE IF EXISTS `liga`;

CREATE TABLE `liga` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nama` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*Data for the table `liga` */

insert  into `liga`(`id`,`nama`) values 
(1,'Inggris');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
