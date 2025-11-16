package edu.icet.model.dto;

import lombok.*;

import java.time.LocalDate;
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private Long studentID;
    private String studentName;
    private int age;
    private LocalDate dob;
    private String email;
    private String address;

}
