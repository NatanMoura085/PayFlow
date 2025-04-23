package com.api.core.ports.repositories;

import com.api.application.dtos.inputDTOS.UserInputDTO;
import com.api.application.dtos.outputDTOS.UserOutputDTO;

import java.util.List;

public interface UserRepositoryPort {

    List<UserOutputDTO> getAllUsers();
    UserOutputDTO createUser(UserInputDTO userInputDTO);

}
