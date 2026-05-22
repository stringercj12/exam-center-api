package com.jefferson.examcenterapi.domain.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "tb_roles")
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Role {

  @GeneratedValue(strategy = GenerationType.UUID)
  @Id
  private UUID id;

  private String name;
  private String description;

  private Boolean active;

  private String createdAt;
  private String updatedAt;

}
