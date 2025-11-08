package com.example.blogmanagement.Controller;

import com.example.blogmanagement.Service.UserService;
import com.example.blogmanagement.dto.UserDTO;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping("/register")
    public UserDTO addUser(@Valid @RequestBody UserDTO userDTO) {
        return service.saveUserdto(userDTO);
    }

    @GetMapping
    public Page<UserDTO> getAllUsers(Pageable pageable) {
        return service.getAllUsers(pageable);
    }

    @GetMapping("/{id}")
    public Optional<UserDTO> getUserById(@PathVariable Long id) {
        return service.getUsers(id);
    }

    @PutMapping("/{id}")
    public UserDTO updateUser(@PathVariable Long id, @Valid @RequestBody UserDTO userDTO) {
        return service.updateUser(id, userDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        service.deleteUser(id);
    }
}
