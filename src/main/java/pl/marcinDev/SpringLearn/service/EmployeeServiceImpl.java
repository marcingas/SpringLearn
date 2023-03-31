package pl.marcinDev.SpringLearn.service;

import org.springframework.stereotype.Service;
import pl.marcinDev.SpringLearn.model.Employee;

import java.util.ArrayList;
import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService{
    private static List<Employee>list = new ArrayList<>();
    static{
        Employee employee1 = new Employee();
        employee1.setName("Marcinek");
        employee1.setAge(41L);
        employee1.setDepartment("Itit");
        employee1.setEmail("m@gmas.pl");
        employee1.setLocation("Poland, Żywiec");
        Employee employee2 = new Employee();
        employee2.setName("Bibi");
        employee2.setAge(44L);
        employee2.setDepartment("Sale");
        employee2.setEmail("bibi@gmas.pl");
        employee2.setLocation("Poland, Kraków");
        list.add(employee1);
        list.add(employee2);
    }
    @Override
    public List<Employee> getEmployees() {
        return list;
    }
}
