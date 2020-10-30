package io.javabrains.springbootstarter.lesson;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.javabrains.springbootstarter.course.Course;

@RestController
public class LessonController {

	@Autowired
	private LessonService lessonservice;

	@RequestMapping("courses/{courseId}/lessons")
	public List<Lesson> getAllCourses(@PathVariable String courseId) {
		return lessonservice.getAllLesson(courseId);
	}

	@RequestMapping("/courses/{courseid}/lessons/{id}")
	public Optional<Lesson> getCourse(@PathVariable String id) {
		return lessonservice.getLesson(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/courses/{courseId}/lessons")
	public void addTopic(@RequestBody Lesson lesson, @PathVariable String courseId) {
		lesson.setCourse(new Course(courseId,"","",""));
		lessonservice.addLesson(lesson);

	}

	@RequestMapping(method = RequestMethod.PUT, value = "/courses/{courseId}/lessons/{id}")
	public void updateTopic(@RequestBody Lesson course, @PathVariable String id, @PathVariable String courseId) {
		course.setCourse(new Course(courseId,"","",""));
		lessonservice.updateLesson(course);

	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/courses/{courseId}/lessons/{id}")
	public void deleteCourse(@PathVariable String id) {
		lessonservice.deleteLesson(id);
	}

}
