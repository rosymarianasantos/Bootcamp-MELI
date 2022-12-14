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
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "genres")
public class Genres {
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

    @Column(name = "name")
    private String name;

    @Column(name = "ranking")
    private BigDecimal ranking;

    @Column(name = "active")
    private byte active;

    @OneToMany(mappedBy="genres", fetch = FetchType.LAZY)
    @JsonIgnoreProperties("genres")
    private List<Movies> movies;
}
