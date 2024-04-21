package com.App.reactSpringCrud.service.impl;

import com.App.reactSpringCrud.exception.StudentAlreadyExistException;
import com.App.reactSpringCrud.exception.StudentNotFoundException;
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

        if(studentAlreadyExist(s.getEmail())){

            throw new StudentAlreadyExistException("hey! this student already exist!");

        }
        return studentRepository.save(s);
    }

    private boolean studentAlreadyExist(String email) {

     return studentRepository.findByEmail(email).isPresent();

    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public Student updateStudent(Student s, long id) {
        Optional<Student> selectedStudent = studentRepository.findById(id);
        return selectedStudent.map(st->{
                st.setId(s.getId());
                st.setFirstName(s.getFirstName());
                st.setLastName(s.getLastName());
                st.setEmail(s.getEmail());
                st.setDepartment(s.getDepartment());
                return studentRepository.save(st);

                    }).orElseThrow(()->new StudentNotFoundException("Cannot find this stundet"));

    }

    @Override
    public Student getStudent(long id) {


        Optional<Student> selectedStudent = studentRepository.findById(id);
        if(selectedStudent.isPresent()){

            return selectedStudent.get();
        }

        throw new StudentNotFoundException("cannot find this student");
    }

    @Override
    public void deleteStudent(long id) {
        studentRepository.deleteById(id);

    }
}
