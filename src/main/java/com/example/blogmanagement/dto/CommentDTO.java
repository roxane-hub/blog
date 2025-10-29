package com.example.blogmanagement.dto;

public class CommentDTO {

    private String id;
    private String text;
    private String commenter;

    public CommentDTO() {}

    public CommentDTO(String id, String text, String commenter) {
        this.id = id;
        this.text = text;
        this.commenter = commenter;

    }}