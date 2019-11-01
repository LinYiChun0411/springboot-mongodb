package com.example.demo.controllers;


import com.example.demo.models.Message;
import com.example.demo.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/message")
public class MessageContorller {

    @Autowired
    private MessageService messageService;
    @GetMapping("/list")
    public List<Message> getMessageList(){
        return messageService.findAll();

    }
    @PostMapping("/create")
    public Object create(@RequestParam("from") String from, @RequestParam("description") String description){
        Message  message = new Message();
        message.setFrom(from);
        message.setDescription(description);
        return messageService.create(message);
    }

}
