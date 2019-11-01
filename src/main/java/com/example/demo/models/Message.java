package com.example.demo.models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "messages")
public class Message {

    private String id;
    private String from;
    private String description;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



}
