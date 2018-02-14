package com.rajneesh.payroll.IntroductionPayroll.Controller;

import com.rajneesh.payroll.IntroductionPayroll.Entity.Employee;
import com.rajneesh.payroll.IntroductionPayroll.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping("/save")
    public Employee saveEmployee(@RequestBody Employee employee){
        return employeeRepository.save(employee);
    }

    @GetMapping("/getEmployee")
    public Employee getEmployee(Long id){
        return employeeRepository.findOne(id);
    }

}
