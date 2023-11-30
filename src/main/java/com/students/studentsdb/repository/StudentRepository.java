package com.students.studentsdb.repository;

import com.students.studentsdb.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
    void deleteByEmail(String email);
    Student findStudentByEmail(String email);
}
