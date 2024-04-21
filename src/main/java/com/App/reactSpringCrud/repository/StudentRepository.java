package com.App.reactSpringCrud.repository;

import com.App.reactSpringCrud.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
@EnableJpaRepositories
public interface StudentRepository extends JpaRepository<Student,Long> {

    Optional<Student> findByEmail(String email);
}
