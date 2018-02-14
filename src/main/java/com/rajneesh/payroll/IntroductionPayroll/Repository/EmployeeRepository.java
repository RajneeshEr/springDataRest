package com.rajneesh.payroll.IntroductionPayroll.Repository;

import com.rajneesh.payroll.IntroductionPayroll.Entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    List<Employee> findByLastName(@Param("q") String LastName);
}
