package edu.icet.service;

import edu.icet.model.dto.Student;

import java.util.List;

public interface StudentService {
    void addStudent(Student student);

    List<Student> getAll();


    void updateStudent(Long id, Student updatedStudent);

    void deleteStudent(Long id);
}
