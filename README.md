#Description
This is my first Java app using Spring Boot!

For this project that I completed through a tutorial on Pluralsight, I used Spring Boot to spin up a Java app. This app is a conference organizing tool that builds conference topics and sessions for the organizers.
To begin this project, I created the database using PostgreSql. In the model files, I connected the database using a many-to-many annotation. After getting the database set up, I created the Peristence tier.
This included two models (Sessions and Speakers) and two interfaces for the SpeakerRepository and the SessionRepository. 
Finally, I added in the controllers using RestControllers to create endpoints for the Session and Speaker models. The endpoints I created include LIST, GET, GET by id, POST, PUT, and DELETE.
I also ensured that there were no serialization problems by testing my endpoints using Postman, and adding in the necessary @JsonIgnore annotation next to my database relationships.

Through this project, I gained a lot of insight into how Spring Boot is configured, and also learned how to customize and override Spring Boot, as well as how to deploy it.
I'm really looking forward to learning more about Spring Boot and completing more projects with it!

##Technologies Used:
Java, Spring, Spring Boot, Spring MVC, Maven, PostgreSql, Postman, Postico
