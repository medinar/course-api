package com.medinar.courseapi.course;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Rommel Medina
 */
public interface CourseRepository extends CrudRepository<Course, String> {

    public List<Course> findByTopicId(String topicId);

}
