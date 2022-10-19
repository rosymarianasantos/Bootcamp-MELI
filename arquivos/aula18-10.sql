USE movies_db;
# Mostrar todos os registros da tabela de filmes.
SELECT * FROM movies;

# Mostrar o nome, sobrenome e classificação de todos os atores.
SELECT first_name, last_name, rating FROM actors;

#Mostrar o título de todas as séries e use alias para que tanto o nome da tabela
#quanto o campo estejam em Português.
SELECT title as titulo FROM series as Séries;

# Mostrar o nome e sobrenome dos atores cuja classificação é superior a 7,5.
SELECT first_name, last_name FROM actors
WHERE rating > 7.5;

# Mostrar o título dos filmes, a classificação e os prêmios dos filmes com classificação
#superior a 7,5 e com mais de dois prêmios.
SELECT title, rating, awards FROM movies
WHERE rating > 7.5 AND awards > 2;

# Mostrar o título dos filmes e a classificação ordenados por classificação em ordem
# crescente.
SELECT title, rating FROM movies
ORDER BY rating;

#Mostrar os títulos dos três primeiros filmes no banco de dados.
SELECT title FROM movies
LIMIT 3;

#Mostrar os 5 melhores filmes com a classificação mais alta.
SELECT * FROM movies
ORDER BY rating DESC
LIMIT 5;

#Listar os 10 primeiros atores.
SELECT * FROM actors
LIMIT 10;

# Mostrar o título e a classificação de todos os filmes cujo título é Toy Story.
SELECT title, rating FROM movies
WHERE title LIKE '%Toy Story%';

# Mostrar todos os atores cujos nomes começam com Sam.
SELECT * FROM actors
WHERE first_name LIKE 'Sam%
';

# Mostrar o título dos filmes que saíram entre 2004 e 2008.
SELECT title, release_date FROM movies
WHERE year(release_date) BETWEEN '2004' AND '2008';

# Mostrar o título dos filmes com classificação superior a 3, com mais de 1 prêmio e
#com data de lançamento entre 1988 e 2009. Ordenar os resultados por
#classificação.
SELECT title, rating, awards, release_date FROM movies
WHERE rating > 3 AND awards > 1 AND year(release_date) between '1988' AND '2009'
ORDER BY rating; 

#inserir um novo registro no BD na tabela de actors
INSERT INTO actors VALUES(null, null, null, 'Daniel', 'Santos', 8.7, 1);
#ou
INSERT INTO actors (first_name, last_name, rating, favorite_movie_id)
VALUES('Marcos', 'Silva', 9.5, 2);

#atualiza o ator numero 51 para o nome Mauri
update actors
set first_name = 'Mauri'
WHERE id = 41;

SELECT * FROM actors where id = 41;

#apaga o registro com id 41
delete from actors
WHERE id = 51;

#numero de series cadastradas
SELECT count(*) FROM series;

#qual a media de notas do atores?
SELECT ROUND(AVG(rating), 2) AS media FROM actors;

#qual a contidade de episodios que cada ator atuou
#somente quem atuou em pelo menos 10 episodios
USE movies_db;
SELECT actor_id, COUNT(episode_id) FROM actor_episode as participacoes
GROUP BY actor_id
HAVING count(episode_id) >= 10;
