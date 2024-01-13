package com.springboot1.app1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App1Application {

	public static void main(String[] args) {
		SpringApplication.run(App1Application.class, args);
	}

}

/*
* Spring Boot includes an embedded server like tomcat
* Maven => is to manage the dependencies inside our project instead of downloading these JARs in our own
* POM file => Project Object Model
* => it's a configuration file of our projects it contains
* 1 - project metadata like the project name, versions...
* 2 - project dependencies
* 3 - plugins => it's an additional custom tasks
* -----------------
*
* src/main/application.properties = env
* we can read the values inside it by using the @Value('var_name') annotation.
* the static dir is to place some static resources like HTML, CSS, Images...
* templates for templating engines
*
* spring-boot-starter => contains a lot of packages that u need in a starter project like the REST, Building WEB apps....
* spring-boot-devtools => to restart the app whenever the code changes
*
* spring-boot-actuator => monitor and manage the endpoints
* /actuator/health => to check the app health
* /actuator/info => provide some information about the application
*
* */