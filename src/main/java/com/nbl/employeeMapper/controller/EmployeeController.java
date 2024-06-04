package com.nbl.employeeMapper.controller;

import com.nbl.employeeMapper.model.EmployeeDto;
import com.nbl.employeeMapper.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(value="/employee")
    public List<EmployeeDto> getAllEmployee(){
        return employeeService.getAllEmployee();
    }

    @PostMapping(value="/employee")
    public EmployeeDto addEmployee(@RequestBody EmployeeDto employeeDto){
        return employeeService.addEmployee(employeeDto);
    }

    @DeleteMapping(value="/employee/{id}")
    public String deleteEmployee(@PathVariable Long id ){
        return employeeService.deleteEmployee(id);
    }

    @DeleteMapping(value="/employee")
    public String deleteAllEmployee(){
        return employeeService.deleteAllEmployee();
    }

}
