package com.example.blogmanagement.Repository;

import com.example.blogmanagement.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
