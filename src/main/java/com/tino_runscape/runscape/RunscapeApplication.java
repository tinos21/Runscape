package com.tino_runscape.runscape;


//
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

////

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication

public class RunscapeApplication {



	public static void main(String[] args) {

		SpringApplication.run(RunscapeApplication.class, args);
		System.out.println("we are running springboot THANKS AIVAR");


        //////////////////////////////  new code


		RestTemplate restTemplate = new RestTemplate();

		String url = "https://secure.runescape.com/m=hiscore_oldschool/index_lite.ws?player=mandzeete&fbclid=IwAR3a8fUnotYD7m-Xpo8snrWfdxIwEHG7XtFZyTTSoURcJDiOUQkgrCrNt6I"; // Replace with your API endpoint URL

		ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);

		// Check the HTTP status code to ensure a successful response
		if (response.getStatusCode().is2xxSuccessful()) {
			String responseBody = response.getBody();
			System.out.println("HTTP Response Body new code:");
			System.out.println(responseBody);
		} else {
			System.out.println("HTTP Request failed with status code: " + response);
		}




		/////////////////////// new code




	}

}
