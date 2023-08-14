-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Mar 27, 2023 at 02:44 PM
-- Server version: 8.0.31
-- PHP Version: 8.0.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `product`
--

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
CREATE TABLE IF NOT EXISTS `product` (
  `id` int NOT NULL AUTO_INCREMENT,
  `product_name` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `product_price` double NOT NULL,
  `product_details` varchar(50) NOT NULL,
  `product_url` varchar(100) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `product_status` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `product_category` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`id`, `product_name`, `product_price`, `product_details`, `product_url`, `product_status`, `product_category`) VALUES
(1, 'fried rice', 2500, 'this is tasty', 'www.friedrice.lk', 'available', 'chinese food'),
(4, 'biriyani', 6500, 'mutton included', 'www.mutton.lk', 'available', 'indian food');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
