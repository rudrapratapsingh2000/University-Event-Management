package com.UniversityEventManagement.service;

import com.UniversityEventManagement.model.Department;
import com.UniversityEventManagement.model.StudentModel;
import com.UniversityEventManagement.repository.StudentRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public StudentModel addStudent(StudentModel studentModel) {
        StudentModel savedStudent = studentRepository.save(studentModel);
        return savedStudent;
    }

    public List<StudentModel> getAllStudents() {
      return (List<StudentModel>) studentRepository.findAll();
    }

    public StudentModel getStudentById(int number) {
        return studentRepository.findById(number).get();
    }

    public void updateStudent(int number, Department department) {
        StudentModel studentModel1=studentRepository.findById(number).get();
        studentModel1.setDepartment(department);
        studentRepository.save(studentModel1);
    }

    public void deleteStudent(int number) {
        StudentModel studentModel1=studentRepository.findById(number).get();
        studentRepository.delete(studentModel1);
    }
}
