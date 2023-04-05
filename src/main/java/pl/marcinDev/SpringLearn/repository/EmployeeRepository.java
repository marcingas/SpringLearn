package pl.marcinDev.SpringLearn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.marcinDev.SpringLearn.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
