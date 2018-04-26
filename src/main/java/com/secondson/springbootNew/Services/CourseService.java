package com.secondson.springbootNew.Services;

import com.secondson.springbootNew.Model.Course;
import com.secondson.springbootNew.Model.Identitas;
import com.secondson.springbootNew.Repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourse(){
        List<Course> course = new ArrayList<>();
        courseRepository.findAll().forEach(course::add);
        return course;
    }

    public List<Course> getAllCourseByIdentitasId(String identitasId){
        List<Course> course = new ArrayList<>();
        courseRepository.findByIdentitasId(identitasId).forEach(course::add);
        return course;
    }

    public Course getCourse(String id){
       return courseRepository.findOne(id);
    }

    public void addCourse(Course course) {
        courseRepository.save(course);
    }

    public void updateCourse(Course course) {
        courseRepository.save(course);
    }

    public void deleteCourse(String id) {
        courseRepository.delete(id);
    }
}
