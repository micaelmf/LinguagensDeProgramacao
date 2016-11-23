-- 
	/*
		pacote java.sql
		api - jdbc
		classe - DriverManager
	*/

CREATE DATADABASE include;

CREATE TABLE include.membros(
	id BIGINT AUTO_INCREMENT PRIMARY KEY NOT NULL,
	nome_completo VARCHAR(255) NOT NULL,
	cpf INT(255) NOT NULL,
	rg INT(255) NOT NULL,
	orgao_exp VARCHAR(255) NOT NULL,
	curso VARCHAR(255) NOT NULL,
	email VARCHAR(255) NOT NULL,
	celular VARCHAR(255) NOT NULL,
	logradouro VARCHAR(255) NOT NULL,
	numero INT(255) NOT NULL,
	referencia VARCHAR(255) NOT NULL,
	bairro VARCHAR(255) NOT NULL,
	cidade VARCHAR(255) NOT NULL,
	estado VARCHAR(255) NOT NULL,
	aceito VARCHAR(255) NOT NULL,
);