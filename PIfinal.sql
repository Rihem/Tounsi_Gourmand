-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.0.27-community-nt


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema (null)
--

CREATE DATABASE IF NOT EXISTS (null);
USE (null);

--
-- Definition of table `administrateur`
--

DROP TABLE IF EXISTS `administrateur`;
CREATE TABLE `administrateur` (
  `login` varchar(15) NOT NULL,
  `password` varchar(15) NOT NULL,
  PRIMARY KEY  (`login`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `administrateur`
--

/*!40000 ALTER TABLE `administrateur` DISABLE KEYS */;
/*!40000 ALTER TABLE `administrateur` ENABLE KEYS */;


--
-- Definition of table `boissons`
--

DROP TABLE IF EXISTS `boissons`;
CREATE TABLE `boissons` (
  `idBoissons` int(10) unsigned NOT NULL auto_increment,
  `libelleBoisson` varchar(45) NOT NULL,
  `prix` float NOT NULL,
  PRIMARY KEY  (`idBoissons`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `boissons`
--

/*!40000 ALTER TABLE `boissons` DISABLE KEYS */;
/*!40000 ALTER TABLE `boissons` ENABLE KEYS */;


--
-- Definition of table `client`
--

DROP TABLE IF EXISTS `client`;
CREATE TABLE `client` (
  `NumCompte` int(10) unsigned NOT NULL auto_increment,
  `nom` varchar(45) NOT NULL,
  `prenom` varchar(45) NOT NULL,
  `login` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `tel` int(10) unsigned NOT NULL,
  `sexe` varchar(45) NOT NULL,
  `age` int(10) unsigned NOT NULL,
  PRIMARY KEY  (`NumCompte`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `client`
--

/*!40000 ALTER TABLE `client` DISABLE KEYS */;
/*!40000 ALTER TABLE `client` ENABLE KEYS */;


--
-- Definition of table `commentaire`
--

DROP TABLE IF EXISTS `commentaire`;
CREATE TABLE `commentaire` (
  `idCommentaire` int(10) unsigned NOT NULL auto_increment,
  `libelle` varchar(45) NOT NULL,
  PRIMARY KEY  (`idCommentaire`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `commentaire`
--

/*!40000 ALTER TABLE `commentaire` DISABLE KEYS */;
/*!40000 ALTER TABLE `commentaire` ENABLE KEYS */;


--
-- Definition of table `desserts`
--

DROP TABLE IF EXISTS `desserts`;
CREATE TABLE `desserts` (
  `idDesserts` int(10) unsigned NOT NULL auto_increment,
  `libelleDessert` varchar(45) NOT NULL,
  `prix` float NOT NULL,
  PRIMARY KEY  (`idDesserts`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `desserts`
--

/*!40000 ALTER TABLE `desserts` DISABLE KEYS */;
/*!40000 ALTER TABLE `desserts` ENABLE KEYS */;


--
-- Definition of table `entrees`
--

DROP TABLE IF EXISTS `entrees`;
CREATE TABLE `entrees` (
  `idEntrees` int(10) unsigned NOT NULL auto_increment,
  `libelleEntree` varchar(45) NOT NULL,
  `prix` float NOT NULL,
  PRIMARY KEY  (`idEntrees`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `entrees`
--

/*!40000 ALTER TABLE `entrees` DISABLE KEYS */;
/*!40000 ALTER TABLE `entrees` ENABLE KEYS */;


--
-- Definition of table `espacegourmand`
--

DROP TABLE IF EXISTS `espacegourmand`;
CREATE TABLE `espacegourmand` (
  `idEspaceGourmand` int(10) unsigned NOT NULL auto_increment,
  `nomEspaceGourmand` varchar(45) NOT NULL,
  `adresse` varchar(45) NOT NULL,
  `numTel` int(10) unsigned NOT NULL,
  `email` varchar(45) NOT NULL,
  `type` varchar(45) NOT NULL,
  `idProprietaire` int(10) unsigned NOT NULL,
  `idMenu` int(10) unsigned NOT NULL,
  `idCommentaire` int(10) unsigned NOT NULL,
  PRIMARY KEY  (`idEspaceGourmand`),
  KEY `FK_EspaceGourmand_1` (`idCommentaire`),
  KEY `FK_EspaceGourmand_2` (`idMenu`),
  KEY `FK_EspaceGourmand_3` (`idProprietaire`),
  CONSTRAINT `FK_EspaceGourmand_1` FOREIGN KEY (`idCommentaire`) REFERENCES `commentaire` (`idCommentaire`),
  CONSTRAINT `FK_EspaceGourmand_2` FOREIGN KEY (`idMenu`) REFERENCES `menu` (`idMenu`),
  CONSTRAINT `FK_EspaceGourmand_3` FOREIGN KEY (`idProprietaire`) REFERENCES `proprietaireespacegourmand` (`idProprietaire`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `espacegourmand`
--

/*!40000 ALTER TABLE `espacegourmand` DISABLE KEYS */;
/*!40000 ALTER TABLE `espacegourmand` ENABLE KEYS */;


--
-- Definition of table `menu`
--

DROP TABLE IF EXISTS `menu`;
CREATE TABLE `menu` (
  `idMenu` int(10) unsigned NOT NULL auto_increment,
  `idEntrees` int(10) unsigned NOT NULL,
  `idDesserts` int(10) unsigned NOT NULL,
  `idPlats` int(10) unsigned NOT NULL,
  `idBoissons` int(10) unsigned NOT NULL,
  `date` datetime NOT NULL,
  PRIMARY KEY  (`idMenu`),
  KEY `FK_menu_1` (`idEntrees`),
  KEY `FK_menu_2` (`idDesserts`),
  KEY `FK_menu_3` (`idPlats`),
  KEY `FK_menu_4` (`idBoissons`),
  CONSTRAINT `FK_menu_4` FOREIGN KEY (`idBoissons`) REFERENCES `boissons` (`idBoissons`),
  CONSTRAINT `FK_menu_1` FOREIGN KEY (`idEntrees`) REFERENCES `entrees` (`idEntrees`),
  CONSTRAINT `FK_menu_2` FOREIGN KEY (`idDesserts`) REFERENCES `desserts` (`idDesserts`),
  CONSTRAINT `FK_menu_3` FOREIGN KEY (`idPlats`) REFERENCES `plats` (`idPlats`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `menu`
--

/*!40000 ALTER TABLE `menu` DISABLE KEYS */;
/*!40000 ALTER TABLE `menu` ENABLE KEYS */;


--
-- Definition of table `plats`
--

DROP TABLE IF EXISTS `plats`;
CREATE TABLE `plats` (
  `idPlats` int(10) unsigned NOT NULL auto_increment,
  `libellePlat` varchar(45) NOT NULL,
  `prix` float NOT NULL,
  PRIMARY KEY  (`idPlats`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `plats`
--

/*!40000 ALTER TABLE `plats` DISABLE KEYS */;
/*!40000 ALTER TABLE `plats` ENABLE KEYS */;


--
-- Definition of table `proprietaireespacegourmand`
--

DROP TABLE IF EXISTS `proprietaireespacegourmand`;
CREATE TABLE `proprietaireespacegourmand` (
  `idProprietaire` int(10) unsigned NOT NULL auto_increment,
  `nom` varchar(45) NOT NULL,
  `prenom` varchar(45) NOT NULL,
  `login` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `tel` int(10) unsigned NOT NULL,
  `sexe` varchar(45) NOT NULL,
  `age` int(10) unsigned NOT NULL,
  PRIMARY KEY  (`idProprietaire`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `proprietaireespacegourmand`
--

/*!40000 ALTER TABLE `proprietaireespacegourmand` DISABLE KEYS */;
/*!40000 ALTER TABLE `proprietaireespacegourmand` ENABLE KEYS */;


--
-- Definition of table `reservation`
--

DROP TABLE IF EXISTS `reservation`;
CREATE TABLE `reservation` (
  `numReservation` int(10) unsigned NOT NULL auto_increment,
  `dateReservation` datetime NOT NULL,
  `nombrePersonne` int(10) unsigned NOT NULL,
  `numCompte` int(10) unsigned NOT NULL,
  `idEspaceGourmand` int(10) unsigned NOT NULL,
  `ok` tinyint(1) NOT NULL,
  PRIMARY KEY  (`numReservation`),
  KEY `FK_reservation_1` (`numCompte`),
  KEY `FK_reservation_2` (`idEspaceGourmand`),
  CONSTRAINT `FK_reservation_1` FOREIGN KEY (`numCompte`) REFERENCES `client` (`NumCompte`),
  CONSTRAINT `FK_reservation_2` FOREIGN KEY (`idEspaceGourmand`) REFERENCES `espacegourmand` (`idEspaceGourmand`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `reservation`
--

/*!40000 ALTER TABLE `reservation` DISABLE KEYS */;
/*!40000 ALTER TABLE `reservation` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
