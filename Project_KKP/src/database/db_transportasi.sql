-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 24, 2024 at 07:40 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_transportasi`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_admin`
--

CREATE TABLE `tbl_admin` (
  `idAdmin` int(11) NOT NULL,
  `nama` varchar(255) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `statusAktif` enum('1','0') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_admin`
--

INSERT INTO `tbl_admin` (`idAdmin`, `nama`, `username`, `password`, `statusAktif`) VALUES
(1, 'Mamat', 'mamat445', '1234', '1'),
(2, 'Budi', 'budi554', '1234', '1'),
(3, 'Wawan', 'wawan123', '1234', '1'),
(5, 'saasda', 'sdasadsa', '231321', '1'),
(6, 'adasd', '1231', '324234', '1');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_barang`
--

CREATE TABLE `tbl_barang` (
  `idBarang` int(11) NOT NULL,
  `nama` varchar(255) NOT NULL,
  `jenis` varchar(50) NOT NULL,
  `statusAktif` enum('1','0') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_barang`
--

INSERT INTO `tbl_barang` (`idBarang`, `nama`, `jenis`, `statusAktif`) VALUES
(1, 'Pet Geogrid', 'Polyester', '1'),
(2, 'Non Woven Geotextile', 'Tekstil', '1'),
(3, 'Pet Geogrid', 'Polyester', '1');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_detailorder`
--

CREATE TABLE `tbl_detailorder` (
  `idDetailOrder` int(11) NOT NULL,
  `idBarang` int(11) NOT NULL,
  `idSuratJalan` int(11) NOT NULL,
  `idKendaraan` int(11) NOT NULL,
  `idPengemudi` int(11) NOT NULL,
  `statusAktif` enum('1','0') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_kendaraan`
--

CREATE TABLE `tbl_kendaraan` (
  `idKendaraan` int(11) NOT NULL,
  `merek` varchar(50) NOT NULL,
  `model` varchar(50) NOT NULL,
  `nik` varchar(17) NOT NULL,
  `jenis` varchar(50) NOT NULL,
  `warna` varchar(50) NOT NULL,
  `pemilik` varchar(255) NOT NULL,
  `platNomor` varchar(10) NOT NULL,
  `statusAktif` enum('1','0') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_kendaraan`
--

INSERT INTO `tbl_kendaraan` (`idKendaraan`, `merek`, `model`, `nik`, `jenis`, `warna`, `pemilik`, `platNomor`, `statusAktif`) VALUES
(1, 'Mitsubishi', 'Fuso', 'JH4DB7660SS012345', 'Truk', 'Putih', 'PT.XYZ Transportasi', 'F 9040 FL', '1'),
(2, 'Mitsubishi', 'Fuso Canter', 'ML23G4T230Y012345', 'Truk', 'Kuning', 'PT.XYZ Transportasi', 'B 2981 DT', '1'),
(3, 'Mitsubishi', 'Fuso Super Great', 'JUH56G4G79A012345', 'Truk', 'Kuning', 'PT.XYZ Transportasi', 'B 8234 UX', '1');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_pengemudi`
--

CREATE TABLE `tbl_pengemudi` (
  `idPengemudi` int(11) NOT NULL,
  `nama` varchar(255) NOT NULL,
  `jenisKelamin` varchar(50) NOT NULL,
  `tglLahir` varchar(50) NOT NULL,
  `alamat` varchar(255) NOT NULL,
  `noHp` varchar(13) NOT NULL,
  `statusAktif` enum('1','0') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_pengemudi`
--

INSERT INTO `tbl_pengemudi` (`idPengemudi`, `nama`, `jenisKelamin`, `tglLahir`, `alamat`, `noHp`, `statusAktif`) VALUES
(1, 'Jamaludin Septian', 'Laki - Laki', '1 September 1999', 'Jl. Setu Cipayung ', '089637103742', '1');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_suratjalan`
--

CREATE TABLE `tbl_suratjalan` (
  `idSuratJalan` int(11) NOT NULL,
  `nomor` varchar(255) NOT NULL,
  `ptPenerima` varchar(255) NOT NULL,
  `picIvander` varchar(50) NOT NULL,
  `idBarang` int(11) NOT NULL,
  `banyaknya` int(11) NOT NULL,
  `keterangan` varchar(255) NOT NULL,
  `idPengemudi` int(11) NOT NULL,
  `pengirim` varchar(255) NOT NULL,
  `penerima` varchar(255) NOT NULL,
  `statusAktif` enum('1','0') DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_admin`
--
ALTER TABLE `tbl_admin`
  ADD PRIMARY KEY (`idAdmin`);

--
-- Indexes for table `tbl_barang`
--
ALTER TABLE `tbl_barang`
  ADD PRIMARY KEY (`idBarang`);

--
-- Indexes for table `tbl_detailorder`
--
ALTER TABLE `tbl_detailorder`
  ADD PRIMARY KEY (`idDetailOrder`),
  ADD KEY `ambilIdBarangDetailOrder` (`idBarang`),
  ADD KEY `ambilIdSuratJalanDetailOrder` (`idSuratJalan`),
  ADD KEY `ambilIdKendaraanDetailOrder` (`idKendaraan`),
  ADD KEY `ambilIdPengemudiDetailOrder` (`idPengemudi`);

--
-- Indexes for table `tbl_kendaraan`
--
ALTER TABLE `tbl_kendaraan`
  ADD PRIMARY KEY (`idKendaraan`);

--
-- Indexes for table `tbl_pengemudi`
--
ALTER TABLE `tbl_pengemudi`
  ADD PRIMARY KEY (`idPengemudi`);

--
-- Indexes for table `tbl_suratjalan`
--
ALTER TABLE `tbl_suratjalan`
  ADD PRIMARY KEY (`idSuratJalan`),
  ADD KEY `ambilIdPengemudiSuratJalan` (`idPengemudi`),
  ADD KEY `ambilIdBarangSuratJalan` (`idBarang`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_admin`
--
ALTER TABLE `tbl_admin`
  MODIFY `idAdmin` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `tbl_barang`
--
ALTER TABLE `tbl_barang`
  MODIFY `idBarang` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `tbl_detailorder`
--
ALTER TABLE `tbl_detailorder`
  MODIFY `idDetailOrder` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tbl_kendaraan`
--
ALTER TABLE `tbl_kendaraan`
  MODIFY `idKendaraan` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `tbl_pengemudi`
--
ALTER TABLE `tbl_pengemudi`
  MODIFY `idPengemudi` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `tbl_suratjalan`
--
ALTER TABLE `tbl_suratjalan`
  MODIFY `idSuratJalan` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tbl_detailorder`
--
ALTER TABLE `tbl_detailorder`
  ADD CONSTRAINT `ambilIdBarangDetailOrder` FOREIGN KEY (`idBarang`) REFERENCES `tbl_barang` (`idBarang`) ON DELETE NO ACTION ON UPDATE CASCADE,
  ADD CONSTRAINT `ambilIdKendaraanDetailOrder` FOREIGN KEY (`idKendaraan`) REFERENCES `tbl_kendaraan` (`idKendaraan`) ON DELETE NO ACTION ON UPDATE CASCADE,
  ADD CONSTRAINT `ambilIdPengemudiDetailOrder` FOREIGN KEY (`idPengemudi`) REFERENCES `tbl_pengemudi` (`idPengemudi`) ON DELETE NO ACTION ON UPDATE CASCADE,
  ADD CONSTRAINT `ambilIdSuratJalanDetailOrder` FOREIGN KEY (`idSuratJalan`) REFERENCES `tbl_suratjalan` (`idSuratJalan`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Constraints for table `tbl_suratjalan`
--
ALTER TABLE `tbl_suratjalan`
  ADD CONSTRAINT `ambilIdBarangSuratJalan` FOREIGN KEY (`idBarang`) REFERENCES `tbl_barang` (`idBarang`) ON DELETE NO ACTION ON UPDATE CASCADE,
  ADD CONSTRAINT `ambilIdPengemudiSuratJalan` FOREIGN KEY (`idPengemudi`) REFERENCES `tbl_pengemudi` (`idPengemudi`) ON DELETE NO ACTION ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
