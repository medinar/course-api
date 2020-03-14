package com.medinar.courseapi.lesson;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Rommel Medina
 */
public interface LessonRepository extends CrudRepository<Lesson, String> {

    public List<Lesson> findByCourseId(String courseId);

}
