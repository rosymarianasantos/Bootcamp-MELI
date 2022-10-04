package Service;

import Model.Blog;
import Repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BlogService implements IService {
    @Autowired
    private BlogRepository repo;

    @Override
    public void save(Blog blog) {
        repo.save(blog);
    }

    @Override
    public List<Blog> getAll() {
        return repo.getBlogList().stream().collect(Collectors.toList());
    }

    @Override
    public List<Blog> getById(int id) {
        return repo.getBlogList().stream().filter(p->p.getId() == id).collect(Collectors.toList());
    }
}
