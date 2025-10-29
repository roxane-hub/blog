package com.example.blogmanagement.Controller;

import com.example.blogmanagement.Model.Comment;
import com.example.blogmanagement.Service.CommentService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/comments")
public class CommentController {
    private final CommentService service;

    public CommentController(CommentService service) {
        this.service = service;
    }

    @PostMapping
    public Comment addComment(@RequestBody Comment comment) {
        return service.saveComment(comment);
    }

    @GetMapping
    public List<Comment> getComments() {
        return service.getAllComments();
    }
}
