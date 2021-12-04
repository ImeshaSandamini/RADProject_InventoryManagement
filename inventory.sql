-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Jan 27, 2020 at 06:52 PM
-- Server version: 10.4.10-MariaDB
-- PHP Version: 7.3.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `inventory`
--

-- --------------------------------------------------------

--
-- Table structure for table `item`
--

DROP TABLE IF EXISTS `item`;
CREATE TABLE IF NOT EXISTS `item` (
  `itemId` varchar(50) NOT NULL,
  `itemName` varchar(50) NOT NULL,
  `purchasePrice` varchar(50) NOT NULL,
  `sellingPrice` varchar(50) NOT NULL,
  `quantity` int(50) NOT NULL,
  `category` varchar(50) NOT NULL,
  PRIMARY KEY (`itemId`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `item`
--

INSERT INTO `item` (`itemId`, `itemName`, `purchasePrice`, `sellingPrice`, `quantity`, `category`) VALUES
('1556', 'jij', 'm', 'k', 5, 'o'),
('jj', 'fef', '455', '788', 7885, 'hjhj'),
('fgb', 'gtg', 'gtht', 'null', 5, 'rgtt5'),
('gt', 'gth', 'thgtg', 'null', 2, 'th'),
('dcd c', 'cd', 'cdcdf', 'null', 8, 'c');

-- --------------------------------------------------------

--
-- Table structure for table `registration`
--

DROP TABLE IF EXISTS `registration`;
CREATE TABLE IF NOT EXISTS `registration` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `firstname` varchar(50) NOT NULL,
  `lastname` varchar(50) NOT NULL,
  `gender` varchar(50) NOT NULL,
  `nic` varchar(50) NOT NULL,
  `address` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `registration`
--

INSERT INTO `registration` (`id`, `firstname`, `lastname`, `gender`, `nic`, `address`, `email`, `username`, `password`) VALUES
(1, 'siva', 'karan', 'on', '952832301v', 'jaffna', 'nadarajahsivakaran1995@gmail.com', 'siva', 'amma'),
(2, '', '', 'null', '', '', '', '', ''),
(3, '', '', 'null', '', '', '', '', ''),
(4, 'null', 'null', 'null', 'null', 'null', 'null', 'null', 'null'),
(5, '', '', 'null', '', '', '', '', ''),
(6, '', '', 'null', '', '', '', '', '');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
