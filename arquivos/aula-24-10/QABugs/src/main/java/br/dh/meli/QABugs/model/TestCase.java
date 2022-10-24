package br.dh.meli.QABugs.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class TestCase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_case;

    @Column(length = 125, nullable = false)
    private String description;

    private boolean tested;

    private boolean passed;

    private int number_of_tries;

    @Column(nullable = false)
    private Date lastUpdate;

    @Override
    public String toString() {
        return "TestCase{" +
                "id_case=" + id_case +
                ", description='" + description + '\'' +
                ", tested=" + tested +
                ", passed=" + passed +
                ", number_of_tries=" + number_of_tries +
                ", last_update=" + lastUpdate +
                '}';
    }
}
