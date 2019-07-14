package in.himtech.java.training.repo;

import org.springframework.data.repository.CrudRepository;

import in.himtech.java.training.domain.Student;

public interface StudentRepo extends CrudRepository<Student, Integer> {

}
