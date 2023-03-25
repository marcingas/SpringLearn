package pl.marcinDev.SpringLearn.controller;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//responsible for handling http requests
@RestController
public class EmployeeController {
    //localhost:8080/employess

    @GetMapping("/employees")
    public String getEmployees(){
        return "displaying list of empl";
    }
}
