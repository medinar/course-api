package com.medinar.courseapi.course;

import com.medinar.courseapi.topic.Topic;
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
public class Course implements Serializable {

    @Id
    private String id;
    private String name;
    private String description;
    
    @ManyToOne
    private Topic topic;

    public Course(String id, String name, String description, String topicId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.topic = new Topic(topicId, "", "");
    }

}
