package com.api.infrastructure.adapters;

import com.api.application.dtos.inputDTOS.UserInputDTO;
import com.api.application.dtos.outputDTOS.UserOutputDTO;
import com.api.core.ports.repositories.UserRepositoryPort;
import com.api.infrastructure.entities.UserEntity;
import com.api.infrastructure.repository.SpringRepositoryUser;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserService implements UserRepositoryPort {
private SpringRepositoryUser springRepositoryUser;

public UserService(SpringRepositoryUser springRepositoryUser){
    this.springRepositoryUser = springRepositoryUser;
}

    @Override
    public List<UserOutputDTO> getAllUsers() {
      springRepositoryUser.findAll();
      return null;
    }

    @Override
    public UserOutputDTO createUser(UserInputDTO userInputDTO) {
        UserEntity userEntity = new UserEntity(userInputDTO);
         springRepositoryUser.save(userEntity);
         return null;
    }
}
