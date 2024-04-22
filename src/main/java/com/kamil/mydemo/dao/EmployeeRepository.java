package com.kamil.mydemo.dao;

import com.kamil.mydemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // no need daoImpl, no @Repo


    // add a method to sort by last name
    public List<Employee> findAllByOrderByLastNameAsc();

}
