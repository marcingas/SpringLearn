package pl.marcinDev.SpringLearn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.marcinDev.SpringLearn.model.Employee;
import pl.marcinDev.SpringLearn.repository.EmployeeRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;


    @Override
    public List<Employee> getEmployees() {
        return employeeRepository.findAll();


    }

    @Override
    public Employee saveEmplpyee(Employee employee) {
      return  employeeRepository.save(employee);
    }

    @Override
    public Employee getSingleEmployee(Long id) {
        Optional<Employee> employee = employeeRepository.findById(id);
        if(employee.isPresent()){
        return employee.get();
        }
        throw new RuntimeException("Employee not found for the id: " + id);
    }
}
