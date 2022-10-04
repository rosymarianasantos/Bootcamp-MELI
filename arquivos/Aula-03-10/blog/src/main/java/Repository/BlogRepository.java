package Repository;

import Model.Blog;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Data
@AllArgsConstructor
public class BlogRepository {
    private List<Blog> blogList;

    public void save(Blog blog) {
        this.blogList.add(blog);
    }

}
