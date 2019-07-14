package in.himtech.java.training.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="COURSE")
public class Course {
	
	@Id
	@GeneratedValue
	@Column(name = "COURSE_ID")
	private Integer courseId;
	
	@Column(name = "COURSE_NAME")
	private String courseName;
	
	@Column(name = "TUTOR")
	private String tutor;
	
	@Column(name = "FEE")
	private Double fee;
	
	@OneToMany
	private List<Topic> listTopic;

	public Integer getCourseId() {
		return courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getTutor() {
		return tutor;
	}

	public void setTutor(String tutor) {
		this.tutor = tutor;
	}

	public Double getFee() {
		return fee;
	}

	public void setFee(Double fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		return String.format("Course [courseId=%s, courseName=%s, tutor=%s, fee=%s]", courseId, courseName, tutor, fee);
	}
	
}
