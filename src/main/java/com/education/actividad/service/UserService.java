package com.education.actividad.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.education.actividad.model.UserEntity;
import com.education.actividad.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
  private final UserRepository userRepository;

  public List<UserEntity> obtnerTodosLosUsuarios() {
    return userRepository.findAll();
  }

  public Optional<UserEntity> obtenerUsuarioPorId(Long id) {
    return userRepository.findById(id);
  }

  public UserEntity crearUsuario(UserEntity user) {
    return userRepository.save(user);
  }
}
