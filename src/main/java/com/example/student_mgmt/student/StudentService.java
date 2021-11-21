package com.example.student_mgmt.student;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public void add(Student student) {
        studentRepository.save(student);
    }

    public List<Student> give() {
        return studentRepository.findAll();
    }

}
