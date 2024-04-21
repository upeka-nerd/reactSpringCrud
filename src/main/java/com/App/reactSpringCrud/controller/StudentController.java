package com.App.reactSpringCrud.controller;


import com.App.reactSpringCrud.model.Student;
import com.App.reactSpringCrud.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/students")
@RequiredArgsConstructor
public class StudentController {

    public final StudentService studentService;

    @PostMapping()
    public ResponseEntity<Student>saveStudent(@RequestBody Student s){

      return new ResponseEntity<Student>(studentService.addStudent(s), HttpStatus.CREATED);


    }























}
