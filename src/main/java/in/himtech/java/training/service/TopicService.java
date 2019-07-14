package in.himtech.java.training.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import in.himtech.java.training.domain.Topic;
import in.himtech.java.training.repo.TopicRepo;
import in.himtech.java.training.utils.ResponseBean;

@Service
public class TopicService {

	@Autowired
	private TopicRepo repoTopic;

	public ResponseBean<Topic> saveTopic(@Valid Topic topic) {
		Topic topic1 = repoTopic.save(topic);
		return ResponseBean.<Topic>getResponseBean().setPayload(topic1).setStatus(HttpStatus.OK.getReasonPhrase())
				.setMessage("Topic saved successfully!");
	}

	public ResponseBean<Topic> updateTopic(@Valid Topic topic) {
		Topic topic1 = repoTopic.save(topic);
		return ResponseBean.<Topic>getResponseBean().setPayload(topic1).setStatus(HttpStatus.OK.getReasonPhrase())
				.setMessage("Topic updated successfully!");
	}

	public ResponseBean<Iterable<Topic>> getAllTopics() {
		Iterable<Topic> allTopics = repoTopic.findAll();
		return ResponseBean.<Iterable<Topic>>getResponseBean().setPayload(allTopics)
				.setStatus(HttpStatus.OK.getReasonPhrase()).setMessage("All topics are retrieved");
	}

	public ResponseBean<Topic> getTopicById(Integer topicId) {
		Topic topic = repoTopic.findById(topicId).get();
		return ResponseBean.<Topic>getResponseBean().setPayload(topic).setStatus(HttpStatus.OK.getReasonPhrase())
				.setMessage(String.format("Topic of id %s is retrieved.", topicId));
	}

	public ResponseBean<String> deleteTopic(Integer topicId) {
		repoTopic.deleteById(topicId);
		return ResponseBean.<String>getResponseBean().setStatus(HttpStatus.OK.getReasonPhrase())
				.setMessage(String.format("Topic of id %s deleted successfully!", topicId));
	}

}
