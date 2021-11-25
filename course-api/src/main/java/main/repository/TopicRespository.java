package main.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import main.topic.Topic;

@Repository
public interface TopicRespository extends CrudRepository<Topic,Integer>{

}
