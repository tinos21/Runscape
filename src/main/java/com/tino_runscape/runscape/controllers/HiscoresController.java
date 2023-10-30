package com.tino_runscape.runscape.controllers;

import com.tino_runscape.runscape.apiclients.HiscoresServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")

public class HiscoresController {

    private final HiscoresServices hiscoresServices;

    @Autowired
    public HiscoresController(HiscoresServices hiscoresServices) {
        this.hiscoresServices = hiscoresServices;
    }



    @GetMapping("/get-scores")
    @ResponseBody
    public String getData() {

        return hiscoresServices.makeGetRequest();
    }

 
}


