package in.himtech.java.training.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT")
public class Student {
	
	@Id
	@GeneratedValue
	@Column(name = "ENROLL_NUM")
	private Integer enrollmentNumber;
	
	@Column(name = "STUDENT_NAME")
	private String studentName;
	
	@OneToMany
	private List<Course> listCourse;
	
	@Column(name = "ADDRESS")
	private String address;
	
	@Column(name = "PAYMENT")
	private Integer payment;

	public Integer getEnrollmentNumber() {
		return enrollmentNumber;
	}

	public void setEnrollmentNumber(Integer enrollmentNumber) {
		this.enrollmentNumber = enrollmentNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public List<Course> getListCourse() {
		return listCourse;
	}

	public void setListCourse(List<Course> listCourse) {
		this.listCourse = listCourse;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getPayment() {
		return payment;
	}

	public void setPayment(Integer payment) {
		this.payment = payment;
	}

	@Override
	public String toString() {
		return String.format("Student [enrollmentNumber=%s, studentName=%s, listCourse=%s, address=%s, payment=%s]",
				enrollmentNumber, studentName, listCourse, address, payment);
	}
}
