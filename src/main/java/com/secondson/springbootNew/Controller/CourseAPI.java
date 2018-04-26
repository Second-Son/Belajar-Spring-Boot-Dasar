package com.secondson.springbootNew.Controller;

import com.secondson.springbootNew.Model.Course;
import com.secondson.springbootNew.Model.Identitas;
import com.secondson.springbootNew.Services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CourseAPI {

	@Autowired
	private CourseService courseService;

	@GetMapping("/courses")
	public List<Course> courseList(){
		return courseService.getAllCourse();
	}

	@GetMapping("/identitas/{id}/courses")
	public List<Course> getAllCourse(@PathVariable String id){
		return courseService.getAllCourseByIdentitasId(id);
	}

	@GetMapping(value = "/identitas/{identitasId}/courses/{id}")
	public Course getCourse(@PathVariable String id){
		return courseService.getCourse(id);
	}

	@PostMapping(value = "/identitas/{identitasId}/courses")
	public void addCourses(@RequestBody Course course, @PathVariable String identitasId){
		System.out.println(course);
		course.setIdentitas(new Identitas(identitasId, "", "", ""));
		courseService.addCourse(course);
	}

	@PutMapping(value = "/identitas/{identitasId}/courses/{id}")
	public void updateCourse(@RequestBody Course course, @PathVariable String identitasId){
		course.setIdentitas(new Identitas(identitasId, "", "", ""));
		courseService.updateCourse(course);
	}

	@DeleteMapping(value = "/identitas/{identitasId}/courses/{id}")
	public void deleteCourse(@PathVariable String id){
		courseService.deleteCourse(id);
	}
}
