CREATE DATABASE  IF NOT EXISTS `userbank`;
USE `userbank`;

DROP TABLE IF EXISTS `account`;
CREATE TABLE `account` (
  `accountId` int(11) NOT NULL AUTO_INCREMENT,
  `account` int(11) DEFAULT NULL,
  `userId` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`accountId`)
) ;

LOCK TABLES `account` WRITE;
INSERT INTO `account` VALUES (1,100,'1'),(2,2000,'2'),(3,300,'3'),(4,100,'4'),(5,500,'5'),
							 (6,666,'6'),(7,100000,'9'),(8,9999,'10'),(9,700,'7'),(10,800,'8');
UNLOCK TABLES;

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userId` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `surName` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`userId`)
);

LOCK TABLES `user` WRITE;
INSERT INTO `user` VALUES (1,'John','Snow'),(2,'Peter','Griffin'),(3,'Marty','Mcfly'),(4,'Jack','Sparrow'),
						  (5,'Harry','Potter'),(6,'Indiana','Jones'),(7,'James','Bond'),(8,'Luke','Skywalker'),
                          (9,'Tony','Stark'),(10,'Stan','Lee');
UNLOCK TABLES;

