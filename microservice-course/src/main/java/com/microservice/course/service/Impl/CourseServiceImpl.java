package com.microservice.course.service.Impl;

import com.microservice.course.client.StudentClient;
import com.microservice.course.entities.Course;
import com.microservice.course.entities.dto.StudentDTO;
import com.microservice.course.http.response.StudentByCourseResponse;
import com.microservice.course.repositories.CourseRepository;
import com.microservice.course.service.ICourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseServiceImpl implements ICourseService {

    private final CourseRepository courseRepository;

    private final StudentClient studentClient;

    @Override
    public List<Course> findAll() {
        return (List<Course>) courseRepository.findAll();
    }

    @Override
    public Course findById(Long id) {
        return courseRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(Course course) {
        courseRepository.save(course);
    }

    @Override
    public StudentByCourseResponse findStudentByIdCourse(Long idCourse) {

        /*Consulto el curso*/
        Course course = courseRepository.findById(idCourse).orElseThrow();

        List<StudentDTO> studentDTOList = studentClient.findAllStudentsByCourse(idCourse);

        return StudentByCourseResponse.builder()
                .courseName(course.getName())
                .teacher(course.getTeacher())
                .studentDTOList(studentDTOList)
                .build();
    }
}
