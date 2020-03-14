package com.medinar.courseapi.lesson;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Rommel Medina
 */
@Service
public class LessonService {

    @Autowired
    LessonRepository lessonRepository;

    public List<Lesson> getLessons(String courseId) {
        List<Lesson> lessons = new ArrayList<>();
        lessonRepository.findByCourseId(courseId)
                .forEach(lessons::add);
        
        return lessons;
    }

    public Lesson getLesson(String id) {
        return lessonRepository.findById(id).get();
    }

    public void addLesson(Lesson lesson) {
        lessonRepository.save(lesson);
    }

    public void updateLesson(Lesson lesson) {
        lessonRepository.save(lesson);
    }

    public void deleteLesson(String id) {
        lessonRepository.deleteById(id);
    }

}
