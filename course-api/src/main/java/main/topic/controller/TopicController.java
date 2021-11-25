package main.topic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import main.topic.Topic;
import main.topic.service.TopicService;

@RestController
public class TopicController {

	@Autowired
	private TopicService topicService;

	@GetMapping("/topic")
	public List<Topic> getTopics() {
		return topicService.getTopics();
	}

	@GetMapping("/topic/{id}")
	public Topic getTopicById(@PathVariable Integer id) {
		return topicService.getTopicById(id);

	}
	
	@PostMapping("/topic")
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
	}
	

}
