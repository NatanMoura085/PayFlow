package com.api.infrastructure.repository;

import com.api.infrastructure.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringRepositoryUser extends JpaRepository<UserEntity,Long> {
}
