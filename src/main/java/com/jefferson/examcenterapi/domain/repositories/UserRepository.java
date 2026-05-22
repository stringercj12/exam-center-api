package com.jefferson.examcenterapi.domain.repositories;


import com.jefferson.examcenterapi.domain.entities.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
  @Query(value = "SELECT u FROM User u JOIN FETCH u.role", countQuery = "SELECT count(u) FROM User u")
  Page<User> findAllWithRolePaged(Pageable pageable);
}
