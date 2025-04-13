package com.api.core.ports.repositories;

import com.api.application.dtos.outputDTOS.UserOutputDTO;

public interface UserRepositoryPort {
    void saveUser(Long userId,String username,String email);
    UserOutputDTO getUser(Long userId);
}
