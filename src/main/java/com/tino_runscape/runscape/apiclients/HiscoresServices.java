package com.tino_runscape.runscape.apiclients;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;



@Service
public class HiscoresServices {

    private final RestTemplate restTemplate;

    @Autowired
    public HiscoresServices(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    // String url = http://services.runescape.com/m=hiscore_oldschool/index_lite.ws?player=mandzeete


    public String makeGetRequest() {
        String apiUrl ="https://secure.runescape.com/m=hiscore_oldschool/index_lite.ws?player=mandzeete&fbclid=IwAR3a8fUnotYD7m-Xpo8snrWfdxIwEHG7XtFZyTTSoURcJDiOUQkgrCrNt6I"; //  URL
        try {

            String response;
            response = restTemplate.getForObject(apiUrl, String.class);
            System.out.println("Response Data:\n" + response); // printing the response on screen

            ///////////////////////////////////


            return response;

        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }

    }

}



