package Service;

import Model.Blog;

import java.util.List;

public interface IService {
    void save(Blog post);
    List<Blog> getAll();
    List<Blog> getById(int id);
}
