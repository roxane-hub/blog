package com.example.blogmanagement.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

import java.time.LocalDateTime;

@Document(collection = "posts")
@Data
public class Post {
    @Id
    private String id;
    private String title;
    private String content;
    private String authorId;
    private LocalDateTime createdDate;
}
