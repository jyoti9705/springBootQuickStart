package main.topic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.repository.TopicRespository;
import main.topic.Topic;

@Service
public class TopicService {

	@Autowired
	private TopicRespository topicRespository;

	public List<Topic> getTopics() {
		return (List<Topic>) topicRespository.findAll();
	}

	public Topic getTopicById(Integer id) {
		return topicRespository.findById(id).get();
	}

	public void addTopic(Topic topic) {
		topicRespository.save(topic);
	}

}
