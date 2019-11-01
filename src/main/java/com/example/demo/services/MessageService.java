package com.example.demo.services;

import com.example.demo.models.Message;

import java.util.List;

public interface MessageService {
    Message create(final Message message);
    List<Message> findAll();
}
