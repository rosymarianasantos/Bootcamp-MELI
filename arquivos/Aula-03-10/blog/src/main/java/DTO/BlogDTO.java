package DTO;

import Model.Blog;
import lombok.Data;

import java.util.Date;

@Data
public class BlogDTO {
    private int id;
    private String titulo;
    private String autor;
    //private Date data;

    public BlogDTO(int id, String titulo, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
    }

    public static BlogDTO convertToDto(Blog blog){
        return new BlogDTO(blog.getId(), blog.getTitulo(), blog.getAutor());
    }
}
