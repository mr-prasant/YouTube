package pcodes.jpaproject.ems.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pcodes.jpaproject.ems.entity.Employee;
import pcodes.jpaproject.ems.model.EmployeeAddRequest;
import pcodes.jpaproject.ems.model.EmployeeAddResponse;
import pcodes.jpaproject.ems.repository.EmployeeRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public EmployeeAddResponse addEmployee(EmployeeAddRequest request) {
        Employee employee = new Employee();
        employee.setName(request.getName());
        employee.setDepartment(request.getDepartment());
        employee.setSalary(request.getSalary());

        Employee storedEmployee = repository.save(employee);

        return new EmployeeAddResponse(storedEmployee.getId(), storedEmployee.getName());
    }

    public List<EmployeeAddResponse> getAllEmployees() {
        List<Employee> dbEmployees = repository.findAll();
        List<EmployeeAddResponse> employees = new ArrayList<>();

        for (Employee e : dbEmployees) {
            EmployeeAddResponse ear = new EmployeeAddResponse();
            ear.setId(e.getId());
            ear.setName(e.getName());

            employees.add(ear);
        }

        return employees;
    }

    public EmployeeAddResponse getEmployee(Long id) {
        if (id == null) return null;

        Employee dbEmployee = repository.findById(id).orElse(null);
        return dbEmployee != null? new EmployeeAddResponse(dbEmployee.getId(), dbEmployee.getName()) : null;
    }

    public List<Employee> getAllEmployeesOfDepartment(String department) {
        return repository.findByDepartment(department);
    }

    public Employee updateEmployee(EmployeeAddRequest request, Long id) {
        if (id == null || request == null) return null;

        Employee dbEmployee = repository.findById(id).orElseThrow(() -> new IllegalArgumentException("No Employee found"));

        if (request.getName() != null) dbEmployee.setName(request.getName());
        if (request.getDepartment() != null) dbEmployee.setDepartment(request.getDepartment());
        if (request.getSalary() != null) dbEmployee.setSalary(request.getSalary());

        return repository.save(dbEmployee);
    }

    public void removeEmployee(Long id) {
        repository.deleteById(id);
    }

    public void removeAllEmployees() {
        repository.deleteAll();
    }

}
