package com.jefferson.examcenterapi.dto.response;

import com.jefferson.examcenterapi.domain.entities.User;

import java.util.UUID;

public record UserResponse(
    UUID id,
    String name,
    String email,
    String phone,
    UUID roleId,
    String roleName
) {

  public static UserResponse fromEntity(User user) {
     return new UserResponse(
         user.getId(),
         user.getName(),
         user.getEmail(),
         user.getPhone(),
         user.getRole() != null ? user.getRole().getId() : null,
         user.getRole() != null ? user.getRole().getName() : null
     );
  }
}
