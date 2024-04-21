package com.App.reactSpringCrud.repository;

import com.App.reactSpringCrud.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;


@Repository
@EnableJpaRepositories
public interface StudentRepository extends JpaRepository<Student,Long> {
}
