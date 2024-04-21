package com.App.reactSpringCrud.service;

import com.App.reactSpringCrud.model.Student;

import java.util.List;

public interface StudentService {

     public Student addStudent(Student s);
     public List<Student>getAllStudent();
     public Student updateStudent(Student s,long id);
     public Student getStudent(long id);
     public void deleteStudent(long id);






}
