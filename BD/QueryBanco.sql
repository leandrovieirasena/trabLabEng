CREATE DATABASE gerestoque

USE gerestoque

DROP TABLE IF EXISTS funcionarios;

CREATE TABLE funcionarios(
	codigo int not null auto_increment,
    nome varchar(50) not null,
    rg varchar(15) not null,
    cpf varchar(15) not null unique,
    telefone varchar(15),
    celular varchar(15) not null,
    data_nascimento date not null,
    email varchar(50),
    senha varchar(5) not null,
    acesso char(1),
    CONSTRAINT chk_Acesso CHECK (acesso = 'A' OR acesso = 'F' OR acesso = 'V'),
    primary key(codigo)
)

INSERT INTO funcionarios( nome, rg, cpf, telefone, celular, data_nascimento, email, senha, acesso)
VALUES ('Mateus Andrade','12.456.072-3','123.123.123-67','11-2541-6302','11-98746-3620','1990/02/23','email@email','1234','A')

INSERT INTO funcionarios( nome, rg, cpf, telefone, celular, data_nascimento, email, senha, acesso)
VALUES ('admin','124560723','5454','11-2541-6302','11-98746-3620','1990/02/23','email@email','1234','A')

SELECT * FROM funcionarios WHERE cpf LIKE '%5454%' AND senha LIKE '%1234%'

/* Executar/chamar procedure */

DELIMITER $$

CREATE PROCEDURE Selecionar_Funcionarios()
BEGIN
	SELECT * FROM funcionarios;
END $$
DELIMITER ;

Call Selecionar_Funcionarios()

/* Executar/chamar procedure */

/* Trazer ultimo funcionario cadastrado*/

SELECT * FROM funcionarios WHERE codigo = (SELECT MAX(codigo) FROM funcionarios)

/* Trazer ultimo funcionario cadastrado*/
