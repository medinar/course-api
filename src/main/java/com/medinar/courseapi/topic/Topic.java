package com.medinar.courseapi.topic;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
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
public class Topic implements Serializable {

    @Id
    private String id;
    private String name;
    private String description;

    public Topic(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

}
