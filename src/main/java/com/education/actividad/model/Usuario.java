package com.education.actividad.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "usuarios")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Usuario {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String nombre;
  private String telefono;
  private String apellido;
  private String email;

  @OneToOne(mappedBy = "usuario", cascade = CascadeType.ALL)
  private Ciudadano ciudadano;

  @OneToOne(mappedBy = "usuario", cascade = CascadeType.ALL)
  private Gestor gestor;
}
