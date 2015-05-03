create table aluno(
 id INTEGER  NOT NULL  PRIMARY key,
 nome varchar(60) not null,
 endereco varchar(60) not null,
 bairro varchar(60) not null,
 cidade varchar(60) not null,
 data_nascimento date,
 email varchar(80),
 cpf INTEGER  (11),
 telefone INTEGER  (12),
);

