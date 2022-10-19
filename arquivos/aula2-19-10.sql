USE movies_db;
#seleciona todos dos filmes
SELECT * FROM movies;

#seleciona os filmes favoritos
SELECT * FROM actors, movies
WHERE favorite_movie_id = movies.id;

#quais sao os filmes que nao é um filme preferido de nenhum ator
SELECT movies.title FROM movies
WHERE NOT EXISTS
(SELECT * FROM actors
WHERE favorite_movie_id = movies.id);

#contar quantos titulos de filmes existem em filmes favoritos
SELECT COUNT(movies.title) FROM movies
WHERE EXISTS
(SELECT * FROM actors
WHERE favorite_movie_id = movies.id);

#USANDO NOT IN
SELECT * FROM movies WHERE id NOT IN (SELECT favorite_movie_id FROM actors);

#QUANTAS TEMPORADA ESTAO CADASTRADAS
SELECT COUNT(*) AS qtde_temporadas FROM seasons;

#quantas temporadas existem para cada serie
SELECT series.title, COUNT(*) AS temporadas 
FROM seasons INNER JOIN series 
on series.id = seasons.serie_id
GROUP BY series.id;

#quantas temporadas existem para a serie the wallking dead
SELECT series.title, COUNT(*) AS temporadas 
FROM seasons INNER JOIN series 
on series.id = seasons.serie_id
WHERE series.title = 'The Walking Dead'
GROUP BY series.id;

#quais series com mais de 5 temporadas
SELECT series.title, COUNT(*) AS temporadas 
FROM seasons INNER JOIN series 
on series.id = seasons.serie_id
GROUP BY series.id
having temporadas > 5;

#quais as 3 series com maior numero de temporadas
SELECT series.title, COUNT(*) AS temporadas 
FROM seasons INNER JOIN series 
on series.id = seasons.serie_id
GROUP BY series.id
ORDER BY temporadas desc
LIMIT 3;

#Quais os nomes dos atores que trabalham em filmes com avaliacao maior que 9.1
SELECT distinct actors.first_name, actors.last_name, movies.title, movies.rating FROM actors
INNER JOIN movies
on actors.id = movies.id
INNER JOIN actor_movie
on movies.id = actor_movie.movie_id
WHERE movies.rating > 9.1; 

SELECT first_name, last_name
from actors
where id in (
	select am.actor_id
    from movies m inner join actor_movie am on m.id = am.movie_id
    where rating > 9.1
) order by first_name;            


select first_name, last_name
from movies inner join actor_movie on movies.id = actor_movie.movie_id
inner join actors on actors.id = actor_movie.actor_id
where movies.rating > 9.1
order by first_name;