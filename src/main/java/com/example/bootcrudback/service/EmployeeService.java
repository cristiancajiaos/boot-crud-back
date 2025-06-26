package com.example.bootcrudback.service;

import com.example.bootcrudback.dto.EmployeeDto;
import com.example.bootcrudback.exception.EmployeeNotFoundException;
import java.util.List;

public interface EmployeeService {
  EmployeeDto createEmployee(EmployeeDto employeeDto);

  EmployeeDto getEmployeeById(Long id) throws EmployeeNotFoundException;

  List<EmployeeDto> getEmployees();

}
