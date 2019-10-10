package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @Size(min=2)
    private String content;

    @NotNull
    @Size(min=10, max=11)
    private String postedDate;

    @NotNull
    @Size(min=3)
    private String sentby;

    private String headshot;

    public Message(@NotNull @Size(min = 2) String content, @NotNull @Size(min = 10, max = 11) String postedDate, @NotNull @Size(min = 3) String sentby, String headshot) {
        this.content = content;
        this.postedDate = postedDate;
        this.sentby = sentby;
        this.headshot = headshot;
    }

    public Message() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPostedDate() {
        return postedDate;
    }

    public void setPostedDate(String postedDate) {
        this.postedDate = postedDate;
    }

    public String getSentby() {
        return sentby;
    }

    public void setSentby(String sentby) {
        this.sentby = sentby;
    }

    public String getHeadshot() {
        return headshot;
    }

    public void setHeadshot(String headshot) {
        this.headshot = headshot;
    }
}
