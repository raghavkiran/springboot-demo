package org.kirans.springbootstarter.topicapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	List<Topic> topics = new ArrayList<Topic>( Arrays.asList( 
				new Topic("Spring", "Spring 4", "Spring 4 description"),
				new Topic("C", "Let's C", "Programming in C by Kanetkar"),
				new Topic("javascript", "javascript", "JavaScript description")
			));
			

	public List<Topic> getAllTopics(){
		return topics;
	}


	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equalsIgnoreCase(id)).findFirst().get();
	}


	public void addTopic(Topic topic) {
		topics.add(topic);
	}


	public void updateTopic(String id, Topic topic) {
		for(int i=0; i<topics.size(); i++) {
			Topic t = topics.get(i);
			if(t.getId().equalsIgnoreCase(id)) {
				topics.set(i, topic);
				return;
			}
		}
	}


	public void deleteTopic(String id) {
		topics.removeIf(t -> t.getId().equalsIgnoreCase(id));
	}
	
	
	
	
	
}
