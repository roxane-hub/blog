package com.example.blogmanagement.Service;

import com.example.blogmanagement.Model.User;
import com.example.blogmanagement.Repository.jpa.UserRepository;
import com.example.blogmanagement.dto.UserDTO;
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

    public UserDTO saveUserdto(@Valid UserDTO userDTO) {
        User user = new User();
        user.setUsername(userDTO.getUsername());
        user.setEmail(userDTO.getEmail());
        // set password separately if needed

        User saved = repo.save(user);
        return mapToDTO(saved);
    }

    public Page<UserDTO> getAllUsers(Pageable pageable) {
        return repo.findAll(pageable).map(this::mapToDTO);
    }

    public UserDTO updateUser(Long id, @Valid UserDTO userDTO) {
        User user = repo.findById(id).orElseThrow(() -> new RuntimeException("User not found"));

        user.setUsername(userDTO.getUsername());
        user.setEmail(userDTO.getEmail());

        User updated = repo.save(user);
        return mapToDTO(updated);
    }


    public void deleteUser(Long id) {
        if (!repo.existsById(id)) {
            throw new RuntimeException("User not found");
        }
        repo.deleteById(id);
    }

    public Optional<UserDTO> getUsers(Long id) {
        return repo.findById(id).map(this::mapToDTO);
    }

    private UserDTO mapToDTO(User user) {
        return new UserDTO(user.getId(), user.getUsername(), user.getEmail());
    }
}
