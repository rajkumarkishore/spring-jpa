package spring.jpa;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import spring.jpa.model.Employee;
import spring.jpa.service.EmployeeService;

import static java.lang.System.exit;

@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Autowired
	private EmployeeService empService;

	@Transactional
	@Override
	public void run(String... args) throws Exception {

		Employee e = new Employee();
		e.setFirstName("John");
		e.setLastName("Abraham");

		empService.save(e);

	}

}
