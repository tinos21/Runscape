package com.tino_runscape.runscape;

//// import hiscoresController class inside main
import  com.tino_runscape.runscape.controllers.HiscoresController;
// importing HiscoresService class inside main
import  com.tino_runscape.runscape.apiclients.HiscoresServices;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication

public class RunscapeApplication {



	public static void main(String[] args) {

		SpringApplication.run(RunscapeApplication.class, args);
		System.out.println("we are running springboot THANKS AIVAR");



	}

}
