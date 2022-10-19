DROP DATABASE IF EXISTS empresa_db;
CREATE DATABASE empresa_db;
USE empresa_db;
 
CREATE TABLE funcionario (
    cod_fuc varchar(100),
    nome varchar(100),
    sobrenome varchar(100),
	cargo varchar(100),
    data_alta date,
    salario double,
    comissao double,
    depto_nro varchar(100),
    primary key(cod_fuc)
);

INSERT INTO funcionario VALUES('E-0001', 'César', 'Piñero', 'Vendedor', '2018-05-12', 80000, 15000, 'D-000-4');
INSERT INTO funcionario VALUES('E-0002', 'Yosep', 'Kowaleski', 'Analista', '2015-07-14', 140000, 0, 'D-000-2');
INSERT INTO funcionario VALUES('E-0003', 'Mariela', 'Barrios', 'Diretor', '2014-06-05', 185000, 0, 'D-000-3');
INSERT INTO funcionario VALUES('E-0004', 'Jonathan', 'Aguilera', 'Vendedor', '2015-06-03', 85000, 10000, 'D-000-4');
INSERT INTO funcionario VALUES('E-0005', 'Daniel', 'Brezezicki', 'Vendedor', '2018-03-03', 83000, 10000, 'D-000-4');
INSERT INTO funcionario VALUES('E-0006', 'Mito', 'Barchuk', 'Presidente', '2014-06-05', 190000, 0, 'D-000-3');
INSERT INTO funcionario VALUES('E-0007', 'Emilio', 'Galarza', 'Desenvolvedor', '2014-08-02', 60000, 0, 'D-000-1');

CREATE TABLE departamento (
	depto_nro varchar(100),
    nome_depto varchar(100),
    localização varchar(100),
    primary key(depto_nro)
);

INSERT INTO departamento VALUES('D-000-1', 'Software', 'Los Tigres');
INSERT INTO departamento VALUES('D-000-2', 'Sistemas', 'Guadalupe');
INSERT INTO departamento VALUES('D-000-3', 'Contabilidade', 'La Roca');
INSERT INTO departamento VALUES('D-000-4', 'Vendas', 'Plata');

#1. Selecione o nome, cargo e localização dos departamentos onde os vendedores
#trabalham.
SELECT funcionario.nome, funcionario.cargo, departamento.localização
FROM funcionario inner join departamento
on funcionario.depto_nro = departamento.depto_nro;

#2. Visualize departamentos com mais de cinco funcionários.
SELECT departamento.nome_depto, count(funcionario.depto_nro) 
FROM departamento INNER JOIN funcionario
on departamento.depto_nro = funcionario.depto_nro 
GROUP BY departamento.nome_depto
HAVING count(funcionario.depto_nro) > 1;

#3. Exiba o nome, salário e nome do departamento dos funcionários que têm o mesmo
#cargo que 'Mito Barchuk'.
SELECT funcionario.nome, funcionario.salario, departamento.nome_depto
FROM funcionario
INNER JOIN departamento
ON funcionario.depto_nro = departamento.depto_nro
WHERE funcionario.cargo = 'Presidente';


#4. Mostre os dados dos funcionários que trabalham no departamento de contabilidade,
#ordenados por nome.
SELECT *
FROM funcionario
INNER JOIN departamento
ON funcionario.depto_nro = departamento.depto_nro
WHERE departamento.nome_depto = 'Contabilidade';

#5. Mostre o nome do funcionário que tem o menor salário.
SELECT nome, sobrenome, salario
FROM funcionario
ORDER BY salario
LIMIT 1;

#6. Mostre os dados do funcionário que tem o maior salário no departamento 'Vendas'.
SELECT *
FROM funcionario
INNER JOIN departamento
ON funcionario.depto_nro = departamento.depto_nro
WHERE departamento.nome_depto = 'Vendas'
ORDER BY salario DESC
LIMIT 1;