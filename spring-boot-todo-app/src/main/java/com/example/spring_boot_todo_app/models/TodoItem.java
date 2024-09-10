package com.example.spring_boot_todo_app.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name= "todo_items")

public class TodoItem implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String description;

    private Boolean isComplete;

    private Instant createdAt;

    private Instant updatedAt;

    @Override
    public String toString(){
        return String.format("TodoItem{id=%d, description='%s', isComplete='%s', createdAt='%s', updatedAt='s'}",
        id, description, isComplete, createdAt, updatedAt);
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public void setIsComplete(final Boolean complete) {
        isComplete = complete;
    }

    public long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public Boolean getIsComplete() {
        return isComplete;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public void setCreatedAt(final Instant now) {
    }

    public void setUpdatedAt(final java.time.Instant now) {
    }
}
