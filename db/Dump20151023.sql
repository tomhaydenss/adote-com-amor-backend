CREATE DATABASE  IF NOT EXISTS `adote` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `adote`;
-- MySQL dump 10.13  Distrib 5.6.24, for debian-linux-gnu (x86_64)
--
-- Host: localhost    Database: adote
-- ------------------------------------------------------
-- Server version	5.6.24-0ubuntu2

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
-- Table structure for table `animal`
--

DROP TABLE IF EXISTS `animal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `animal` (
  `id` varchar(36) NOT NULL,
  `nome` varchar(45) DEFAULT NULL,
  `sexo` char(1) DEFAULT NULL,
  `descricao` text,
  `data_nascimento` datetime DEFAULT NULL,
  `data_cadastro` datetime DEFAULT NULL,
  `raca_id` int(11) NOT NULL,
  `proprietario_id` varchar(36) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_animal_1_idx` (`proprietario_id`),
  KEY `fk_animal_2_idx` (`raca_id`),
  CONSTRAINT `fk_animal_1` FOREIGN KEY (`raca_id`) REFERENCES `raca` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_animal_2` FOREIGN KEY (`proprietario_id`) REFERENCES `proprietario` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `animal`
--

LOCK TABLES `animal` WRITE;
/*!40000 ALTER TABLE `animal` DISABLE KEYS */;
INSERT INTO `animal` VALUES ('1','TOY','M','Cão idoso e muito fiel.','2000-10-01 00:00:00','2015-10-21 00:00:00',51,'1');
/*!40000 ALTER TABLE `animal` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `especie`
--

DROP TABLE IF EXISTS `especie`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `especie` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `especie`
--

LOCK TABLES `especie` WRITE;
/*!40000 ALTER TABLE `especie` DISABLE KEYS */;
INSERT INTO `especie` VALUES (1,'Canina'),(2,'Felina');
/*!40000 ALTER TABLE `especie` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `foto_animal`
--

DROP TABLE IF EXISTS `foto_animal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `foto_animal` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `foto` blob,
  `animal_id` varchar(36) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_foto_animal_1_idx` (`animal_id`),
  CONSTRAINT `fk_foto_animal_1` FOREIGN KEY (`animal_id`) REFERENCES `animal` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `foto_animal`
--

LOCK TABLES `foto_animal` WRITE;
/*!40000 ALTER TABLE `foto_animal` DISABLE KEYS */;
/*!40000 ALTER TABLE `foto_animal` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `localizacao`
--

DROP TABLE IF EXISTS `localizacao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `localizacao` (
  `id` varchar(36) NOT NULL,
  `cep` varchar(8) DEFAULT NULL,
  `endereco` varchar(255) DEFAULT NULL,
  `ponto_referencia` varchar(45) DEFAULT NULL,
  `latitude` float DEFAULT NULL,
  `longitude` float DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `localizacao`
--

LOCK TABLES `localizacao` WRITE;
/*!40000 ALTER TABLE `localizacao` DISABLE KEYS */;
INSERT INTO `localizacao` VALUES ('1','20771580','Rua Degas, 400 - Del Castilho, Rio de Janeiro - RJ','Atrás do NorteShopping',-22.8842,-43.2832);
/*!40000 ALTER TABLE `localizacao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `porte`
--

DROP TABLE IF EXISTS `porte`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `porte` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `descricao` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `porte`
--

LOCK TABLES `porte` WRITE;
/*!40000 ALTER TABLE `porte` DISABLE KEYS */;
INSERT INTO `porte` VALUES (1,'Mini ou Toy','Abaixo de 28cm até 6kg'),(2,'Pequeno ou Anão','De 28 a 35cm de 6 a 15kg'),(3,'Médio','De 36 a 49cm de 15 a 25kg'),(4,'Grande','De 50 a 69cm de 25 a 45kg'),(5,'Gigante','Acima de 70cm de 45 a 60kg');
/*!40000 ALTER TABLE `porte` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `proprietario`
--

DROP TABLE IF EXISTS `proprietario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `proprietario` (
  `id` varchar(36) NOT NULL,
  `nome` varchar(45) DEFAULT NULL,
  `email` varchar(45) NOT NULL,
  `telefone` varchar(45) DEFAULT NULL,
  `localizacao_id` varchar(36) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `email_UNIQUE` (`email`),
  KEY `fk_proprietario_1_idx` (`localizacao_id`),
  CONSTRAINT `fk_proprietario_1` FOREIGN KEY (`localizacao_id`) REFERENCES `localizacao` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `proprietario`
--

LOCK TABLES `proprietario` WRITE;
/*!40000 ALTER TABLE `proprietario` DISABLE KEYS */;
INSERT INTO `proprietario` VALUES ('1','Tom Hayden','tomhaydenss@gmail.com','21983044044','1');
/*!40000 ALTER TABLE `proprietario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `raca`
--

DROP TABLE IF EXISTS `raca`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `raca` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) DEFAULT NULL,
  `especie_id` int(11) NOT NULL,
  `porte_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_raca_1_idx` (`especie_id`),
  KEY `fk_raca_2_idx` (`porte_id`),
  CONSTRAINT `fk_raca_1` FOREIGN KEY (`especie_id`) REFERENCES `especie` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_raca_2` FOREIGN KEY (`porte_id`) REFERENCES `porte` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=75 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `raca`
--

LOCK TABLES `raca` WRITE;
/*!40000 ALTER TABLE `raca` DISABLE KEYS */;
INSERT INTO `raca` VALUES (1,'Abissínio',2,1),(2,'American Shorthair',2,1),(3,'Angorá',2,1),(4,'Azul Russo',2,1),(5,'Bengal',2,1),(6,'Brazilian Shorthair',2,1),(7,'British Shorthair',2,1),(8,'Burmese',2,1),(9,'Chartreux',2,1),(10,'Cornish Rex',2,1),(11,'Devon Rex',2,1),(12,'Egyptian Mau',2,1),(13,'European Shorthair',2,1),(14,'Exótico',2,1),(15,'Himalaio',2,1),(16,'Maine Coon',2,1),(17,'Munchkin',2,1),(18,'Norwegian Forest',2,1),(19,'Oriental',2,1),(20,'Persa',2,1),(21,'Ragdoll',2,1),(22,'Sagrado da Birmânia',2,1),(23,'Savannah',2,1),(24,'Scottish Fold',2,1),(25,'Siamês',2,1),(26,'Sphynx',2,1),(27,'Bichon Frisé',1,1),(28,'Chihuahua',1,1),(29,'Lhassa Apso',1,1),(30,'Maltês',1,1),(31,'Pequinês',1,1),(32,'Pinscher Anão',1,1),(33,'Pug',1,1),(34,'Skilky Terrier Australiano',1,1),(35,'Terrier Australiano',1,1),(36,'Terrier Escocês',1,1),(37,'Yorkshire Terrier',1,1),(38,'Basset Hound',1,2),(39,'Beagle',1,2),(40,'Boston Terrier',1,2),(41,'Buldogue Francês',1,2),(42,'Jack Russel Terrier',1,2),(43,'Schnauzer Anão',1,2),(44,'Spaniel Anão Continental',1,2),(45,'Terrier Brasileiro',1,2),(46,'American Pit Bull Terrier',1,3),(47,'Boiadeiro Australiano',1,3),(48,'Buldogue Inglês',1,3),(49,'Bull Terrier',1,3),(50,'Cocker Spaniel Americano',1,3),(51,'Cocker Spaniel Inglês',1,3),(52,'Fox Terrier',1,3),(53,'Poodle (Padrão)',1,3),(54,'Springer Spaniel Inglês',1,3),(55,'Whippet',1,3),(56,'Akita',1,4),(57,'Border Collie',1,4),(58,'Bóxer Alemão',1,4),(59,'Chow Chow',1,4),(60,'Colie',1,4),(61,'Dálmata',1,4),(62,'Doberman',1,4),(63,'Dogue Argentino',1,4),(64,'Galgo Espanhol',1,4),(65,'Husky Siberiano',1,4),(66,'Labrador Retriever',1,4),(67,'Mastim Napolitano',1,4),(68,'Dogue Alemão',1,5),(69,'Fila Brasileiro',1,5),(70,'Greyhound',1,5),(71,'Mastife Inglês',1,5),(72,'Mastim dos Pireneus',1,5),(73,'Mastim Espanhol',1,5),(74,'São Bernardo',1,5);
/*!40000 ALTER TABLE `raca` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-10-23  2:41:20
