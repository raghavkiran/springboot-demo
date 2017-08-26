package org.kirans.springbootstarter.topicapi;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {
	
	//getAllTopics
	//getTopic(String id)
	//updateTopic(Topic topic)
	//deleteTopic(String id)
	
}
