package in.himtech.java.training.ctrl;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.himtech.java.training.domain.Course;
import in.himtech.java.training.service.CourseService;
import in.himtech.java.training.utils.ResponseBean;

@RestController
@RequestMapping("/courses")
public class CourseController {

	@Autowired
	private CourseService courseService;
	
	@PostMapping
	public ResponseBean<Course> addCourse(@Valid @RequestBody Course course){
		return courseService.addCourse(course);
	}
	
	@DeleteMapping("/{courseId}")
	public ResponseBean<String> removeCourse(Integer courseId){
		return courseService.removeCourse(courseId);
	}
	
	@GetMapping
	public ResponseBean<Iterable<Course>> listCourse(){
		return courseService.getAllCourses();
	}
	
	@PutMapping("/{courseId}")
	public ResponseBean<Course> updateCourse(Integer courseId, @Valid @RequestBody Course course){
		return courseService.updateCourse(courseId, course);
	}
	
	@GetMapping("/{courseId}")
	public ResponseBean<Course> getCourse(Integer courseId){
		return courseService.getCourse(courseId);
	}
}
