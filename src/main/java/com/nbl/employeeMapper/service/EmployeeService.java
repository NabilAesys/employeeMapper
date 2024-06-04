package com.nbl.employeeMapper.service;


import com.nbl.employeeMapper.model.EmployeeDto;

import java.util.List;

public interface EmployeeService {

    List<EmployeeDto> getAllEmployee();

    EmployeeDto addEmployee(EmployeeDto employeeDto);

    String deleteEmployee(Long id);

    String deleteAllEmployee();
}
