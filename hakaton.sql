/*
SQLyog Community v12.09 (64 bit)
MySQL - 5.6.17 : Database - hakaton
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`hakaton` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_croatian_ci */;

USE `hakaton`;

/*Table structure for table `mesto` */

DROP TABLE IF EXISTS `mesto`;

CREATE TABLE `mesto` (
  `mestoId` bigint(20) NOT NULL,
  `ustanovaId` bigint(20) NOT NULL,
  `rezervacija` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`mestoId`,`ustanovaId`),
  KEY `ustanovaId` (`ustanovaId`),
  CONSTRAINT `mesto_ibfk_1` FOREIGN KEY (`ustanovaId`) REFERENCES `ustanova` (`ustanovaId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_croatian_ci;

/*Data for the table `mesto` */

insert  into `mesto`(`mestoId`,`ustanovaId`,`rezervacija`) values (1,1,1),(1,2,1),(1,3,0),(1,4,0),(1,5,0),(1,6,0),(1,7,0),(1,8,0),(1,9,0),(1,10,0),(1,11,0),(1,12,0),(1,13,0),(1,14,0),(1,15,0),(1,16,0),(1,17,0),(2,1,1),(2,2,0),(2,3,0),(2,4,0),(2,5,0),(2,6,0),(2,7,0),(2,8,0),(2,9,0),(2,10,0),(2,11,0),(2,12,0),(2,13,0),(2,14,0),(2,15,0),(2,16,0),(2,17,0),(3,1,0),(3,2,0),(3,3,0),(3,4,0),(3,5,0),(3,6,0),(3,7,0),(3,8,0),(3,9,0),(3,10,0),(3,11,0),(3,12,0),(3,13,0),(3,14,0),(3,15,0),(3,16,0),(3,17,0),(4,1,0),(4,2,0),(4,3,0),(4,4,0),(4,5,0),(4,6,0),(4,7,0),(4,8,0),(4,9,0),(4,10,0),(4,11,0),(4,12,0),(4,13,0),(4,14,0),(4,15,0),(4,16,0),(4,17,0),(5,1,0),(5,2,0),(5,3,0),(5,4,0),(5,5,0),(5,6,0),(5,7,0),(5,8,0),(5,9,0),(5,10,0),(5,11,0),(5,12,0),(5,13,0),(5,14,0),(5,15,0),(5,16,0),(5,17,0),(6,1,0),(6,2,0),(6,3,0),(6,4,0),(6,5,0),(6,6,0),(6,7,0),(6,8,0),(6,9,0),(6,10,0),(6,11,0),(6,12,0),(6,13,0),(6,14,0),(6,15,0),(6,16,0),(6,17,0),(7,1,0),(7,2,0),(7,3,0),(7,4,0),(7,5,0),(7,6,0),(7,7,0),(7,8,0),(7,9,0),(7,10,0),(7,11,0),(7,12,0),(7,13,0),(7,14,0),(7,15,0),(7,16,0),(7,17,0),(8,1,0),(8,2,0),(8,3,0),(8,4,0),(8,5,0),(8,6,0),(8,7,0),(8,8,0),(8,9,0),(8,10,0),(8,11,0),(8,12,0),(8,13,0),(8,14,0),(8,15,0),(8,16,0),(8,17,0),(9,1,0),(9,2,0),(9,3,0),(9,4,0),(9,5,0),(9,6,0),(9,7,0),(9,8,0),(9,9,0),(9,10,0),(9,11,0),(9,12,0),(9,13,0),(9,14,0),(9,15,0),(9,16,0),(9,17,0),(10,1,0),(10,2,0),(10,3,0),(10,4,0),(10,5,0),(10,6,0),(10,7,0),(10,8,0),(10,9,0),(10,10,0),(10,11,0),(10,12,0),(10,13,0),(10,14,0),(10,15,0),(10,16,0),(10,17,0),(11,1,0),(11,2,0),(11,3,0),(11,4,0),(11,5,0),(11,6,0),(11,7,0),(11,8,0),(11,9,0),(11,10,0),(11,11,0),(11,12,0),(11,13,0),(11,14,0),(11,15,0),(11,16,0),(11,17,0),(12,1,0),(12,2,0),(12,3,0),(12,4,0),(12,5,0),(12,6,0),(12,7,0),(12,8,0),(12,9,0),(12,10,0),(12,11,0),(12,12,0),(12,13,0),(12,14,0),(12,15,0),(12,16,0),(12,17,0),(13,1,0),(13,2,0),(13,3,0),(13,4,0),(13,5,0),(13,6,0),(13,7,0),(13,8,0),(13,9,0),(13,10,0),(13,11,0),(13,12,0),(13,13,0),(13,14,0),(13,15,0),(13,16,0),(13,17,0),(14,1,0),(14,2,0),(14,3,0),(14,4,0),(14,5,0),(14,6,0),(14,7,0),(14,8,0),(14,9,0),(14,10,0),(14,11,0),(14,12,0),(14,13,0),(14,14,0),(14,15,0),(14,16,0),(14,17,0),(15,1,0),(15,2,0),(15,3,0),(15,4,0),(15,5,0),(15,6,0),(15,7,0),(15,8,0),(15,9,0),(15,10,0),(15,11,0),(15,12,0),(15,13,0),(15,14,0),(15,15,0),(15,16,0),(15,17,0),(16,1,0),(16,2,0),(16,3,0),(16,4,0),(16,5,0),(16,6,0),(16,7,0),(16,8,0),(16,9,0),(16,10,0),(16,11,0),(16,12,0),(16,13,0),(16,14,0),(16,15,0),(16,16,0),(16,17,0),(17,1,0),(17,2,0),(17,3,0),(17,4,0),(17,5,0),(17,6,0),(17,7,0),(17,8,0),(17,9,0),(17,10,0),(17,11,0),(17,12,0),(17,13,0),(17,14,0),(17,15,0),(17,16,0),(17,17,0),(18,1,0),(18,2,0),(18,3,0),(18,4,0),(18,5,0),(18,6,0),(18,7,0),(18,8,0),(18,9,0),(18,10,0),(18,11,0),(18,12,0),(18,13,0),(18,14,0),(18,15,0),(18,16,0),(18,17,0),(19,1,0),(19,2,0),(19,3,0),(19,4,0),(19,5,0),(19,6,0),(19,7,0),(19,8,0),(19,9,0),(19,10,0),(19,11,0),(19,12,0),(19,13,0),(19,14,0),(19,15,0),(19,16,0),(19,17,0),(20,1,0),(20,2,0),(20,3,0),(20,4,0),(20,5,0),(20,6,0),(20,7,0),(20,8,0),(20,9,0),(20,10,0),(20,11,0),(20,12,0),(20,13,0),(20,14,0),(20,15,0),(20,16,0),(20,17,0),(21,1,0),(21,2,0),(21,3,0),(21,4,0),(21,5,0),(21,6,0),(21,7,0),(21,8,0),(21,9,0),(21,10,0),(21,11,0),(21,12,0),(21,13,0),(21,14,0),(21,15,0),(21,16,0),(21,17,0),(22,1,0),(22,2,0),(22,3,0),(22,4,0),(22,5,0),(22,6,0),(22,7,0),(22,8,0),(22,9,0),(22,10,0),(22,11,0),(22,12,0),(22,13,0),(22,14,0),(22,15,0),(22,16,0),(22,17,0),(23,1,0),(23,2,0),(23,3,0),(23,4,0),(23,5,0),(23,6,0),(23,7,0),(23,8,0),(23,9,0),(23,10,0),(23,11,0),(23,12,0),(23,13,0),(23,14,0),(23,15,0),(23,16,0),(23,17,0),(24,1,0),(24,2,0),(24,3,0),(24,4,0),(24,5,0),(24,6,0),(24,7,0),(24,8,0),(24,9,0),(24,10,0),(24,11,0),(24,12,0),(24,13,0),(24,14,0),(24,15,0),(24,16,0),(24,17,0),(25,1,0),(25,2,0),(25,3,0),(25,4,0),(25,5,0),(25,6,0),(25,7,0),(25,8,0),(25,9,0),(25,10,0),(25,11,0),(25,12,0),(25,13,0),(25,14,0),(25,15,0),(25,16,0),(25,17,0),(26,1,0),(26,2,0),(26,3,0),(26,4,0),(26,5,0),(26,6,0),(26,7,0),(26,8,0),(26,9,0),(26,10,0),(26,11,0),(26,12,0),(26,13,0),(26,14,0),(26,15,0),(26,16,0),(26,17,0),(27,1,0),(27,2,0),(27,3,0),(27,4,0),(27,5,0),(27,6,0),(27,7,0),(27,8,0),(27,9,0),(27,10,0),(27,11,0),(27,12,0),(27,13,0),(27,14,0),(27,15,0),(27,16,0),(27,17,0),(28,1,0),(28,2,0),(28,3,0),(28,4,0),(28,5,0),(28,6,0),(28,7,0),(28,8,0),(28,9,0),(28,10,0),(28,11,0),(28,12,0),(28,13,0),(28,14,0),(28,15,0),(28,16,0),(28,17,0),(29,1,0),(29,2,0),(29,3,0),(29,4,0),(29,5,0),(29,6,0),(29,7,0),(29,8,0),(29,9,0),(29,10,0),(29,11,0),(29,12,0),(29,13,0),(29,14,0),(29,15,0),(29,16,0),(29,17,0),(30,1,0),(30,2,0),(30,3,0),(30,4,0),(30,5,0),(30,6,0),(30,7,0),(30,8,0),(30,9,0),(30,10,0),(30,11,0),(30,12,0),(30,13,0),(30,14,0),(30,15,0),(30,16,0),(30,17,0),(31,1,0),(31,2,0),(31,3,0),(31,4,0),(31,5,0),(31,6,0),(31,7,0),(31,8,0),(31,9,0),(31,10,0),(31,11,0),(31,12,0),(31,13,0),(31,14,0),(31,15,0),(31,16,0),(31,17,0),(32,1,0),(32,2,0),(32,3,0),(32,4,0),(32,5,0),(32,6,0),(32,7,0),(32,8,0),(32,9,0),(32,10,0),(32,11,0),(32,12,0),(32,13,0),(32,14,0),(32,15,0),(32,16,0),(32,17,0),(33,1,0),(33,2,0),(33,3,0),(33,4,0),(33,5,0),(33,6,0),(33,7,0),(33,8,0),(33,9,0),(33,10,0),(33,11,0),(33,12,0),(33,13,0),(33,14,0),(33,15,0),(33,16,0),(33,17,0),(34,1,0),(34,2,0),(34,3,0),(34,4,0),(34,5,0),(34,6,0),(34,7,0),(34,8,0),(34,9,0),(34,10,0),(34,11,0),(34,12,0),(34,13,0),(34,14,0),(34,15,0),(34,16,0),(34,17,0),(35,1,0),(35,2,0),(35,3,0),(35,4,0),(35,5,0),(35,6,0),(35,7,0),(35,8,0),(35,9,0),(35,10,0),(35,11,0),(35,12,0),(35,13,0),(35,14,0),(35,15,0),(35,16,0),(35,17,0),(36,1,0),(36,2,0),(36,3,0),(36,4,0),(36,5,0),(36,6,0),(36,7,0),(36,8,0),(36,9,0),(36,10,0),(36,11,0),(36,12,0),(36,13,0),(36,14,0),(36,15,0),(36,16,0),(37,1,0),(37,2,0),(37,3,0),(37,4,0),(37,5,0),(37,6,0),(37,7,0),(37,8,0),(37,9,0),(37,10,0),(37,11,0),(37,12,0),(37,13,0),(37,14,0),(37,15,0),(37,16,0),(38,1,0),(38,2,0),(38,3,0),(38,4,0),(38,5,0),(38,6,0),(38,7,0),(38,8,0),(38,9,0),(38,10,0),(38,11,0),(38,12,0),(38,13,0),(38,14,0),(38,15,0),(38,16,0),(39,1,0),(39,2,0),(39,3,0),(39,4,0),(39,5,0),(39,6,0),(39,7,0),(39,8,0),(39,9,0),(39,10,0),(39,11,0),(39,12,0),(39,13,0),(39,14,0),(39,15,0),(39,16,0),(40,1,0),(40,2,0),(40,3,0),(40,4,0),(40,5,0),(40,6,0),(40,7,0),(40,8,0),(40,9,0),(40,10,0),(40,11,0),(40,12,0),(40,13,0),(40,14,0),(40,15,0),(40,16,0),(41,1,0),(41,2,0),(41,3,0),(41,5,0),(41,6,0),(41,7,0),(41,8,0),(41,9,0),(41,10,0),(41,11,0),(41,12,0),(41,13,0),(41,14,0),(41,15,0),(41,16,0),(42,1,0),(42,2,0),(42,3,0),(42,5,0),(42,6,0),(42,7,0),(42,8,0),(42,9,0),(42,10,0),(42,11,0),(42,12,0),(42,13,0),(42,14,0),(42,15,0),(42,16,0),(43,1,0),(43,2,0),(43,3,0),(43,5,0),(43,6,0),(43,7,0),(43,8,0),(43,9,0),(43,10,0),(43,11,0),(43,12,0),(43,13,0),(43,14,0),(43,15,0),(43,16,0),(44,1,0),(44,2,0),(44,3,0),(44,5,0),(44,6,0),(44,7,0),(44,8,0),(44,9,0),(44,10,0),(44,11,0),(44,12,0),(44,13,0),(44,14,0),(44,15,0),(44,16,0),(45,1,0),(45,2,0),(45,3,0),(45,5,0),(45,6,0),(45,7,0),(45,8,0),(45,9,0),(45,10,0),(45,11,0),(45,12,0),(45,13,0),(45,14,0),(45,15,0),(45,16,0),(46,1,0),(46,2,0),(46,3,0),(46,5,0),(46,7,0),(46,8,0),(46,9,0),(46,10,0),(46,11,0),(46,12,0),(46,13,0),(46,14,0),(46,15,0),(46,16,0),(47,1,0),(47,2,0),(47,3,0),(47,5,0),(47,7,0),(47,8,0),(47,9,0),(47,10,0),(47,11,0),(47,12,0),(47,13,0),(47,14,0),(47,15,0),(47,16,0),(48,1,0),(48,2,0),(48,3,0),(48,5,0),(48,7,0),(48,8,0),(48,9,0),(48,10,0),(48,11,0),(48,12,0),(48,13,0),(48,14,0),(48,15,0),(48,16,0),(49,1,0),(49,2,0),(49,3,0),(49,5,0),(49,7,0),(49,8,0),(49,9,0),(49,10,0),(49,11,0),(49,12,0),(49,13,0),(49,14,0),(49,15,0),(49,16,0),(50,1,0),(50,2,0),(50,3,0),(50,5,0),(50,7,0),(50,8,0),(50,9,0),(50,10,0),(50,11,0),(50,12,0),(50,13,0),(50,14,0),(50,15,0),(50,16,0),(51,2,0),(51,3,0),(51,5,0),(51,7,0),(51,8,0),(51,9,0),(51,10,0),(51,11,0),(51,12,0),(51,13,0),(51,14,0),(51,15,0),(51,16,0),(52,2,0),(52,3,0),(52,5,0),(52,7,0),(52,8,0),(52,9,0),(52,10,0),(52,11,0),(52,12,0),(52,13,0),(52,14,0),(52,15,0),(52,16,0),(53,2,0),(53,3,0),(53,5,0),(53,7,0),(53,8,0),(53,9,0),(53,10,0),(53,11,0),(53,12,0),(53,13,0),(53,14,0),(53,15,0),(53,16,0),(54,2,0),(54,3,0),(54,5,0),(54,7,0),(54,8,0),(54,9,0),(54,10,0),(54,11,0),(54,12,0),(54,13,0),(54,14,0),(54,15,0),(54,16,0),(55,2,0),(55,3,0),(55,5,0),(55,7,0),(55,8,0),(55,9,0),(55,10,0),(55,11,0),(55,12,0),(55,13,0),(55,14,0),(55,15,0),(55,16,0),(56,2,0),(56,3,0),(56,5,0),(56,7,0),(56,8,0),(56,9,0),(56,10,0),(56,11,0),(56,12,0),(56,13,0),(56,14,0),(56,15,0),(56,16,0),(57,2,0),(57,3,0),(57,5,0),(57,7,0),(57,8,0),(57,9,0),(57,10,0),(57,11,0),(57,12,0),(57,13,0),(57,14,0),(57,15,0),(57,16,0),(58,2,0),(58,3,0),(58,5,0),(58,7,0),(58,8,0),(58,9,0),(58,10,0),(58,11,0),(58,12,0),(58,13,0),(58,14,0),(58,15,0),(58,16,0),(59,2,0),(59,3,0),(59,5,0),(59,7,0),(59,8,0),(59,9,0),(59,10,0),(59,11,0),(59,12,0),(59,13,0),(59,14,0),(59,15,0),(59,16,0),(60,2,0),(60,3,0),(60,5,0),(60,7,0),(60,8,0),(60,9,0),(60,10,0),(60,11,0),(60,12,0),(60,13,0),(60,14,0),(60,15,0),(60,16,0),(61,2,0),(61,3,0),(61,5,0),(61,7,0),(61,8,0),(61,9,0),(61,10,0),(61,11,0),(61,12,0),(61,13,0),(61,14,0),(61,15,0),(61,16,0),(62,2,0),(62,3,0),(62,5,0),(62,7,0),(62,8,0),(62,9,0),(62,10,0),(62,11,0),(62,12,0),(62,13,0),(62,15,0),(62,16,0),(63,2,0),(63,3,0),(63,5,0),(63,7,0),(63,8,0),(63,9,0),(63,10,0),(63,11,0),(63,12,0),(63,13,0),(63,15,0),(63,16,0),(64,2,0),(64,3,0),(64,5,0),(64,7,0),(64,8,0),(64,9,0),(64,10,0),(64,11,0),(64,12,0),(64,13,0),(64,15,0),(64,16,0),(65,2,0),(65,3,0),(65,5,0),(65,7,0),(65,8,0),(65,9,0),(65,10,0),(65,11,0),(65,12,0),(65,13,0),(65,15,0),(66,2,0),(66,3,0),(66,5,0),(66,7,0),(66,8,0),(66,9,0),(66,10,0),(66,11,0),(66,12,0),(66,13,0),(66,15,0),(67,2,0),(67,3,0),(67,5,0),(67,7,0),(67,8,0),(67,9,0),(67,11,0),(67,12,0),(67,13,0),(67,15,0),(68,3,0),(68,5,0),(68,7,0),(68,8,0),(68,9,0),(68,11,0),(68,12,0),(68,13,0),(68,15,0),(69,3,0),(69,5,0),(69,7,0),(69,8,0),(69,9,0),(69,11,0),(69,12,0),(69,13,0),(69,15,0),(70,3,0),(70,5,0),(70,7,0),(70,8,0),(70,9,0),(70,11,0),(70,12,0),(70,13,0),(70,15,0),(71,3,0),(71,7,0),(71,8,0),(71,9,0),(71,11,0),(71,12,0),(71,13,0),(71,15,0),(72,3,0),(72,7,0),(72,8,0),(72,9,0),(72,11,0),(72,12,0),(72,13,0),(72,15,0),(73,3,0),(73,7,0),(73,8,0),(73,9,0),(73,11,0),(73,12,0),(73,13,0),(73,15,0),(74,3,0),(74,7,0),(74,8,0),(74,9,0),(74,11,0),(74,12,0),(74,13,0),(74,15,0),(75,3,0),(75,7,0),(75,8,0),(75,9,0),(75,11,0),(75,12,0),(75,13,0),(75,15,0),(76,3,0),(76,7,0),(76,8,0),(76,9,0),(76,11,0),(76,12,0),(76,13,0),(76,15,0),(77,3,0),(77,7,0),(77,8,0),(77,9,0),(77,11,0),(77,12,0),(77,13,0),(77,15,0),(78,3,0),(78,7,0),(78,8,0),(78,11,0),(78,12,0),(78,13,0),(78,15,0),(79,3,0),(79,7,0),(79,8,0),(79,11,0),(79,12,0),(79,13,0),(80,3,0),(80,7,0),(80,8,0),(80,11,0),(80,12,0),(81,3,0),(81,7,0),(81,8,0),(81,11,0),(81,12,0),(82,3,0),(82,7,0),(82,8,0),(82,11,0),(82,12,0),(83,3,0),(83,7,0),(83,8,0),(83,11,0),(83,12,0),(84,3,0),(84,7,0),(84,8,0),(84,11,0),(84,12,0),(85,3,0),(85,7,0),(85,8,0),(85,11,0),(85,12,0),(86,3,0),(86,7,0),(86,8,0),(86,11,0),(86,12,0),(87,3,0),(87,7,0),(87,8,0),(87,11,0),(88,3,0),(88,7,0),(88,8,0),(88,11,0),(89,3,0),(89,7,0),(89,8,0),(89,11,0),(90,3,0),(90,7,0),(90,11,0),(91,3,0),(91,7,0),(91,11,0),(92,3,0),(92,7,0),(92,11,0),(93,3,0),(93,7,0),(93,11,0),(94,3,0),(94,7,0),(94,11,0),(95,3,0),(95,7,0),(95,11,0),(96,3,0),(96,7,0),(96,11,0),(97,3,0),(97,7,0),(97,11,0),(98,3,0),(98,7,0),(98,11,0),(99,3,0),(99,7,0),(100,3,0),(100,7,0),(101,3,0),(101,7,0),(102,3,0),(102,7,0),(103,7,0),(104,7,0),(105,7,0),(106,7,0),(107,7,0),(108,7,0),(109,7,0),(110,7,0),(111,7,0),(112,7,0),(113,7,0),(114,7,0),(115,7,0),(116,7,0),(117,7,0),(118,7,0),(119,7,0),(120,7,0);

/*Table structure for table `student` */

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `studentId` bigint(20) NOT NULL,
  `ime` varchar(255) COLLATE utf8_croatian_ci NOT NULL,
  `prezime` varchar(255) COLLATE utf8_croatian_ci DEFAULT NULL,
  `email` varchar(255) COLLATE utf8_croatian_ci DEFAULT NULL,
  `password` varchar(255) COLLATE utf8_croatian_ci DEFAULT NULL,
  `token` varchar(255) COLLATE utf8_croatian_ci DEFAULT NULL,
  `poeni` int(11) DEFAULT NULL,
  PRIMARY KEY (`studentId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_croatian_ci;

/*Data for the table `student` */

insert  into `student`(`studentId`,`ime`,`prezime`,`email`,`password`,`token`,`poeni`) values (1,'sdfs','fsdfs','mare','mare','TOKEN##1',155),(2,'adfsa','fssdaf','ogi','ogi','TOKEN##2',50);

/*Table structure for table `student_mesto` */

DROP TABLE IF EXISTS `student_mesto`;

CREATE TABLE `student_mesto` (
  `studentId` bigint(20) NOT NULL,
  `mestoId` bigint(20) NOT NULL,
  `ustanovaId` bigint(20) NOT NULL,
  `pin` varchar(4) COLLATE utf8_croatian_ci DEFAULT NULL,
  PRIMARY KEY (`studentId`,`mestoId`,`ustanovaId`),
  KEY `mestoId` (`mestoId`,`ustanovaId`),
  CONSTRAINT `student_mesto_ibfk_1` FOREIGN KEY (`studentId`) REFERENCES `student` (`studentId`),
  CONSTRAINT `student_mesto_ibfk_2` FOREIGN KEY (`mestoId`, `ustanovaId`) REFERENCES `mesto` (`mestoId`, `ustanovaId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_croatian_ci;

/*Data for the table `student_mesto` */

insert  into `student_mesto`(`studentId`,`mestoId`,`ustanovaId`,`pin`) values (1,2,1,'4485');

/*Table structure for table `ustanova` */

DROP TABLE IF EXISTS `ustanova`;

CREATE TABLE `ustanova` (
  `ustanovaId` bigint(20) NOT NULL,
  `naziv` varchar(255) COLLATE utf8_croatian_ci DEFAULT NULL,
  `longitude` varchar(255) COLLATE utf8_croatian_ci DEFAULT NULL,
  `latitude` varchar(255) COLLATE utf8_croatian_ci DEFAULT NULL,
  `brojMesta` int(11) DEFAULT NULL,
  `opis` varchar(10000) COLLATE utf8_croatian_ci DEFAULT NULL,
  PRIMARY KEY (`ustanovaId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_croatian_ci;

/*Data for the table `ustanova` */

insert  into `ustanova`(`ustanovaId`,`naziv`,`longitude`,`latitude`,`brojMesta`,`opis`) values (1,'Faculty of Organizational Sciences','20.4699775','44.7690486',50,'Faculty of Organizational Sciences is higher education institution, part of University of Belgrade, which deals with education, scientific research and consultancy through development of knowledge and skills in management, information system and technology with aim to enable future professionals to develop potentials of commerce and society.'),(2,'4. April','20.4802767','44.763549',67,'Students hall \"4. april\" is situated on VoÅ¾dovac, near ,\"FON\", \"FPN\", \"ViÅ¡a elektrotehniÄka Å¡kola\", \"SaobraÄ‡ajni fakultet\" and \"Farmacetski fakultet\". It was built in 1965 and accommodates 857 students in double and triple rooms, arranged in the 1st category block A and 2nd category block B.'),(3,'Karaburma','20.4863048','44.814041',102,'\"Karaburma\" students hall of residence is the newest and the second largest hall of the Student`s Centre \"Belgrade\". It was built in 1978. \"Karaburma\" is a hall filled with all kinds of contents, and it is visited by 10 000 people each month.'),(4,'Rifat Burdzevic','20.5048817','44.7967533',40,'Students hall \"Rifat BurdÅ¾eviÄ‡\" (1948) is the first hall that was built after the Second World War. It consists of a two-storey building where men\'s room is located on the first floor, and female on the second. Foreign students, who regularly attend classes in our schools or have come for a shorter period than student exchange, are accommodated in a separate wing.'),(5,'Faculty of Economics','20.4526224','44.8119221',70,'The Faculty of Economics at the University of Belgrade is an educational and scientific institution heading to its 70 th anniversary. Today, the Faculty of Economics is the biggest and the most prominent scientific and educational institution in the country in the field of economic sciences.'),(6,'Faculty of Law','20.4704468','44.807258',45,'The Faculty of Law, established in 1808 as part of the University of Belgrade, is one of the largest law faculties in the region, with a long tradition of being in the forefront of the country\'s legal education. At present there are about eight thousand students enrolled in the undergraduate studies.'),(7,'Faculty of Ortodox Theology','20.4190818','44.7823791',120,'Today there are more than 1.800 young men and women who are studying at the Faculty of Orthodox Theology preparing themselves for priesthood, a teaching career, or scientific research in the field of theology.The program of basic studies represents a combination of theoretical and applied learning.'),(8,'Teachers Training Faculty','20.4597687','44.8086046',89,'On 9th October 1997. the first students have graduated from the Teachersâ€™ Training Faculty in Belgrade. Faculty provides postgraduate, graduate and specialization studies in the didactic-methodical science.'),(9,'Faculty of Security','20.4767614','44.79134',77,'The Faculty of Security Studies is a graduate-level member institution of the University of Belgrade and belongs to the group of the humanities faculties. Within its core activity â€“ the security studies, the Faculty offers basic academic and undergraduate studies, Master degree studies, doctoral, and specialist undergraduate studies, as well as professional training and education.'),(10,'Faculty for Special Education and Rehabilitation','20.4538017','44.8262872',66,'More than three decades of the Faculty, is a guarantee of quality in the development of special education theory and practice. Progress has been made in the process of improving quality of education students, future professionals to work in special education and rehabilitation of children with disabilities and the treatment of persons with behavioral disorders.'),(11,'Faculty of Political Sciences','20.4731446','44.7737468',98,'The Faculty focuses on education and research in the fields of political science, international relations, journalism and communication studies, and social policy and social work. The Faculty offers undergraduate, MA and PhD programmes, as well as advanced professional development programmes.'),(12,'Faculty of Mathematics','20.4571263','44.8195164',86,'Teaching and research activities are performed by more than 100 teachers and assistants with about 2000 students on undergraduate and postgraduate studies today. There are 3 academic programs today: Mathematics, Informatics and Astronomy and Astrophysics.'),(13,'Faculty of Philology','20.4546181','44.8189249',79,'Faculty of Philology became an independent educational and research institution from the Faculty of Philosophy School 1960/61. year. Today, the Faculty of Philology has 15 nominal Department.'),(14,'Faculty of Pharmacy','20.4938498','44.7475124',61,'Beside activities in higher education sector, Faculty of Pharmacy engages in educational, scientific, health care, professional and business projects, and library and museum activities. '),(15,'Faculty of Philosophy','20.455749','44.8179962',78,'The Faculty of Philosophy is the oldest Faculty at the University of Belgrade in Belgrade. Today, the Faculty of Philosophy is a modern institution of higher education that follows all current trends in educational systems across the globe.'),(16,'Faculty of Veterinary Medicine','20.4629909','44.7942301',64,'Faculty changed the name in 1998, since then it has been the official name of Veterinary Medicine, where basic studies organized in the framework of two departments: veterinary medicine and hygiene and technology of food of animal origin. '),(17,'Faculty of Sports and Physical Education','20.4260796','44.7633679',35,'Starting from the fact that higher education is the basis of development and economic progress of society based on knowledge, promoting human rights and fundamental freedoms, the mission of the Faculty is to provide the highest academic standards and provide the knowledge and skills in line with the projected needs of society and national development. ');

/* Procedure structure for procedure `nesto` */

/*!50003 DROP PROCEDURE IF EXISTS  `nesto` */;

DELIMITER $$

/*!50003 CREATE DEFINER=`mare`@`localhost` PROCEDURE `nesto`(brojUstanove INT, brojMesta INT)
BEGIN
	DECLARE v1 INT DEFAULT 1;
	
	WHILE v1 <= brojMesta DO
		INSERT INTO mesto VALUES (v1, brojUstanove, 0);
		SET v1 = v1 + 1;
	END WHILE;
    END */$$
DELIMITER ;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
