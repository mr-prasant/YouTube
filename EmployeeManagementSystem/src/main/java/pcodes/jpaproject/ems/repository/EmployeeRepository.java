package pcodes.jpaproject.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pcodes.jpaproject.ems.entity.Employee;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findByDepartment(String department);
}
