package com.medinar.courseapi.lesson;

import com.medinar.courseapi.course.Course;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author Rommel Medina
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
public class Lesson implements Serializable {

    @Id
    private String id;
    private String name;
    private String description;
    
    @ManyToOne
    private Course course;

    public Lesson(String id, String name, String description, String courseId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.course = new Course(courseId, "", "", "");
    }

}
