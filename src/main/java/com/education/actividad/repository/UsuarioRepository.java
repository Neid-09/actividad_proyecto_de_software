package com.education.actividad.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.education.actividad.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
