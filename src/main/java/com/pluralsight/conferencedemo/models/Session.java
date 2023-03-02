package com.pluralsight.conferencedemo.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.List;

@Entity(name = "sessions") //annotate as a JPA entity, named after database table
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) //Hibernate typically adds stub methods to handle lazy loading/eager loading
public class Session {  //singular because it represents one instance/row of data
    //declare local variables
    @Id //specifies which is primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //specifies how the primary key field gets populated on a new record insert
    private Long session_id; //keep the format the same as the db columns so JPA autobinds to them
    private String session_name;
    private String session_description;
    private Integer session_length;

    @JsonIgnore //prevent infinite JSON from being created
    @ManyToMany //tell JPA how tables are related in db
    @JoinTable(  //defines the join table and the foreign key columns
            name = "session_speakers",
            joinColumns = @JoinColumn(name = "session_id"),
            inverseJoinColumns = @JoinColumn(name= "speaker_id")
    )
    private List<Speaker> speakers;

    public List<Speaker> getSpeakers() {
        return speakers;
    }

    public void setSpeakers(List<Speaker> speakers) {
        this.speakers = speakers;
    }

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
