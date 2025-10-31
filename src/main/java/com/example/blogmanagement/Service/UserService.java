package com.example.blogmanagement.Service;

import com.example.blogmanagement.Model.User;
import com.example.blogmanagement.Repository.jpa.UserRepository;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private final UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    public User saveUserdto(User user) {
        return repo.save(user);
    }

    public Page<User> getAllUsers(Pageable pageable) {
        return repo.findAll(pageable);
    }

    public User updateUser(Long id, @Valid User user)
    {
        return user;
    }

    public void deleteUser(Long id)
    {
    }

    public Optional<User> getUsers(Long id)
    {
        return Optional.empty();
    }
}
