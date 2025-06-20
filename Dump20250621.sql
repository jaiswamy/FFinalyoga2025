-- MySQL dump 10.13  Distrib 5.6.23, for Win64 (x86_64)
--
-- Host: localhost    Database: db_inosurya
-- ------------------------------------------------------
-- Server version	5.6.22-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `address`
--

DROP TABLE IF EXISTS `address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `address` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `version` bigint(20) NOT NULL,
  `city` varchar(255) DEFAULT NULL,
  `country` varchar(255) DEFAULT NULL,
  `hsno` varchar(255) DEFAULT NULL,
  `pin_code` varchar(255) DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL,
  `street` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `address`
--

LOCK TABLES `address` WRITE;
/*!40000 ALTER TABLE `address` DISABLE KEYS */;
/*!40000 ALTER TABLE `address` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `admin` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `version` bigint(20) NOT NULL,
  `address_id` bigint(20) DEFAULT NULL,
  `date_created` datetime DEFAULT NULL,
  `last_updated` datetime DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `phone_no` varchar(255) DEFAULT NULL,
  `profile_pic_id` bigint(20) DEFAULT NULL,
  `sms_password` varchar(255) DEFAULT NULL,
  `sms_sender_id` varchar(255) DEFAULT NULL,
  `sms_username` varchar(255) DEFAULT NULL,
  `user_id_id` bigint(20) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_hribgo0kw00r7vvaw39vjx0cq` (`address_id`),
  KEY `FK_bqq4bu608oxckso8scyqv0p2y` (`profile_pic_id`),
  KEY `FK_srrkly0y7bt6n8h3l6mh5ua0t` (`user_id_id`),
  CONSTRAINT `FK_bqq4bu608oxckso8scyqv0p2y` FOREIGN KEY (`profile_pic_id`) REFERENCES `images` (`id`),
  CONSTRAINT `FK_hribgo0kw00r7vvaw39vjx0cq` FOREIGN KEY (`address_id`) REFERENCES `address` (`id`),
  CONSTRAINT `FK_srrkly0y7bt6n8h3l6mh5ua0t` FOREIGN KEY (`user_id_id`) REFERENCES `sec_user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `comman_users`
--

DROP TABLE IF EXISTS `comman_users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `comman_users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `version` bigint(20) NOT NULL,
  `address_id` bigint(20) DEFAULT NULL,
  `date_created` datetime DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `last_updated` datetime DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `phone_no` varchar(255) DEFAULT NULL,
  `profile_pic_id` bigint(20) DEFAULT NULL,
  `sms_password` varchar(255) DEFAULT NULL,
  `sms_sender_id` varchar(255) DEFAULT NULL,
  `sms_username` varchar(255) DEFAULT NULL,
  `user_id_id` bigint(20) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_o69qwvnhiy577jr55uyvxc4fb` (`address_id`),
  KEY `FK_lcks1kjaf10ckh8vyf2yurnk0` (`profile_pic_id`),
  KEY `FK_9lehq2efnkw14px20u55vlg10` (`user_id_id`),
  CONSTRAINT `FK_9lehq2efnkw14px20u55vlg10` FOREIGN KEY (`user_id_id`) REFERENCES `sec_user` (`id`),
  CONSTRAINT `FK_lcks1kjaf10ckh8vyf2yurnk0` FOREIGN KEY (`profile_pic_id`) REFERENCES `images` (`id`),
  CONSTRAINT `FK_o69qwvnhiy577jr55uyvxc4fb` FOREIGN KEY (`address_id`) REFERENCES `address` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comman_users`
--

LOCK TABLES `comman_users` WRITE;
/*!40000 ALTER TABLE `comman_users` DISABLE KEYS */;
/*!40000 ALTER TABLE `comman_users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `documents`
--

DROP TABLE IF EXISTS `documents`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `documents` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `version` bigint(20) NOT NULL,
  `doc_name` varchar(255) DEFAULT NULL,
  `docs_path` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `documents`
--

LOCK TABLES `documents` WRITE;
/*!40000 ALTER TABLE `documents` DISABLE KEYS */;
/*!40000 ALTER TABLE `documents` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `image`
--

DROP TABLE IF EXISTS `image`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `image` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `version` bigint(20) NOT NULL,
  `image_description` varchar(255) DEFAULT NULL,
  `image_path` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `image`
--

LOCK TABLES `image` WRITE;
/*!40000 ALTER TABLE `image` DISABLE KEYS */;
/*!40000 ALTER TABLE `image` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `images`
--

DROP TABLE IF EXISTS `images`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `images` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `version` bigint(20) NOT NULL,
  `date_created` datetime DEFAULT NULL,
  `imgpath` varchar(255) DEFAULT NULL,
  `last_updated` datetime DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `images`
--

LOCK TABLES `images` WRITE;
/*!40000 ALTER TABLE `images` DISABLE KEYS */;
/*!40000 ALTER TABLE `images` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `international_certificate`
--

DROP TABLE IF EXISTS `international_certificate`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `international_certificate` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `version` bigint(20) NOT NULL,
  `city` varchar(255) DEFAULT NULL,
  `district` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `phone_no` varchar(255) DEFAULT NULL,
  `profile_pic_id` bigint(20) DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_mg7osvy9vxmstt9eipt5dwia5` (`profile_pic_id`),
  CONSTRAINT `FK_mg7osvy9vxmstt9eipt5dwia5` FOREIGN KEY (`profile_pic_id`) REFERENCES `images` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `international_certificate`
--

LOCK TABLES `international_certificate` WRITE;
/*!40000 ALTER TABLE `international_certificate` DISABLE KEYS */;
INSERT INTO `international_certificate` VALUES (1,0,'SDFSDF','Karnal','fsf@gmail.com','TEST','Mr','9879879879',NULL,'Haryana'),(2,0,'DFDFDF','Cachar','dfgd@gmail.com','DGFDFG','Mr','8574857485',NULL,'Assam'),(3,0,'BIDAR','Kurnool','dfgd@gmail.com','GURURAJ KULKARNI','Mr','8574857485',NULL,'Andra Pradesh'),(4,0,'BIDAR','Bagalkot','adebidar@gmail.com','GURURAJ','Mr','8073492977',NULL,'Karnataka'),(5,0,'DFGDF','Kra Daadi','dfgdf@gmail.com','DFGDG','Mr','8574857474',NULL,'Arunachal Pradesh'),(6,0,'BIDAR','Bidar','gururajkulkarni115@gmail.com','GURURAJ KULKARNI','Mr','7353563239',NULL,'Karnataka'),(7,0,'BIDAR','Anantnag','gururajkulkarni115@gmail.com','GURURAJ KULKARNI','Mr','7353563239',NULL,'JammuKashmir'),(8,0,'DFGDFGDFG','Pathanamthitta','dgdf@gmail.com','DFGDFGDFG','Mr','8768657567',NULL,'Kerala'),(9,0,'SDFSDF','Solan','dfgdf@gmail.com','DFGD','Mr','9877988799',NULL,'HimachalPradesh'),(10,0,'BIDAR','Bagalkot','recruitmentcell@kvafsu.edu.in','C SACHCHIDANAND','Mr','9448334567',NULL,'Karnataka'),(11,0,'BIDAR','Bokaro','recruitmentcell@kvafsu.edu.in','DGDFGD','Mr','9448334567',NULL,'Jharkhand'),(12,0,'BIDAR','Bidar','gururajkulkarni115@gmail.com','GURURAJ KULKARNI','Mr','7353563239',NULL,'Karnataka'),(13,0,'BIDAR','Bagalkot','recruitmentcell@kvafsu.edu.in','C SACHCHIDANAND','Mr','9448334567',NULL,'Karnataka'),(14,0,'BIDDFF','Palakkad','dgfg@gmail.com','GURURAJ','Mr','7897897898',NULL,'Kerala'),(15,0,'SDFSDF','Thrissur','dfgd@gmail.com','RAHUL','Mr','8574887777',NULL,'Kerala'),(16,0,'DFDFFDG','Palakkad','sdfsdf@gmail.com','RAHULE','Mr','9879879879',NULL,'Kerala'),(17,0,'BIDAR','Bidar','sdfsd@gmail.com','GURURAJ KULKARNI','Mr','8585857485',NULL,'Karnataka'),(18,0,'BIDAR','Bidar','sdfsd@gmail.com','GURURAJ KULKARNI','Mr','8585857485',NULL,'Karnataka'),(19,0,'DFDFG','Devbhoomi Dwarka','FDSFSD@GMAIL.COM','GURURAJ KULKARNI','Mr','9879879879',NULL,'Gujarat'),(20,0,'DFDFG','Devbhoomi Dwarka','FDSFSD@GMAIL.COM','GURURAJ KULKARNI','Mr','9879879879',NULL,'Gujarat'),(21,0,'DDFGFDG','Bilaspur','fhfhf@gmail.com','RAHUL','Mr','9879877998',NULL,'HimachalPradesh'),(22,0,'FDDFGDFG','Ahmednagar','fghfh@gmail.com','DFGDFGDG','Mr','7898797897',NULL,'Maharashtra'),(23,0,'BIDAR','Bidar','gururajkulkarni115@gmail.com','GURURAJ KULKARNI','Mr','7353563239',NULL,'Karnataka'),(24,0,'BIDAR','Latur','gururajkulkarni115@gmail.com','GURURAJ KULKARNI','Mr','7353563239',NULL,'Maharashtra'),(25,0,'BIDAR','Bidar','dfgf@gmail.com','RAMESH','Mr','8574857474',NULL,'Karnataka'),(26,0,'BIDAR','Bidar','guru@gmail.com','GURURAJ KULKARI','Mr','7353563239',NULL,'Karnataka'),(27,0,'BIDAR','Anantapur','guru@gmail.com','GURURAJ KULKARI','Mr','7353563239',NULL,'Andra Pradesh'),(28,0,'BIDAR','Bidar','guru@gmail.com','ANAND','Mr','7353563239',NULL,'Karnataka'),(29,0,'BIDAR','Junagadh','guru@gmail.com','GURURAJ','Mr','7353563239',NULL,'Gujarat'),(30,0,'DFDF','Thoubal','fghfg@gmail.com','DFGFDGDGDFGFDG','Mr','7897897897',NULL,'Manipur');
/*!40000 ALTER TABLE `international_certificate` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `payment_info`
--

DROP TABLE IF EXISTS `payment_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `payment_info` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `version` bigint(20) NOT NULL,
  `bank_ref_no` varchar(255) DEFAULT NULL,
  `createddate` datetime NOT NULL,
  `discription` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `payment_id` varchar(255) DEFAULT NULL,
  `paymentrequest_id` varchar(255) DEFAULT NULL,
  `paymethod` varchar(255) DEFAULT NULL,
  `phone_no` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `terms` bit(1) NOT NULL,
  `totalamount` varchar(255) DEFAULT NULL,
  `transaction_date` varchar(255) DEFAULT NULL,
  `transaction_id` varchar(255) DEFAULT NULL,
  `user_id` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `payment_info`
--

LOCK TABLES `payment_info` WRITE;
/*!40000 ALTER TABLE `payment_info` DISABLE KEYS */;
/*!40000 ALTER TABLE `payment_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sec_role`
--

DROP TABLE IF EXISTS `sec_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sec_role` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `version` bigint(20) NOT NULL,
  `authority` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_oah023x2ltqw09mdue7w0mcxb` (`authority`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sec_role`
--

LOCK TABLES `sec_role` WRITE;
/*!40000 ALTER TABLE `sec_role` DISABLE KEYS */;
INSERT INTO `sec_role` VALUES (1,0,'ROLE_SUPERADMIN'),(2,0,'ROLE_ADMIN'),(3,0,'ROLE_USER'),(4,0,'ROLE_COMMANUSERS');
/*!40000 ALTER TABLE `sec_role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sec_user`
--

DROP TABLE IF EXISTS `sec_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sec_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `version` bigint(20) NOT NULL,
  `account_expired` bit(1) NOT NULL,
  `account_locked` bit(1) NOT NULL,
  `admin_id_id` bigint(20) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `comman_users_id_id` bigint(20) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `enabled` bit(1) NOT NULL,
  `password` varchar(255) NOT NULL,
  `password_expired` bit(1) NOT NULL,
  `phoneno` varchar(255) DEFAULT NULL,
  `profile_pic_id` bigint(20) DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL,
  `username` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_5ctbdrlf3eismye20vsdtk8w8` (`username`),
  KEY `FK_tlddqljigbpjwdd3nw1rcr9ge` (`admin_id_id`),
  KEY `FK_r7q66xerm6r1mafg6cbnslwy1` (`comman_users_id_id`),
  KEY `FK_2qmct013ebecl50p8wswtj6ln` (`profile_pic_id`),
  CONSTRAINT `FK_2qmct013ebecl50p8wswtj6ln` FOREIGN KEY (`profile_pic_id`) REFERENCES `images` (`id`),
  CONSTRAINT `FK_r7q66xerm6r1mafg6cbnslwy1` FOREIGN KEY (`comman_users_id_id`) REFERENCES `comman_users` (`id`),
  CONSTRAINT `FK_tlddqljigbpjwdd3nw1rcr9ge` FOREIGN KEY (`admin_id_id`) REFERENCES `admin` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sec_user`
--

LOCK TABLES `sec_user` WRITE;
/*!40000 ALTER TABLE `sec_user` DISABLE KEYS */;
INSERT INTO `sec_user` VALUES (1,0,'\0','\0',NULL,NULL,NULL,NULL,'','$2a$10$3huCU9jiw9XFZE4Jr/XazOwAjhX9/ojaVY7eIwZpvk/UzVn7YnYZu','\0',NULL,NULL,NULL,'superadmin'),(2,0,'\0','\0',NULL,NULL,NULL,NULL,'','$2a$10$SkAxfkcfND4m7LXnP.f1eeudYTnb42cPOahfMM.tGUjjllGoaprra','\0',NULL,NULL,NULL,'admin'),(3,0,'\0','\0',NULL,NULL,NULL,NULL,'','$2a$10$zhHuWylmixR6a17ElmyxAulNoSFk0PevVWXxTpdkOFoRnXTbKzpA2','\0',NULL,NULL,NULL,'user'),(4,0,'\0','\0',NULL,NULL,NULL,NULL,'','$2a$10$giQaBcqiPQmMRcMU3eFrKe5IkX/buzCNO8M7TjdlzHy4AoZ9D3LGe','\0',NULL,NULL,NULL,'commanusers');
/*!40000 ALTER TABLE `sec_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sec_user_sec_role`
--

DROP TABLE IF EXISTS `sec_user_sec_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sec_user_sec_role` (
  `sec_user_id` bigint(20) NOT NULL,
  `sec_role_id` bigint(20) NOT NULL,
  PRIMARY KEY (`sec_user_id`,`sec_role_id`),
  KEY `FK_bshvqhdx8h9mb4rrbo1ahnp7q` (`sec_role_id`),
  CONSTRAINT `FK_bshvqhdx8h9mb4rrbo1ahnp7q` FOREIGN KEY (`sec_role_id`) REFERENCES `sec_role` (`id`),
  CONSTRAINT `FK_f1eew3u65ajs3e50xvacwgron` FOREIGN KEY (`sec_user_id`) REFERENCES `sec_user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sec_user_sec_role`
--

LOCK TABLES `sec_user_sec_role` WRITE;
/*!40000 ALTER TABLE `sec_user_sec_role` DISABLE KEYS */;
INSERT INTO `sec_user_sec_role` VALUES (1,1),(2,2),(3,3),(4,4);
/*!40000 ALTER TABLE `sec_user_sec_role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usercreation`
--

DROP TABLE IF EXISTS `usercreation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usercreation` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `version` bigint(20) NOT NULL,
  `address_id` bigint(20) DEFAULT NULL,
  `admin_id_id` bigint(20) NOT NULL,
  `date_created` datetime DEFAULT NULL,
  `last_updated` datetime DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `phone_no` varchar(255) DEFAULT NULL,
  `profile_pic_id` bigint(20) DEFAULT NULL,
  `user_id_id` bigint(20) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_himob4q3c7in2ggs85e9b2jnx` (`address_id`),
  KEY `FK_qm1i2yctq65xj6aubh640wv1e` (`admin_id_id`),
  KEY `FK_13bxlafo36qgwolf7vslofynw` (`profile_pic_id`),
  KEY `FK_je7p1526dv5c1ulpukgyiwit3` (`user_id_id`),
  CONSTRAINT `FK_13bxlafo36qgwolf7vslofynw` FOREIGN KEY (`profile_pic_id`) REFERENCES `images` (`id`),
  CONSTRAINT `FK_himob4q3c7in2ggs85e9b2jnx` FOREIGN KEY (`address_id`) REFERENCES `address` (`id`),
  CONSTRAINT `FK_je7p1526dv5c1ulpukgyiwit3` FOREIGN KEY (`user_id_id`) REFERENCES `sec_user` (`id`),
  CONSTRAINT `FK_qm1i2yctq65xj6aubh640wv1e` FOREIGN KEY (`admin_id_id`) REFERENCES `admin` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usercreation`
--

LOCK TABLES `usercreation` WRITE;
/*!40000 ALTER TABLE `usercreation` DISABLE KEYS */;
/*!40000 ALTER TABLE `usercreation` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-06-20 15:19:10
