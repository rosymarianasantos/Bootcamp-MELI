package Model;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Blog {
    private int id;
    private String titulo;
    private String autor;
    //private Date data;
}
