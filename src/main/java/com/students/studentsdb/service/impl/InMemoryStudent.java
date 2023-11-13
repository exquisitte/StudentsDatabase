package com.students.studentsdb.service.impl;

import com.students.studentsdb.models.Student;
import com.students.studentsdb.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InMemoryStudent implements StudentService {
    @Override
    public List<Student> findAllStudent() {
        return List.of(
                Student.builder().firstName("Oleg").email("oleg131@gmail.com").age(41).build(),
                Student.builder().firstName("Andriy").email("Andriy11@gmail.com").age(65).build(),
                Student.builder().firstName("Baka").email("Baka@gmail.com").age(23).build()
        );
    }
}
