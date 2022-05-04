package com.JenkinsRestApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.JenkinsRestApi.model.Employee;



public interface EmployeeRepo extends JpaRepository<Employee, Long>{

}
