package io.javabrains.springbootstarter.lesson;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import io.javabrains.springbootstarter.course.Course;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
public class Lesson {
	@Id
	private String id;
	private String name;
	private String discription;
	
	@ManyToOne
	private Course course;

	public Lesson(String id, String name, String discription,String courseId) {
		this.id = id;
		this.name = name;
		this.discription = discription;
		this.course = new Course(courseId,"","","");
	}

}
