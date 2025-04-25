package com.api.application.controllers;

import com.api.application.dtos.inputDTOS.UserInputDTO;
import com.api.application.dtos.outputDTOS.UserOutputDTO;
import com.api.infrastructure.adapters.UserService;
import com.api.infrastructure.entities.UserEntity;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class UserController {
    private UserService service;

    public UserController(UserService service) {
        this.service = service;
    }
    @PreAuthorize("hasAnyRole('USER', 'ADMIN')")
    @GetMapping("/user")
    @ResponseStatus(HttpStatus.OK)
    public List<UserEntity> getAllUsers() {
        return service.getAllUsers();
    }
    @PostMapping("/user")
    public UserOutputDTO createUser(@RequestBody UserInputDTO userInputDTO) {
        return service.createUser(userInputDTO);
    }

    @PutMapping("/user/{id}")
    public UserOutputDTO updateUser(@PathVariable Long id, @RequestBody UserInputDTO userInputDTO) {
        return service.updateUser(id, userInputDTO);
    }
    @DeleteMapping("/user/{id}")
    public void deleteUser(@PathVariable Long id){
        service.deleteUser(id);
    }
}
