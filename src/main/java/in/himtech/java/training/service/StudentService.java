package in.himtech.java.training.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import in.himtech.java.training.domain.Student;
import in.himtech.java.training.repo.StudentRepo;
import in.himtech.java.training.utils.ResponseBean;

@Service
public class StudentService {

	@Autowired
	private StudentRepo repoStudent;

	public ResponseBean<Student> saveStudent(@Valid Student student) {
		Student student1 = repoStudent.save(student);
		return ResponseBean.<Student>getResponseBean().setPayload(student1).setStatus(HttpStatus.OK.getReasonPhrase())
				.setMessage("Student saved successfully.");
	}

	public ResponseBean<Student> updateStudent(@Valid Student student) {
		Student student1 = repoStudent.save(student);
		return ResponseBean.<Student>getResponseBean().setPayload(student1).setStatus(HttpStatus.OK.getReasonPhrase())
				.setMessage("Student updated successfully.");
	}

	public ResponseBean<Iterable<Student>> getAllStudents() {
		Iterable<Student> allStudents = repoStudent.findAll();
		return ResponseBean.<Iterable<Student>>getResponseBean().setPayload(allStudents)
				.setStatus(HttpStatus.OK.getReasonPhrase()).setMessage("All students retrieved successfully.");
	}

	public ResponseBean<Student> getStudent(Integer enrollmentNumber) {
		Student student = repoStudent.findById(enrollmentNumber).get();
		return ResponseBean.<Student>getResponseBean().setPayload(student).setStatus(HttpStatus.OK.getReasonPhrase())
				.setMessage(String.format("Student of enrollment number %d retrieved successfully.", enrollmentNumber));
	}

	public ResponseBean<String> deleteStudent(Integer enrollmentNumber) {
		repoStudent.deleteById(enrollmentNumber);
		return ResponseBean.<String>getResponseBean().setStatus(HttpStatus.OK.getReasonPhrase())
				.setMessage(String.format("Student of enrollment number %d retrieved successfully.", enrollmentNumber));
	}

}
