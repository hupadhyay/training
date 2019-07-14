package in.himtech.java.training.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import in.himtech.java.training.domain.Course;
import in.himtech.java.training.repo.CourseRepo;
import in.himtech.java.training.utils.ResponseBean;

@Service
public class CourseService {

	@Autowired
	private CourseRepo repoCourse;

	public ResponseBean<Course> addCourse(@Valid Course course) {
		Course course1 = repoCourse.save(course);
		return ResponseBean.<Course>getResponseBean().setPayload(course1).setStatus(HttpStatus.OK.getReasonPhrase())
				.setMessage("Course Saved Successfully!");
	}

	public ResponseBean<String> removeCourse(Integer courseId) {
		repoCourse.deleteById(courseId);
		return ResponseBean.<String>getResponseBean()
				.setPayload(String.format("Course of id %s is delete successfully!", courseId))
				.setStatus(HttpStatus.OK.getReasonPhrase());
	}

	public ResponseBean<Iterable<Course>> getAllCourses() {
		Iterable<Course> allCourses = repoCourse.findAll();
		return ResponseBean.<Iterable<Course>>getResponseBean().setPayload(allCourses)
				.setStatus(HttpStatus.OK.getReasonPhrase()).setMessage("Courses are retrieved successfully");
	}

	public ResponseBean<Course> updateCourse(Integer courseId, @Valid Course course) {
		Course course1 = repoCourse.save(course);
		return ResponseBean.<Course>getResponseBean().setPayload(course1).setStatus(HttpStatus.OK.getReasonPhrase())
				.setMessage("Course updated Successfully!");
	}

	public ResponseBean<Course> getCourse(Integer courseId) {
		Course course = repoCourse.findById(courseId).get();
		return  ResponseBean.<Course>getResponseBean().setPayload(course).setStatus(HttpStatus.OK.getReasonPhrase())
				.setMessage(String.format("Course with id %s is retrieved successfully", courseId));
	}

}
