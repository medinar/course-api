package com.medinar.courseapi.lesson;

import com.medinar.courseapi.course.Course;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Rommel Medina
 */
@RestController
public class LessonController {

    @Autowired
    LessonService lessonService;

    @RequestMapping("/topics/{topicId}/courses/{courseId}/lessons")
    public List<Lesson> getAllLessons(@PathVariable String courseId) {
        return lessonService.getLessons(courseId);
    }

    @RequestMapping("/topics/{topicId}/courses/{courseId}/lessons/{id}")
    public Lesson getLesson(@PathVariable String id) {
        return lessonService.getLesson(id);
    }

    @RequestMapping(
            method = RequestMethod.POST, 
            value = "/topics/{topicId}/courses/{courseId}/lessons"
    )
    public void addLesson(
            @RequestBody Lesson lesson, 
            @PathVariable String courseId
    ) {
        lesson.setCourse(new Course(courseId, "", "", ""));
        lessonService.addLesson(lesson);
    }

    @RequestMapping(
            method = RequestMethod.PUT, 
            value = "/topics/{topicId}/courses/{courseId}/lessons/{id}"
    )
    public void updateLesson(
            @RequestBody Lesson lesson, 
            @PathVariable String courseId, 
            @PathVariable String id
    ) {
        lesson.setCourse(new Course(courseId, "", "", ""));
        lessonService.updateLesson(lesson);
    }

    @RequestMapping(
            method = RequestMethod.DELETE, 
            value = "/topics/{topicId}/courses/{courseId}/lessons/{id}")
    public void deleteLesson(@PathVariable String id) {
        lessonService.deleteLesson(id);
    }

}