package com.rajneesh.payroll.IntroductionPayroll.Entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Data
@Entity
@Getter @Setter
public class Employee {
    @Id @GeneratedValue long id;

    private String firstName, lastName;
    private String role;

    @ManyToOne
    Manager manager;

    public Employee(){}

    public Employee(String firstName, String lastName, String role, Manager manager) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
        this.manager=manager;
    }


}
