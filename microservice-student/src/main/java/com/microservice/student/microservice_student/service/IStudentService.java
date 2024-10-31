package com.microservice.student.microservice_student.service;


import com.microservice.student.microservice_student.entities.Student;

import java.util.List;

public interface IStudentService {

    List<Student> findAll();

    Student findById(Long id);

    Student findByIdCourse(Long idCourse);

    void save(Student student);

}
