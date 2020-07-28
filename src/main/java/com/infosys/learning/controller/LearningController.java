package com.infosys.learning.controller;


import com.infosys.learning.dto.Person;
import com.infosys.learning.service.LearningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;

@RestController
@RequestMapping(value = "/api")
public class LearningController {

    @Autowired
    LearningService learningService;

    @GetMapping
    public String getPersonName(@RequestParam(value = "gender")String gender){
        return learningService.getName(gender);
    }
    @GetMapping(value="/getpersonnamev2")
    public Person getPersonNameV2(@RequestParam(value = "gender", defaultValue = "gender")String gender){
        return learningService.getNameV2(gender);
    }
    @PostMapping (value = "/getpersonnamev3", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public String getpersonname3(@RequestBody(required = true) Person person){
        return learningService.getNameV3(person.getName());
    }
}
