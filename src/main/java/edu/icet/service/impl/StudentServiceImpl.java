package edu.icet.service.impl;

import edu.icet.model.dto.Student;
import edu.icet.model.entity.StudentEntity;
import edu.icet.repository.StudentRepository;
import edu.icet.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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
    public List<Student> getAll() {
        List<StudentEntity> entities = repository.findAll();
        return entities.stream()
                .map(entity -> new Student(
                        entity.getStudentID(),
                        entity.getStudentName(),
                        entity.getAge(),
                        entity.getDob(),
                        entity.getEmail(),
                        entity.getAddress()
                ))
                .collect(Collectors.toList());
    }



    @Override
    public void updateStudent(Long id, Student updatedStudent) {
        updatedStudent.setStudentID(id);
        repository.save(new StudentEntity(updatedStudent));
    }

    @Override
    public void deleteStudent(Long id) {
        repository.deleteById(String.valueOf(id));
    }


}
