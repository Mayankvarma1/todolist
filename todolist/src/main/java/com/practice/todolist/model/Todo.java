package com.practice.todolist.model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Todolist")
public class Todo {
    @Column(updatable = false, nullable = false)
    private long id;
    @Column
    private String title;
    @Column
    private boolean done;
    @Column
    private String description;
    @Enumerated(EnumType.ORDINAL)
    private Status status;
@Temporal(TemporalType.TIMESTAMP)
@Column(nullable = false)
private Date LastUpdate;
private void  onCreate()
{
    LastUpdate=new Date();
}


    public Todo() {
    }

    public Todo(long id, String title, boolean done, String description, Status status, Date lastUpdate) {
        this.id = id;
        this.title = title;
        this.done = done;
        this.description = description;
        this.status = status;
        LastUpdate = lastUpdate;
    }

    @Id
    @GeneratedValue

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getLastUpdate() {
        return LastUpdate;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setLastUpdate(Date lastUpdate) {
        LastUpdate = lastUpdate;


    }
}