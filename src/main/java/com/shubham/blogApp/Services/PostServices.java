package com.shubham.blogApp.Services;

import com.shubham.blogApp.Entities.Post;
import com.shubham.blogApp.Payloads.PostDto;

import java.util.List;

public interface PostServices {

    // Create post
    PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);

    // Update post
    PostDto updatePost(PostDto postDto, Integer postId);

    // Delete post
    void deletePost(Integer postId);

    // Get All Post
    List<PostDto> getAllPost();

    // Get Single post
    PostDto getPostById(Integer postId);

    // Get all post by Category...
    List<PostDto> getPostsByCategory(Integer categoryID);

    // Get all post by user ...
    List<PostDto> getPostsByUser(Integer userId);

    // Search Post
    List<PostDto> searchPosts(String keyword);


}
