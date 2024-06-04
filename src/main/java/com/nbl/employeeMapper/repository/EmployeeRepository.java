package com.nbl.employeeMapper.repository;


import com.nbl.employeeMapper.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
}
