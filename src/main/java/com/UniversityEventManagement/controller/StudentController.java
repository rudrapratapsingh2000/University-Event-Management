package com.UniversityEventManagement.controller;

import com.UniversityEventManagement.model.Department;
import com.UniversityEventManagement.model.StudentModel;
import com.UniversityEventManagement.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/add-api")
    public ResponseEntity<StudentModel> addStudent(@Valid @RequestBody StudentModel student) {
        StudentModel savedStudent = studentService.addStudent(student);
        return new ResponseEntity<>(savedStudent, HttpStatus.CREATED);
    }
    @GetMapping("/findAll-api")
    public List<StudentModel> getAllStudent(){
        return studentService.getAllStudents();
    }

    @GetMapping("/findbyId-api/number/{number}")
    public  StudentModel findStudentById(@PathVariable int number){
        return studentService.getStudentById(number);
    }

    @PutMapping("/update-api/number/{number}")
    public  void updateStudent(@PathVariable int number, @RequestBody Department department){
        studentService.updateStudent(number,department);
    }

    @DeleteMapping("/delete-api/number/{number}")
    public void deleteStudent(@PathVariable int number){
        studentService.deleteStudent(number);
    }
}
