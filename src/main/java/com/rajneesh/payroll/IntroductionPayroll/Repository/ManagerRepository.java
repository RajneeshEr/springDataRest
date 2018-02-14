package com.rajneesh.payroll.IntroductionPayroll.Repository;

import com.rajneesh.payroll.IntroductionPayroll.Entity.Manager;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface ManagerRepository extends CrudRepository<Manager, Long> {
    List<Manager> findByEmployeeRoleContains(@Param("q") String role);
    List<Manager> findByEmployeeLastNameContains(@Param("q") String lastName);
}
