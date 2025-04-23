package com.api.application.controllers;

import com.api.application.dtos.inputDTOS.UserInputDTO;
import com.api.infrastructure.adapters.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class UserController {
    private UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping("/user")
    public ResponseEntity<?> createUser(@RequestBody UserInputDTO userInputDTO) {
        service.createUser(userInputDTO);
        return ResponseEntity.ok(userInputDTO);
    }
}
