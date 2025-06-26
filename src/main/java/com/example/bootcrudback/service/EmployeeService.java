package com.example.bootcrudback.service;

import com.example.bootcrudback.dto.EmployeeDto;
import com.example.bootcrudback.exception.EmployeeNotFoundException;

public interface EmployeeService {
  EmployeeDto createEmployee(EmployeeDto employeeDto);

  EmployeeDto getEmployeeById(Long id) throws EmployeeNotFoundException;

}
