package com.education.actividad.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.education.actividad.model.Usuario;
import com.education.actividad.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {
  private final UserRepository userRepository;

  public List<Usuario> obtnerTodosLosUsuarios() {
    return userRepository.findAll();
  }

  public Optional<Usuario> obtenerUsuarioPorId(Long id) {
    return userRepository.findById(id);
  }

  public Usuario crearUsuario(Usuario user) {
    return userRepository.save(user);
  }
}
