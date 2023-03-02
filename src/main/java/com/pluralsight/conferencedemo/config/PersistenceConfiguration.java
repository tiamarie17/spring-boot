package com.pluralsight.conferencedemo.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

//Used to customize and change configuration in our persistence tier
//These methods can return bean definitions
//Overrides datasource provided by Spring Data JPA starter

@Configuration
public class PersistenceConfiguration {
    @Bean //Spring will look for a DataSource definition in the app context and replace that with this one
    public DataSource dataSource(){
        //Create datasource builder
        DataSourceBuilder builder = DataSourceBuilder.create();
        builder.url("jdbc:postgresql://localhost:5432/conference_app");
        System.out.println("My custom datasource bean has been initialized and set");
        return builder.build();

    }

}
