package com.dominika.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Dominika on 2016-12-07.
 */
@Entity
public class Answer {
    @Id
    private long id;
    private String answer;

    public Answer() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
