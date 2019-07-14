package in.himtech.java.training.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TOPIC")
public class Topic {

	@Id
	@GeneratedValue
	@Column(name="TOPIC_ID")
	private Integer topicId;
	
	@Column(name = "TOPIC_NAME")
	private String topicName;
	
	@Column(name = "DURATION")
	private Double duration;
	
	@Column(name = "RATING")
	private Integer rating;

	public Integer getTopicId() {
		return topicId;
	}

	public void setTopicId(Integer topicId) {
		this.topicId = topicId;
	}

	public String getTopicName() {
		return topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}

	public Double getDuration() {
		return duration;
	}

	public void setDuration(Double duration) {
		this.duration = duration;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return String.format("Topic [topicId=%s, topicName=%s, duration=%s, rating=%s]", topicId, topicName, duration,
				rating);
	}
}
