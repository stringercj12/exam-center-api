package com.jefferson.examcenterapi.controllers;

import com.jefferson.examcenterapi.dto.response.UserResponse;
import com.jefferson.examcenterapi.dto.response.UsersResponse;
import com.jefferson.examcenterapi.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/user")
@RequiredArgsConstructor
public class UserController {

  private final UserService userService;


  @GetMapping
  public ResponseEntity<UsersResponse> findUsers(Pageable pageable) {
    return ResponseEntity.ok().body(new UsersResponse(userService.findUsers(pageable)));
  }




}
