package com.nbl.employeeMapper.service.impl;

import com.nbl.employeeMapper.entity.EmployeeEntity;
import com.nbl.employeeMapper.mapper.EmployeeMapper;
import com.nbl.employeeMapper.model.EmployeeDto;
import com.nbl.employeeMapper.repository.EmployeeRepository;
import com.nbl.employeeMapper.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;


@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private EmployeeMapper employeeMapper;


    @Override
    public List<EmployeeDto> getAllEmployee() {
        List<EmployeeEntity> employeeEntities = employeeRepository.findAll();
        return employeeMapper.mapTOEmployeeDtos(employeeEntities);
    }

    @Override
    public EmployeeDto addEmployee(EmployeeDto employeeDto) {
        EmployeeEntity employeeEntity = employeeMapper.mapToEmployeeEntity(employeeDto);
        EmployeeEntity empEntityResponse = employeeRepository.save(employeeEntity);
        return employeeMapper.mapToEmployeeDto(empEntityResponse);
    }

    @Override
    public String deleteEmployee(Long id) {
        employeeRepository.deleteAllById(Collections.singleton(id));
        return (employeeRepository.existsById(id)) ? "Employee Deleted Successfully." : "id utente non esistente";
    }

    @Override
    public String deleteAllEmployee() {
        if (employeeRepository.findAll().isEmpty()){
            return "Lista è vuota!";
        }  else
            employeeRepository.deleteAll();
        return "lista svuotata";
    }
}
