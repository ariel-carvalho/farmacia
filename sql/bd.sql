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

SELECT * FROM produto WHERE id = 1;
update produto set preco = 2 where id = 2; 

UPDATE produto SET preco = 2 WHERE id = 2;