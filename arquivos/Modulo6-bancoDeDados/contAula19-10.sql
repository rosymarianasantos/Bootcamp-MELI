#exemplo tabelas temporarias

use movies_db;

create temporary table actors_temp
select first_name, last_name
from actors
where rating > 5;

select * from act		ors_temp;

select first_name from actors_temp where first_name like '%Sam%';