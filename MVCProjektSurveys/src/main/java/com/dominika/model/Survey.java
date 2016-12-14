package com.dominika.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Dominika on 2016-12-07.
 */
@Entity
public class Survey {
    @Id
    private long id;
    private String question;

    public Survey() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
}
