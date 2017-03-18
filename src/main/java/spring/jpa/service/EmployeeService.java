package spring.jpa.service;

import spring.jpa.model.Employee;

public interface EmployeeService {

	public void save(Employee employee);

	public Employee findById(Long id);

	public Employee findByName(String name);

}
