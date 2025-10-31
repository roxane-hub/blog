package com.example.blogmanagement.Service;
import com.example.blogmanagement.Model.Comment;
import com.example.blogmanagement.Repository.mongo.CommentRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CommentService {
    private final CommentRepository repo;

    public CommentService(CommentRepository repo) {
        this.repo = repo;
    }

    public Comment saveComment(Comment comment) {
        return repo.save(comment);
    }

    public List<Comment> getAllComments() {
        return repo.findAll();
    }
}
