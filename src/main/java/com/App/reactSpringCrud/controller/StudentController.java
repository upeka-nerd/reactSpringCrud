package com.App.reactSpringCrud.controller;


import com.App.reactSpringCrud.model.Student;
import com.App.reactSpringCrud.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/students")
@RequiredArgsConstructor
public class StudentController {

    public final StudentService studentService;

    @PostMapping()
    public ResponseEntity<Student>saveStudent(@RequestBody Student s){

      return new ResponseEntity<Student>(studentService.addStudent(s), HttpStatus.CREATED);

    }

    @GetMapping("/all")
    public ResponseEntity<List<Student>> getAllStudent(){

        return new ResponseEntity<List<Student>>(studentService.getAllStudent(),HttpStatus.FOUND);

    }
    @GetMapping("{id}")
    public ResponseEntity<Student>getStudent(@RequestParam long id){

         return new ResponseEntity<Student>(studentService.getStudent(id),HttpStatus.FOUND);

    }

    @PutMapping
    public ResponseEntity<Student>updateStudent(@RequestBody Student s,@PathVariable long id){


        return new ResponseEntity<Student>(studentService.updateStudent(s,id),HttpStatus.CREATED);


    }























}
