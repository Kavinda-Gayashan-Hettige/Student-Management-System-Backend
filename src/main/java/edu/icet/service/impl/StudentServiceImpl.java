package edu.icet.service.impl;

import edu.icet.model.dto.Student;
import edu.icet.model.entity.StudentEntity;
import edu.icet.repository.StudentRepository;
import edu.icet.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    final StudentRepository repository;
    @Override
    public void addStudent(Student student) {
        repository.save(new StudentEntity(
                        student.getStudentID(),
                        student.getStudentName(),
                        student.getAge(),
                        student.getDob(),
                        student.getAddress(),
                        student.getEmail()
                ));
    }

    @Override
    public void getAll() {
        repository.findAll();
    }


}
