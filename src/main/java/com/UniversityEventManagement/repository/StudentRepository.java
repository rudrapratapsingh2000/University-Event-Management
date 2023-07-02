package com.UniversityEventManagement.repository;

import com.UniversityEventManagement.model.StudentModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<StudentModel,Integer > {
}
