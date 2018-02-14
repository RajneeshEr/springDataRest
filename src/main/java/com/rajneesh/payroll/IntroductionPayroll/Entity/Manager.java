package com.rajneesh.payroll.IntroductionPayroll.Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@Entity
public class Manager {
    @Id @GeneratedValue Long id;
    String name;
    @OneToMany(mappedBy = "manager")
    List<Employee> employee;

    private Manager() {
    }

    public Manager(String name) {
        this.name = name;
    }
}
