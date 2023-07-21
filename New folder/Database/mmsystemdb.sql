-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Mar 14, 2023 at 01:11 AM
-- Server version: 5.7.40
-- PHP Version: 8.0.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mmsystemdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `account`
--

DROP TABLE IF EXISTS `account`;
CREATE TABLE IF NOT EXISTS `account` (
  `Acc_Type_ID` varchar(5) NOT NULL,
  `Acc_Type` varchar(25) NOT NULL,
  `Color` varchar(10) NOT NULL,
  PRIMARY KEY (`Acc_Type_ID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `account`
--

INSERT INTO `account` (`Acc_Type_ID`, `Acc_Type`, `Color`) VALUES
('NS', 'Normal Saving', 'RED'),
('RKG', 'Ran Kekulu Ginum', 'BLUE'),
('Eplus', '18+', 'GREEN'),
('SG', 'Smart Gen', 'ORANGE'),
('SC', 'Senior Citizen', 'YELLOW'),
('BLL', 'Billa', 'ORANGE'),
('SG14', 'smartGen 14 +', 'RED');

-- --------------------------------------------------------

--
-- Table structure for table `file`
--

DROP TABLE IF EXISTS `file`;
CREATE TABLE IF NOT EXISTS `file` (
  `Account_No` int(15) NOT NULL,
  `File_No` int(3) NOT NULL,
  `Rack_No` int(2) NOT NULL,
  `Partition_ID` varchar(5) NOT NULL,
  `Acc_Type_ID` varchar(5) NOT NULL,
  PRIMARY KEY (`Account_No`),
  KEY `Partition_ID` (`Partition_ID`),
  KEY `Acc_Type_ID` (`Acc_Type_ID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `file`
--

INSERT INTO `file` (`Account_No`, `File_No`, `Rack_No`, `Partition_ID`, `Acc_Type_ID`) VALUES
(103, 5, 5, 'A', 'SC'),
(106, 1, 3, 'F', 'BLL'),
(100, 1, 3, 'C', 'RKG'),
(101, 2, 3, 'B', 'Eplus'),
(102, 3, 4, 'E', 'NS'),
(105, 2, 2, 'B', 'RKG'),
(107, 1, 1, 's', 'SG14');

-- --------------------------------------------------------

--
-- Table structure for table `partition_table`
--

DROP TABLE IF EXISTS `partition_table`;
CREATE TABLE IF NOT EXISTS `partition_table` (
  `Partition_ID` varchar(5) NOT NULL,
  `Partition_Color` varchar(10) NOT NULL,
  PRIMARY KEY (`Partition_ID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `partition_table`
--

INSERT INTO `partition_table` (`Partition_ID`, `Partition_Color`) VALUES
('A', 'RED'),
('B', 'GREEN'),
('D', 'BLUE'),
('C', 'ORANGE'),
('E', 'YELLOW'),
('F', 'GREEN'),
('s', 'RED');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
