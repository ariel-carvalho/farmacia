create database farmacia;
use farmacia;

CREATE TABLE `produto`
(
  `id` int AUTO_INCREMENT,
  `preco` float,
  `nome` varchar(50),
  `fabricante` varchar(50),
  PRIMARY KEY (`id`)
);

select * from produto;