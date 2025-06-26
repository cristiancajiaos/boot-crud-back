package com.example.bootcrudback.service;

import com.example.bootcrudback.dto.EmployeeDto;
import com.example.bootcrudback.entity.Employee;
import com.example.bootcrudback.mapper.EmployeeMapper;
import com.example.bootcrudback.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

  @Autowired
  private EmployeeRepository employeeRepository;

  @Override
  public EmployeeDto createEmployee(EmployeeDto employeeDto) {
    Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
    Employee createdEmployee = employeeRepository.save(employee);
    return EmployeeMapper.mapToEmployeeDto(createdEmployee);
  }
}
