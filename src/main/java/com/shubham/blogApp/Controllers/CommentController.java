package com.shubham.blogApp.Controllers;

import com.shubham.blogApp.Payloads.ApiResponse;
import com.shubham.blogApp.Payloads.CommentDto;
import com.shubham.blogApp.Services.CommentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CommentController {

    @Autowired
    private CommentServices commentServices;

    @PostMapping("/post/{postId}/comments")
    ResponseEntity<CommentDto> createComment(@RequestBody CommentDto commentDto, @PathVariable Integer postId) {
        CommentDto createdComment = this.commentServices.createComment(commentDto, postId);
        return new ResponseEntity<>(createdComment, HttpStatus.CREATED);
    }

    @DeleteMapping("/comments/{commentId}")
    ResponseEntity<ApiResponse> deleteComment(@PathVariable Integer commentId) {
        this.commentServices.deleteComment(commentId);
        return new ResponseEntity<>(new ApiResponse("Deleted successfully", true), HttpStatus.OK);
    }
}
