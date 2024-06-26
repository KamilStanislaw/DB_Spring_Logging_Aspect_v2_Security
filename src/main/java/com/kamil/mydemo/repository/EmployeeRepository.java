package com.kamil.mydemo.repository;

import com.kamil.mydemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // no need daoImpl, no @Repo


    // add a method to sort by last name
    List<Employee> findAllByOrderByLastNameAsc();

}
