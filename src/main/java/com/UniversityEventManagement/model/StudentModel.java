package com.UniversityEventManagement.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="studentmodel")
public class StudentModel {
    @Id
    private Integer student_Id;
    @NotBlank
    @Pattern(regexp = "[A-Z][a-zA-Z]*", message = "First name should start with a capital letter")
    private String first_name;
    @NotBlank
    private String last_name;
    @Min(value = 18, message = "Age should not be less than 18")
    @Max(value = 25, message = "Age should not be greater than 25")
    private int age;
    @Enumerated(EnumType.STRING)
    private Department department;
}
