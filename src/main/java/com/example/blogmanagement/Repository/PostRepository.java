package com.example.blogmanagement.Repository;

import com.example.blogmanagement.Model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {
}
