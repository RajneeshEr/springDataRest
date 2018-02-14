package com.rajneesh.payroll.IntroductionPayroll;

import com.rajneesh.payroll.IntroductionPayroll.Entity.Manager;
import com.rajneesh.payroll.IntroductionPayroll.Repository.EmployeeRepository;
import com.rajneesh.payroll.IntroductionPayroll.Entity.Employee;
import com.rajneesh.payroll.IntroductionPayroll.Repository.ManagerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class IntroductionPayrollApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntroductionPayrollApplication.class, args);
	}

	/*@Bean
	CommandLineRunner init(EmployeeRepository employeeRepository, ManagerRepository managerRepository){
		return args ->{
			Manager m=managerRepository.save(new Manager("Prince"));
			Manager m1=managerRepository.save(new Manager("Anurag"));
			employeeRepository.save(new Employee("rajneesh", "yadav","Admin",m));
			employeeRepository.save(new Employee("rahul","kumar","user",m));
			employeeRepository.save(new Employee("sidhart","kumar","user",m1));
		};
	}*/
}
