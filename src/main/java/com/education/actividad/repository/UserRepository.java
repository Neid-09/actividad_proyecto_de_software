package com.education.actividad.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.education.actividad.model.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
