package com.jefferson.examcenterapi.dto.response;


import org.springframework.data.domain.Page;

import java.util.List;

public record UsersResponse(
    Page<UserResponse> users
) {
}
