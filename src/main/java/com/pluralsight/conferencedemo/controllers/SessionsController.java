package com.pluralsight.conferencedemo.controllers;

import com.pluralsight.conferencedemo.models.Session;
import com.pluralsight.conferencedemo.repositories.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //specifies that this will respond to payloads incoming and outgoing as JSON REST endpoints
@RequestMapping("/api/v1/sessions") //tells the router what the mapping URL will look like
public class SessionsController {
    @Autowired //Spring will autowire this when SessionsController is built, creates an instance of the session repo and puts it into the class
    private SessionRepository sessionRepository;

    //list that returns all of the sessions
    @GetMapping //tells which HTTP verb to use to call the endpoint
    public List<Session> list(){
        return sessionRepository.findAll(); //queries all sessions in database and return them as a list
    }

    @GetMapping
    @RequestMapping("{id}") //allows you to get a specific session by id (adds an id to the url that is already in requestMapping class)
    public Session get(@PathVariable Long id){ //set incoming param
        return sessionRepository.getOne(id); //pull param from url and injects id into method
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED) //allows you to specify exact response you want to occur/ changes this to 201
    public Session create(@RequestBody final Session session){
        return sessionRepository.saveAndFlush(session);
    }

}
