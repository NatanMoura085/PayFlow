package com.api.core.ports.repositories;

import com.api.application.dtos.inputDTOS.UserInputDTO;
import com.api.application.dtos.outputDTOS.UserOutputDTO;

import java.util.List;

public interface UserRepositoryPort {

    List<?> getAllUsers();
    UserOutputDTO createUser(UserInputDTO userInputDTO);
    UserOutputDTO updateUser(Long id, UserInputDTO userInputDTO);
    void deleteUser(Long id);

}
