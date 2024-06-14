package com.example.app.server.model;

import jakarta.persistence.*;
import lombok.Data;

/**
 *
 * @author a-tachihara
 */
@Entity
@Data
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String title;
  private String description;
  private boolean completed;
}
