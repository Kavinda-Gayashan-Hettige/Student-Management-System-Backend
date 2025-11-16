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

public class StudentController {

    final StudentService service;
    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void addStudent(@RequestBody Student student){
        service.addStudent(student);

    }

    @GetMapping("/all")
    public void getAllStudents(){
     service.getAll();
    }



}
