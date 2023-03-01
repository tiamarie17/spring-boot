package com.pluralsight.conferencedemo.repositories;

import com.pluralsight.conferencedemo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

//Session refers to data type, Long refers to primary key
public interface SessionRepository extends JpaRepository<Session, Long> {
}
