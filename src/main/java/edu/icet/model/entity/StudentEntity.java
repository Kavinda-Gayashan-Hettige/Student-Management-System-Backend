package edu.icet.model.entity;

import edu.icet.model.dto.Student;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "student")
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentID;
    private String studentName;
    private int age;
    private LocalDate dob;
    private String email;
    private String address;

    public StudentEntity(Student updatedStudent) {
        this.studentID = updatedStudent.getStudentID();
        this.studentName = updatedStudent.getStudentName();
        this.age = updatedStudent.getAge();
        this.dob = updatedStudent.getDob();
        this.email = updatedStudent.getEmail();
        this.address = updatedStudent.getAddress();
    }

}
