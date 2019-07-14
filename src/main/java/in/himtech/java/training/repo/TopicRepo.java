package in.himtech.java.training.repo;

import org.springframework.data.repository.CrudRepository;

import in.himtech.java.training.domain.Topic;

public interface TopicRepo extends CrudRepository<Topic, Integer> {

}
