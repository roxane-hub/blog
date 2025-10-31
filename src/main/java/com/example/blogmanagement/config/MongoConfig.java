package com.example.blogmanagement.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "com.example.blogmanagement.Repository.mongo")
public class MongoConfig {
}
