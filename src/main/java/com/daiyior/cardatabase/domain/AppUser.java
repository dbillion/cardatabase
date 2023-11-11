package com.daiyior.cardatabase.domain;

import jakarta.persistence.*;
import lombok.*;
import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class AppUser {
 @Id
 @GeneratedValue(strategy=GenerationType.AUTO)
 @Column(nullable=false, updatable=false)
 private Long id;
 @Column(nullable=false, unique=true)
 private String username;
 @Column(nullable=false)
 private String password;
 
 @Column(nullable=false)
 private String role;

  public AppUser(String username, String password, String role) {
 super();
 this.username = username;
 this.password = password;
 this.role = role;
 }
// Constructors, getters and setters 



}
 