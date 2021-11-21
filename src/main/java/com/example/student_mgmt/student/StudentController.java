package com.example.student_mgmt.student;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(path = "api")
public class StudentController {

    private final StudentService studentService;

    @GetMapping(path = "new")
    public String add(Student student) {
        Student student1 = new Student ("Ime1", "Prezime1", "mail1@gmail.com");
        Student student2 = new Student ("Ime2", "Prezime2", "mail2@gmail.com");
        Student student3 = new Student ("Ime3", "Prezime3", "mail3@gmail.com");
        Student student4 = new Student ("Ime4", "Prezime4", "mail4@gmail.com");
        studentService.add(student1);
        studentService.add(student2);
        studentService.add(student3);
        studentService.add(student4);

        return "Students saved";

    }

    @GetMapping(path = "students")
    public List<Student> give() {
        return studentService.give();
    }

}
