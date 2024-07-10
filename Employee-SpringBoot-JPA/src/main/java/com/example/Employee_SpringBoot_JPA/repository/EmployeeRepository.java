package com.example.Employee_SpringBoot_JPA.repository;

import com.example.Employee_SpringBoot_JPA.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer> {
}
