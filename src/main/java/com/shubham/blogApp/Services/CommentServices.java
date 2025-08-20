package com.shubham.blogApp.Services;

import com.shubham.blogApp.Payloads.CommentDto;

public interface CommentServices {

    CommentDto createComment(CommentDto commentDto, Integer postId);

    void deleteComment(Integer commentId);
}
