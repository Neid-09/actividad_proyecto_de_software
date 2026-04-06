package com.education.actividad.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ciudadanos")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Ciudadano {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private Integer puntosContribucion;

  @OneToOne
  @JoinColumn(name = "usuario_id", referencedColumnName = "id", unique = true)
  private UserEntity usuario;
}
