package in.himtech.java.training.ctrl;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.himtech.java.training.domain.Topic;
import in.himtech.java.training.service.TopicService;
import in.himtech.java.training.utils.ResponseBean;

@RestController
@RequestMapping("/topics")
public class TopicController {
	
	private TopicService topicService;
	
	@PostMapping
	public ResponseBean<Topic> saveTopic(@Valid @RequestBody Topic topic){
		return topicService.saveTopic(topic);
	}

	@PutMapping
	public ResponseBean<Topic> updateTopic(@Valid @RequestBody Topic topic){
		return topicService.updateTopic(topic);
	}

	@GetMapping
	public ResponseBean<Iterable<Topic>> getAllTopics(){
		return topicService.getAllTopics();
	}

	@GetMapping("/{topicId}")
	public ResponseBean<Topic> getTopic(@PathVariable("topicId") Integer topicId){
		return topicService.getTopicById(topicId);
	}

	@DeleteMapping("/{topicId}")
	public ResponseBean<String> deleteTopic(@PathVariable("topicId") Integer topicId){
		return topicService.deleteTopic(topicId);
	}

}
