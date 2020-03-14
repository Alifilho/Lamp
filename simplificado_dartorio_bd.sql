-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 01-Dez-2019 às 16:24
-- Versão do servidor: 10.3.16-MariaDB
-- versão do PHP: 7.3.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `simplificado_dartorio_bd`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_atos`
--

CREATE TABLE `tb_atos` (
  `matricula` varchar(30) COLLATE utf8_croatian_ci NOT NULL,
  `atos` varchar(10000) COLLATE utf8_croatian_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_croatian_ci;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tb_matriculas`
--

CREATE TABLE `tb_matriculas` (
  `matricula` varchar(30) COLLATE utf8_croatian_ci NOT NULL,
  `proprietario_inicial` varchar(50) COLLATE utf8_croatian_ci NOT NULL,
  `data_primeiro_ato` varchar(50) COLLATE utf8_croatian_ci NOT NULL,
  `cpf_proprietario_inicial` varchar(20) COLLATE utf8_croatian_ci NOT NULL,
  `atos` mediumtext COLLATE utf8_croatian_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_croatian_ci;

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `tb_atos`
--
ALTER TABLE `tb_atos`
  ADD PRIMARY KEY (`matricula`);

--
-- Índices para tabela `tb_matriculas`
--
ALTER TABLE `tb_matriculas`
  ADD PRIMARY KEY (`matricula`);

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `tb_atos`
--
ALTER TABLE `tb_atos`
  ADD CONSTRAINT `tb_atos_ibfk_1` FOREIGN KEY (`matricula`) REFERENCES `tb_matriculas` (`matricula`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
