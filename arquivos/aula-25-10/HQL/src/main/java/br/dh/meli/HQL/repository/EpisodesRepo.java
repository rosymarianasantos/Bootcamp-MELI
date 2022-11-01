package br.dh.meli.HQL.repository;

import br.dh.meli.HQL.model.Episodes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
public interface EpisodesRepo extends JpaRepository<Episodes, Long> {
    @Query(value = "select * from episodes" +
            " inner join actor_episode" +
            " on actor_episode.episode_id = episodes.id" +
            " inner join actors" +
            " on actors.id = actor_episode.actor_id" +
            " where actors.first_name like :nome and actors.last_name like :sobrenome", nativeQuery = true)
    List<Episodes> findEpisodeByActor(String nome, String sobrenome);

}
