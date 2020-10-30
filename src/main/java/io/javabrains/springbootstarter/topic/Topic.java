package io.javabrains.springbootstarter.topic;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
public class Topic {
	@Id
	private String id;
	private String name;
	private String discription;

	public Topic(String id, String name, String discription) {
		this.id = id;
		this.name = name;
		this.discription = discription;
	}

}

