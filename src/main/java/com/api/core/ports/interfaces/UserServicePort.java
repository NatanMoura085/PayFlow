package com.api.core.ports.interfaces;

import com.api.application.dtos.inputDTOS.UserInputDTO;
import com.api.application.dtos.outputDTOS.UserOutputDTO;

public interface UserServicePort {
    UserOutputDTO createUser(UserInputDTO userInputDTO);

    UserOutputDTO getUserById(Long id);

    UserOutputDTO updateUser(Long id, UserInputDTO userInputDTO);

    void deleteUser(Long id);
}
