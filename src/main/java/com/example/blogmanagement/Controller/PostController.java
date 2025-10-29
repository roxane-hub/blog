package com.example.blogmanagement.Controller;

import com.example.blogmanagement.Model.Post;
import com.example.blogmanagement.Service.PostService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {
    private final PostService service;

    public PostController(PostService service) {
        this.service = service;
    }

    @PostMapping
    public Post createPost(@RequestBody Post post) {
        return service.savePost(post);
    }

    @GetMapping
    public List<Post> getPosts() {
        return service.getAllPosts();
    }
}
