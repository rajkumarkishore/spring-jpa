package spring.jpa.repository;

import org.springframework.data.repository.CrudRepository;

import spring.jpa.model.Employee;

public interface EmployeeRepository extends
		CrudRepository<Employee, Long> {
}
