package com.nbl.employeeMapper.mapper;

import com.nbl.employeeMapper.entity.EmployeeEntity;
import com.nbl.employeeMapper.model.EmployeeDto;

import org.mapstruct.Mapper;

import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;



import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface EmployeeMapper {
    @Mapping(source = "name", target = "employeeName")  //andiamo a mappare 'name' della classe 'EmployeeEntity a 'employeeName' della classe 'Employee DTO'
    EmployeeDto mapToEmployeeDto(EmployeeEntity employeeEntity);
    //THE IMPLEMENTATION WILL BE GENERATED AUTOMATICLY AT COMPILE TIME
    @Mapping(source = "employeeName", target = "name")  //andiamo a mappare 'name' della classe 'EmployeeEntity a 'employeeName' della classe 'Employee DTO'
    EmployeeEntity mapToEmployeeEntity(EmployeeDto employeeDto);

    List<EmployeeDto> mapTOEmployeeDtos(List<EmployeeEntity> employeeEntities);

    List<EmployeeEntity> mapTOEmployeeEntities(List<EmployeeDto> employeeEntities);
}
