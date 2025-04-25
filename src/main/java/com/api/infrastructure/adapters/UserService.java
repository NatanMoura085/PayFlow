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
    public List<UserEntity> getAllUsers() {

      return springRepositoryUser.findAll();

    }

    @Override
    public UserOutputDTO createUser(UserInputDTO userInputDTO) {
        UserEntity userEntity = new UserEntity(userInputDTO);
         springRepositoryUser.save(userEntity);
         return null;
    }

    @Override
    public UserOutputDTO updateUser(Long id, UserInputDTO userInputDTO) {
        UserEntity userEntity = springRepositoryUser.findById(id).orElseThrow();
        //  userEntity.setId(id);
        UserEntity user = springRepositoryUser.save(userEntity);
        springRepositoryUser.save(user);
        return null;
    }

    @Override
    public void deleteUser(Long id) {
        springRepositoryUser.deleteById(id);
    }
}
