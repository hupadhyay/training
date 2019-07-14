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

import in.himtech.java.training.domain.Student;
import in.himtech.java.training.service.StudentService;
import in.himtech.java.training.utils.ResponseBean;

@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@PostMapping
	public ResponseBean<Student> saveStudent(@Valid @RequestBody Student student){
		return studentService.saveStudent(student);
	}
	
	@PutMapping
	public ResponseBean<Student> updateStudent(@Valid @RequestBody Student student){
		return studentService.updateStudent(student);
	}
	
	@GetMapping
	public ResponseBean<Iterable<Student>> getAllStudents(){
		return studentService.getAllStudents();
	}
	
	@GetMapping("/{enrollmentNumber}")
	public ResponseBean<Student> getStudent(Integer enrollmentNumber){
		return studentService.getStudent(enrollmentNumber);
	}
	
	@DeleteMapping("/{enrollmentNumber}")
	public ResponseBean<String> deleteStudent(Integer enrollmentNumber){
		return studentService.deleteStudent(enrollmentNumber);
	}
}
