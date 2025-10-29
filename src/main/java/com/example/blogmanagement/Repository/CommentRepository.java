package com.example.blogmanagement.Repository;

import com.example.blogmanagement.Model.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CommentRepository extends MongoRepository<Comment, String> {
}
