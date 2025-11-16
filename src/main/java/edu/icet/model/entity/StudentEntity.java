package edu.icet.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class StudentEntity {
    @Id
    private String studentID;
    private String studentName;
    private int age;
    private LocalDate dob;
    private String email;
    private String address;

}
