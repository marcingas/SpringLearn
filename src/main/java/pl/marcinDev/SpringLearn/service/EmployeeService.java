package pl.marcinDev.SpringLearn.service;

import pl.marcinDev.SpringLearn.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getEmployees();

    Employee saveEmplpyee(Employee employee);
    Employee getSingleEmployee(Long id);
}
