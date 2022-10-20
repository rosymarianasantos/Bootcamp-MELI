USE movies_db;
#1. Adicione um filme à tabela de filmes.
SELECT * FROM movies;
INSERT INTO movies VALUES(null,null, null, "Duna", 9.8, 3, '2022-02-04 00:00:00', 240, 5);
SELECT * FROM movies;

#2. Adicione um gênero à tabela de gêneros.
SELECT * FROM genres;
INSERT INTO genres VALUES(null,'2022-02-04 00:00:00',null, 'Comedia Romantica', 13, 1);

#3. Associe o filme do ponto 1. com o gênero criado no ponto 2.
UPDATE movies set genre_id = 13 WHERE title = 'Duna';

#4. Modifique a tabela de atores para que pelo menos um ator tenha o filme adicionado
#no ponto 1 como favorito.
SELECT * FROM actors;
UPDATE actors set favorite_movie_id = 13 WHERE favorite_movie_id is null;

#5. Crie uma tabela temporária da tabela filmes.
CREATE TEMPORARY TABLE movies_temp select title, rating, awards from movies;
select * from movies_temp;

#6. Elimine dessa tabela temporária todos os filmes que ganharam menos de 5 prêmios.
DELETE FROM movies_temp
WHERE awards < 5;

#7. Obtenha a lista de todos os gêneros que possuem pelo menos um filme.
SELECT * FROM genres;
SELECT * FROM movies;

SELECT genres.name, COUNT(movies.genre_id) from movies
INNER JOIN genres
ON movies.genre_id = genres.id
GROUP BY genres.id
having COUNT(movies.genre_id) > 0;

#8. Obtenha a lista de atores cujo filme favorito ganhou mais de 3 prêmios.
SELECT * FROM actors;
SELECT * FROM movies;

SELECT actors.first_name, actors.last_name, COUNT(movies.awards) from movies
INNER JOIN actor_movie
ON movies.id = actor_movie.movie_id
INNER JOIN actors
ON actors.id = actor_movie.movie_id
GROUP BY actors.id
having COUNT(movies.awards) > 3;

#9. Crie um índice no nome na tabela de filmes.
SHOW INDEX FROM movies;
CREATE INDEX movies ON movies(id);

#10. Verifique se o índice foi criado corretamente.
SHOW INDEX FROM movies;