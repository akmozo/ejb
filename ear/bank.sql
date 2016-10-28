-- --------------------------------------------------------
-- Hôte :                        127.0.0.1
-- Version du serveur:           5.6.33-log - MySQL Community Server (GPL)
-- SE du serveur:                Win64
-- HeidiSQL Version:             9.3.0.4984
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Export de la structure de la base pour bank
DROP DATABASE IF EXISTS `bank`;
CREATE DATABASE IF NOT EXISTS `bank` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `bank`;


-- Export de la structure de table bank. devise
DROP TABLE IF EXISTS `devise`;
CREATE TABLE IF NOT EXISTS `devise` (
  `code` varchar(8) NOT NULL,
  `monnaie` varchar(64) DEFAULT NULL,
  `taux` double DEFAULT NULL,
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Export de données de la table bank.devise : ~5 rows (environ)
DELETE FROM `devise`;
/*!40000 ALTER TABLE `devise` DISABLE KEYS */;
INSERT INTO `devise` (`code`, `monnaie`, `taux`) VALUES
	('EUR', 'euro', 1.1);
INSERT INTO `devise` (`code`, `monnaie`, `taux`) VALUES
	('GBP', 'livre', 1.2);
INSERT INTO `devise` (`code`, `monnaie`, `taux`) VALUES
	('JPY', 'yen', 0.012);
INSERT INTO `devise` (`code`, `monnaie`, `taux`) VALUES
	('TND', 'dinar tunisien', 0.8);
INSERT INTO `devise` (`code`, `monnaie`, `taux`) VALUES
	('USD', 'dollar', 1);
/*!40000 ALTER TABLE `devise` ENABLE KEYS */;


-- Export de la structure de table bank. pays
DROP TABLE IF EXISTS `pays`;
CREATE TABLE IF NOT EXISTS `pays` (
  `codePays` varchar(8) NOT NULL,
  `nom` varchar(64) DEFAULT NULL,
  `capitale` varchar(64) DEFAULT NULL,
  `code_devise` varchar(8) DEFAULT NULL,
  PRIMARY KEY (`codePays`),
  KEY `pays_devise` (`code_devise`),
  CONSTRAINT `pays_devise` FOREIGN KEY (`code_devise`) REFERENCES `devise` (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Export de données de la table bank.pays : ~7 rows (environ)
DELETE FROM `pays`;
/*!40000 ALTER TABLE `pays` DISABLE KEYS */;
INSERT INTO `pays` (`codePays`, `nom`, `capitale`, `code_devise`) VALUES
	('de', 'Allemagne', 'Berlin', 'EUR');
INSERT INTO `pays` (`codePays`, `nom`, `capitale`, `code_devise`) VALUES
	('es', 'Espagne', 'Madrid', 'EUR');
INSERT INTO `pays` (`codePays`, `nom`, `capitale`, `code_devise`) VALUES
	('fr', 'France', 'Paris', 'EUR');
INSERT INTO `pays` (`codePays`, `nom`, `capitale`, `code_devise`) VALUES
	('it', 'Italie', 'Rome', 'EUR');
INSERT INTO `pays` (`codePays`, `nom`, `capitale`, `code_devise`) VALUES
	('jp', 'Japon', 'Tokyo', 'JPY');
INSERT INTO `pays` (`codePays`, `nom`, `capitale`, `code_devise`) VALUES
	('uk', 'Royaume Uni', 'Londres', 'GBP');
INSERT INTO `pays` (`codePays`, `nom`, `capitale`, `code_devise`) VALUES
	('usa', 'USA', 'Washington', 'USD');
/*!40000 ALTER TABLE `pays` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
