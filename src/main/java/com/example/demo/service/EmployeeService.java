package com.example.demo.service;

import com.example.demo.model.dto.EmployeeDto;
import com.example.demo.model.entity.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public EmployeeDto getUser(Integer id){
        Optional<Employee> emp = this.employeeRepository.findById(id);

        return emp.map(EmployeeDto::toDto).orElse(null);
    }

    public Employee save(Employee emp){
        return this.employeeRepository.save(emp);
    }

    public void delete(Integer id){
         this.employeeRepository.deleteById(id);
    }
}
