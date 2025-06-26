package com.example.bootcrudback.service;

import com.example.bootcrudback.dto.EmployeeDto;
import com.example.bootcrudback.entity.Employee;
import com.example.bootcrudback.exception.EmployeeNotFoundException;
import com.example.bootcrudback.mapper.EmployeeMapper;
import com.example.bootcrudback.repository.EmployeeRepository;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
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

  @Override
  public EmployeeDto getEmployeeById(Long id) throws EmployeeNotFoundException {
    Optional<Employee> employee = employeeRepository.findById(id);
    if (employee.isEmpty()) {
      throw new EmployeeNotFoundException("Employee with id - " + id + " not found");
    }
    return EmployeeMapper.mapToEmployeeDto(employee.get());
  }

  @Override
  public List<EmployeeDto> getEmployees() {
    List<Employee> employees = employeeRepository.findAll();
    return employees.stream().map((emp) -> EmployeeMapper.mapToEmployeeDto(emp)).collect(Collectors.toList());
  }

  @Override
  public void deleteEmployee(Long employeeId) throws EmployeeNotFoundException {
    Optional<Employee> employee = employeeRepository.findById(employeeId);
    if (employee.isEmpty()) {
      throw new EmployeeNotFoundException("Employee with id - " + employeeId + " not found");
    }
    employeeRepository.deleteById(employeeId);

  }
}
