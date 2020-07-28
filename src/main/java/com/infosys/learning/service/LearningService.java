package com.infosys.learning.service;

import com.infosys.learning.dto.Person;
import org.springframework.stereotype.Service;

@Service
public class LearningService {
    public String getName(String gender){

        Person person = new Person();

        if ("man".equals(gender)){
            person.setName("Haiqal");
        }else{
            person.setName("Cinta");
        }
        return person.getName();
    }
    public Person getNameV2(String gender){
        Person person = new Person();

        if ("man".equals(gender)){
            person.setName("Haiqal");
        } else {
            person.setName("Sukma");
        }
        return person;
    }
    public String getNameV3(String name){

        String fullName = "Not identified";

        if ("Haiqal".equals(name)){
            fullName = " rifki haiqal";
        } else if ( "jane".equals(name)){
            fullName = "jane doe";
        }
        return fullName;
    }
}