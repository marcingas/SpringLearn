package pl.marcinDev.SpringLearn.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import pl.marcinDev.SpringLearn.model.Employee;
import pl.marcinDev.SpringLearn.service.EmployeeService;

import java.util.List;

//responsible for handling http requests
@RestController
public class EmployeeController {
    //localhost:8080/employess
    @Autowired
    private EmployeeService eService;

    @GetMapping("/employees")
    public List<Employee> getEmployees(){
        return eService.getEmployees();

    }
    //localhost:8080/employees/id (user put data to our application)
    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable Long id){
        return eService.getSingleEmployee(id);

    }
    @PostMapping("/employees")
    public Employee saveEmployee(@RequestBody Employee employee){
        return eService.saveEmplpyee(employee);
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
