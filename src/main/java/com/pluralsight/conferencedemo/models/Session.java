package com.pluralsight.conferencedemo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "sessions") //annotate as a JPA entity, named after database table
public class Session {  //singular because it represents one instance/row of data
    //declare local variables
    @Id //specifies which is primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //specifies how the primary key field gets populated on a new record insert
    private Long session_id; //keep the format the same as the db columns so JPA autobinds to them
    private String session_name;
    private String session_description;
    private Integer session_length;

    //default constructor, helps with serialization and deserialization
    public Session(){
    }

    //getters and setters

    public Long getSession_id() {
        return session_id;
    }

    public void setSession_id(Long session_id) {
        this.session_id = session_id;
    }

    public String getSession_name() {
        return session_name;
    }

    public void setSession_name(String session_name) {
        this.session_name = session_name;
    }

    public String getSession_description() {
        return session_description;
    }

    public void setSession_description(String session_description) {
        this.session_description = session_description;
    }

    public Integer getSession_length() {
        return session_length;
    }

    public void setSession_length(Integer session_length) {
        this.session_length = session_length;
    }
}
