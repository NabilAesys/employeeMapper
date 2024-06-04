package com.nbl.employeeMapper.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {

    private String employeeName;

    private Integer age;

    private Integer salary;

    private String address;
}
