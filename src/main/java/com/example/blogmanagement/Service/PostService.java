package com.example.blogmanagement.Service;

import com.example.blogmanagement.Model.Post;
import com.example.blogmanagement.Repository.mongo.PostRepository;
import com.example.blogmanagement.dto.PostDTO;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostService {

    private final PostRepository repo;

    public PostService(PostRepository repo) {
        this.repo = repo;
    }

    public PostDTO savePost(PostDTO postDTO) {
        Post post = new Post();
        post.setTitle(postDTO.getTitle());
        post.setContent(postDTO.getContent());

        Post saved = repo.save(post);

        return new PostDTO(saved.getId(), saved.getTitle(), saved.getContent());
    }

    public List<PostDTO> getAllPosts() {
        return repo.findAll()
                .stream()
                .map(post -> new PostDTO(post.getId(), post.getTitle(), post.getContent()))
                .collect(Collectors.toList());
    }
}
