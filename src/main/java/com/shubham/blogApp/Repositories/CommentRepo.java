package com.shubham.blogApp.Repositories;

import com.shubham.blogApp.Entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepo extends JpaRepository<Comment, Integer> {
}
