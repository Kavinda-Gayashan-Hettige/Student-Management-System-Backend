package edu.icet.service;

import edu.icet.model.dto.Student;

import java.util.List;

public interface StudentService {
    void addStudent(Student student);

    void getAll();


    void updateStudent(String id, Student updatedStudent);
}
