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
@Table(name = "seasons")
public class Seasons {
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

    @JsonIgnore
    @Column(name = "end_date")
    private Timestamp endDate;

    @Column(name = "serieId")
    private Long serieId;

//    @OneToMany(mappedBy="seasons", fetch = FetchType.LAZY)
//    @JsonIgnoreProperties("seasons")
//    private List<Series> series;

    @ManyToOne
    @JoinColumn(name = "serieId", insertable = false, updatable = false)
    @JsonIgnoreProperties("seasons")
    private Series series;


}
