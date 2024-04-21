package com.App.reactSpringCrud.service.impl;

import com.App.reactSpringCrud.model.Student;
import com.App.reactSpringCrud.repository.StudentRepository;
import com.App.reactSpringCrud.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class Studentimpl implements StudentService {

    public final StudentRepository studentRepository;

    @Override
    public Student addStudent(Student s) {

        return studentRepository.save(s);
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public Student updateStudent(Student s, long id) {

        Optional<Student> selectedStudent = studentRepository.findById(id);
        if(selectedStudent.isPresent()){




        }


        return ;
    }

    @Override
    public Student getStudent(long id) {
        return null;
    }

    @Override
    public void deleteStudent(long id) {

    }
}
