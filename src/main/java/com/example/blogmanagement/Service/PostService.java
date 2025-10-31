package com.example.blogmanagement.Service;

import com.example.blogmanagement.Model.Post;
import com.example.blogmanagement.Repository.mongo.PostRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PostService {
    private final PostRepository repo;

    public PostService(PostRepository repo) {
        this.repo = repo;
    }

    public Post savePost(Post post) {
        return repo.save(post);
    }

    public List<Post> getAllPosts() {
        return repo.findAll();
    }
}
