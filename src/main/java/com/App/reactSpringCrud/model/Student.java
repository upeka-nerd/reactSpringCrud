package com.App.reactSpringCrud.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.NaturalId;
import org.hibernate.annotations.NotFound;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String firstName;
  private String lastName;
  @NaturalId(mutable = true)
  private String email;
  private String department;


}
