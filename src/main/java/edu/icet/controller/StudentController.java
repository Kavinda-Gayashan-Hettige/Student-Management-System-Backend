package edu.icet.controller;

import edu.icet.model.dto.Student;
import edu.icet.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/student")

public class StudentController {

    final StudentService service;
    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void addStudent(@RequestBody Student student){
        service.addStudent(student);

    }

    @GetMapping("/all")
    public List<Student> getAllStudents() {
        return service.getAll();
    }


    @PutMapping("/update/{id}")
    public void updateStudent(@PathVariable Long id, @RequestBody Student updatedStudent) {
        updatedStudent.setStudentID(id);// Ensure ID is set
        service.updateStudent(id, updatedStudent);
    }


    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteStudent(@PathVariable Long id) {
        service.deleteStudent(id);
    }



}
