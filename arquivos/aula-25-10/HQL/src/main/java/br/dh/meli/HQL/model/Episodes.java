package br.dh.meli.HQL.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "episodes")
public class Episodes {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;

    @JsonIgnore
    @Column(name = "created_at")
    private Timestamp createdAt;

    @JsonIgnore
    @Column(name = "updated_at")
    private Timestamp updatedAt;

    @Column(name = "title")
    private String title;

    @Column(name = "number")
    private Long number;

    @JsonIgnore
    @Column(name = "release_date")
    private Timestamp releaseDate;

    @Column(name = "rating")
    private BigDecimal rating;

    @Column(name = "season_id")
    private Long seasonId;

    @ManyToMany(mappedBy = "episodes")
    @JsonIgnoreProperties("episodes")
    private Set<Actors> actors;

}
