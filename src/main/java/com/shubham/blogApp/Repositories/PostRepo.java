package com.shubham.blogApp.Repositories;

import com.shubham.blogApp.Entities.Category;
import com.shubham.blogApp.Entities.Post;
import com.shubham.blogApp.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepo extends JpaRepository<Post, Integer> {

    List<Post> findAllByUser(User user);

    List<Post> findByCategory(Category category);

    List<Post> findByTitleContaining(String title);
}
