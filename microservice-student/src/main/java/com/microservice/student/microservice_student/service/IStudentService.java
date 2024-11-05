package com.microservice.student.microservice_student.service;


import com.microservice.student.microservice_student.entities.Student;

import java.util.List;

public interface IStudentService {

    List<Student> findAll();

    Student findById(Long id);

    List<Student> findByIdCourse(Long courseId);

    void save(Student student);

}
