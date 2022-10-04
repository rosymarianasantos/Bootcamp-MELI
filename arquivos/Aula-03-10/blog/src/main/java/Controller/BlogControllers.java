package Controller;

import DTO.BlogDTO;
import Model.Blog;
import Service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/blog")
public class BlogControllers {
    @Autowired
    private BlogService blogService;
    private BlogDTO blogDTO;

    public List<Blog> getAll() {
        return blogService.getAll();
    }
    @GetMapping("/{id}")
    public ResponseEntity<List<BlogDTO>> getById(@PathVariable int id){
        List<Blog> blog = blogService.getById(id);
        return (ResponseEntity<List<BlogDTO>>) blog;
    }

    @PostMapping("save")
    public ResponseEntity<Blog> save(@RequestBody Blog blog) {
        blogService.save(blog);
        return ResponseEntity.ok(blog);
    }

}
