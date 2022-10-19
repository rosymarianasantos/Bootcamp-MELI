USE movies_db;
#1. Mostrar o título e o nome do gênero de todas as séries.
SELECT DISTINCT series.title, genres.name
FROM series
INNER JOIN genres
ON series.genre_id = genres.id;

#2. Mostrar o título dos episódios, o nome e sobrenome dos atores que trabalham em
#cada um deles.
SELECT episodes.title, actors.first_name, actors.last_name 
FROM actors
INNER JOIN actor_episode
ON actors.id = actor_episode.actor_id
INNER JOIN episodes
ON episodes.id = actor_episode.episode_id;


#3. Mostrar o título de todas as séries e o número total de temporadas que cada uma
#delas possui.
SELECT DISTINCT series.title, COUNT(*) AS temporadas  FROM seasons
INNER JOIN series
on seasons.serie_id = series.id
group by series.id;

#4. Mostrar o nome de todos os gêneros e o número total de filmes de cada um, desde
#que seja maior ou igual a 3.
SELECT genres.name, COUNT(*) AS num_filmes FROM movies
INNER JOIN genres
ON movies.genre_id = genres.id
GROUP BY genres.id
HAVING num_filmes >= 3;

#5. Mostrar apenas o nome e sobrenome dos atores que atuam em todos os filmes de
#Star Wars e que estes não se repitam.
SELECT actors.first_name, actors.last_name, movies.title FROM actors
INNER JOIN actor_movie
ON actor_movie.actor_id = actors.id
INNER JOIN movies
ON movies.id = actor_movie.movie_id
WHERE movies.title LIKE 'La Guerra de las galaxias%';

