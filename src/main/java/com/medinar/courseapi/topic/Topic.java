package com.medinar.courseapi.topic;

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
public class Topic {

    private String id;
    private String name;
    private String description;

    public Topic(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

}
