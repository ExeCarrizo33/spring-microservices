package com.microservice.student.microservice_student.service.Impl;

import com.microservice.student.microservice_student.entities.Student;
import com.microservice.student.microservice_student.repositories.StudentRepository;
import com.microservice.student.microservice_student.service.IStudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements IStudentService {

    private final StudentRepository studentRepository;

    @Override
    public List<Student> findAll() {
        return (List<Student>) studentRepository.findAll();
    }

    @Override
    public Student findById(Long id) {
        return studentRepository.findById(id).orElseThrow();
    }

    @Override
    public Student findByIdCourse(Long idCourse) {
        return (Student) studentRepository.findAllByCourseId(idCourse);
    }

    @Override
    public void save(Student student) {
        studentRepository.save(student);
    }
}
