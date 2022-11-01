package br.dh.meli.HQL.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "series")
public class Series {
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

    @JsonIgnore
    @Column(name = "release_date")
    private Timestamp releaseDate;

    @JsonIgnore
    @Column(name = "end_date")
    private Timestamp endDate;

    @Column(name = "genreId")
    private Long genreId;

//
//    @ManyToOne
//    @JoinColumn(name = "serie_id", insertable = false, updatable = false)
//    @JsonIgnoreProperties("series")
//    private Seasons seasons;

    @OneToMany(mappedBy="series", fetch = FetchType.LAZY)
    @JsonIgnoreProperties("series")
    private List<Seasons> seasons;

}
