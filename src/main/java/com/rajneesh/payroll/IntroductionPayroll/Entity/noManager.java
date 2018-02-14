package com.rajneesh.payroll.IntroductionPayroll.Entity;


import org.springframework.data.rest.core.config.Projection;

@Projection(name = "noManager", types = {Employee.class})
public interface noManager {
    String getFirstName();
    String getLastName();
    String getRole();
}
