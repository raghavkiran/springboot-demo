package org.kirans.springbootstarter.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;

	public List<Course> getAllCourses(String topicId){
		return courseRepository.findByTopicId(topicId);
	}


	public Course getCourse(String id) {
		return courseRepository.findOne(id);
	}


	public void addCourse(Course course) {
		courseRepository.save(course);
	}


	public void updateCourse(String id, Course course) {
		courseRepository.save(course);
	}


	public void deleteCourse(String id) {
		courseRepository.delete(id);
	}
	
	
}
