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
@Table(name = "customer")
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String studentID;
    private String studentName;
    private int age;
    private LocalDate dob;
    private String email;
    private String address;

    public StudentEntity(Student updatedStudent) {
    }
}
