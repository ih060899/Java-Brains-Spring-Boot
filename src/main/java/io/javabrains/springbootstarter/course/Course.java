package io.javabrains.springbootstarter.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import io.javabrains.springbootstarter.topic.Topic;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
public class Course {
	@Id
	private String id;
	private String name;
	private String discription;
	
	@ManyToOne
	private Topic topic;

	public Course(String id, String name, String discription,String topicId) {
		this.id = id;
		this.name = name;
		this.discription = discription;
		this.topic = new Topic(topicId,"","");
	}

}
