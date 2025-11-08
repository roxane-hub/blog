package com.example.blogmanagement.Controller;

import com.example.blogmanagement.Service.PostService;
import com.example.blogmanagement.dto.PostDTO;
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
    public PostDTO addPost(@RequestBody PostDTO postDTO) {
        return service.savePost(postDTO);
    }

    @GetMapping
    public List<PostDTO> getAllPosts() {
        return service.getAllPosts();
    }
}
