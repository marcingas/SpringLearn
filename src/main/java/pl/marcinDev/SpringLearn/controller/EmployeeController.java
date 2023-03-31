package pl.marcinDev.SpringLearn.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import pl.marcinDev.SpringLearn.model.Employee;

//responsible for handling http requests
@RestController
public class EmployeeController {
    //localhost:8080/employess
    @Value("${app.name}")
    private String appName;
    @Value("${app.version}")
    private String appVersion;
    @GetMapping("/version")
    public String getAppDetails(){
        return appName + ", " + appVersion;
    }

    @GetMapping("/employees")
    public String getEmployees(){
        return "displaying list of empl";

    }
    //localhost:8080/employees/id (user put data to our application)
    @GetMapping("/employees/{id}")
    public String getEmployee(@PathVariable Long id){
        return "Fetching the employee details for the id " + id;

    }
    @PostMapping("/employees")
    public String saveEmployee(@RequestBody Employee employee){
        return "saving the employee details to the database " + employee;
    }
    @PutMapping("/employees/{id}")
    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employee){

        return employee;
    }

    //localhost:8080/employees?id=34
    @DeleteMapping("/employees")
    public String deleteEmployee(@RequestParam Long id){
        return "deleting the employee details for " + id;
    }

}
