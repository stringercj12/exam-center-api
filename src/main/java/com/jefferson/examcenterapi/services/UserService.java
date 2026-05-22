package com.jefferson.examcenterapi.services;

import com.jefferson.examcenterapi.domain.repositories.UserRepository;
import com.jefferson.examcenterapi.dto.response.UserResponse;
import com.jefferson.examcenterapi.dto.response.UsersResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService {

  private final ExamService examService;
  private final UserRepository userRepository;


  public Page<UserResponse> findUsers(Pageable pageable){
    var users = userRepository.findAllWithRolePaged(pageable);

    return userRepository.findAllWithRolePaged(pageable).map(UserResponse::fromEntity);
  }

  public void createUser(UserResponse userResponse){
    
  }

}
