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
@Table(name = "movies")
public class Movies {
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

    @Column(name = "rating")
    private BigDecimal rating;

    @Column(name = "awards")
    private Long awards;

    @JsonIgnore
    @Column(name = "releaseDate")
    private Timestamp releaseDate;

    @JsonIgnore
    @Column(name = "length")
    private BigDecimal length;

    @Column(name = "genreId")
        private Long genreId;

    @ManyToMany(mappedBy = "movies")
    @JsonIgnoreProperties("movies")
    private Set<Actors> actors;

    @ManyToOne
    @JoinColumn(name = "genreId", insertable = false, updatable = false)
    @JsonIgnoreProperties("movies")
    private Genres genres;

}
