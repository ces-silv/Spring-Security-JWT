package org.cash.SpringSecurityWithJWT.project.repository;

import org.cash.SpringSecurityWithJWT.project.models.CreateUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<CreateUserEntity, UUID> {

    CreateUserEntity findByUsername(String username);

}
