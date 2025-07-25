package com.example.bootcrudback.mapper;

import com.example.bootcrudback.dto.EmployeeDto;
import com.example.bootcrudback.entity.Employee;

public class EmployeeMapper {

  public static EmployeeDto mapToEmployeeDto(Employee employee) {
    return new EmployeeDto(employee.getId(), employee.getName(), employee.getDepartment());
  }

  public static Employee mapToEmployee(EmployeeDto employeeDto) {
    return new Employee(employeeDto.getId(), employeeDto.getName(), employeeDto.getDepartment());
  }

}
