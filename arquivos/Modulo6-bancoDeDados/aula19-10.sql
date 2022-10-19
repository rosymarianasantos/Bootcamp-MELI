CREATE DATABASE bd_indice;

USE bd_indice;

CREATE TABLE USER (
	id integer,
    nome varchar(100)
);

INSERT INTO USER VALUES(1, 'Marcos');
INSERT INTO USER VALUES(1, 'Fabiana');

SELECT * FROM USER;
SELECT distinct id FROM USER;

UPDATE USER SET id = 2 WHERE nome = 'Fabiana';

alter table USER add constraint primary key(id);
#add constraint adiciona uma restricao

alter table USER add constraint unique(email);

update user set email = 'marcos@email.com' where id = 1;
update user set email = 'fabiana@email.com' where id = 2;