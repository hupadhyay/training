package in.himtech.java.training.repo;

import org.springframework.data.repository.CrudRepository;

import in.himtech.java.training.domain.Course;

public interface CourseRepo extends CrudRepository<Course, Integer> {

}
