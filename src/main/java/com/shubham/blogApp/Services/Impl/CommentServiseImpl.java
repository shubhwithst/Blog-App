package com.shubham.blogApp.Services.Impl;

import com.shubham.blogApp.Entities.Comment;
import com.shubham.blogApp.Entities.Post;
import com.shubham.blogApp.Exceptions.ResourceNotFoundException;
import com.shubham.blogApp.Payloads.CommentDto;
import com.shubham.blogApp.Repositories.CommentRepo;
import com.shubham.blogApp.Repositories.PostRepo;
import com.shubham.blogApp.Services.CommentServices;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiseImpl implements CommentServices {

    @Autowired
    private PostRepo postRepo;

    @Autowired
    private CommentRepo commentRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public CommentDto createComment(CommentDto commentDto, Integer postId) {
        Post post = this.postRepo.findById(postId).orElseThrow(() -> new ResourceNotFoundException("Post", "PostId", postId));
        Comment comment = this.modelMapper.map(commentDto, Comment.class);
        comment.setPost(post);
        Comment savedComment = this.commentRepo.save(comment);
        return this.modelMapper.map(savedComment, CommentDto.class);

    }

    @Override
    public void deleteComment(Integer commentId) {

        Comment comment = this.commentRepo.findById(commentId).orElseThrow(() -> new ResourceNotFoundException("Comment", "CommentId", commentId));
        this.commentRepo.delete(comment);
    }
}
