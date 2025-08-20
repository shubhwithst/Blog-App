package com.shubham.blogApp.Repositories;

import com.shubham.blogApp.Entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
