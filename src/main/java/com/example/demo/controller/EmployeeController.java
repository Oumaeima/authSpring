package com.example.demo.controller;

import com.example.demo.model.dto.EmployeeDto;
import com.example.demo.model.entity.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RequestMapping("/api/v1/employees")
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public ResponseEntity<String> sayHello(){
        return ResponseEntity.ok("Hello from secure endpoint");
    }

    @GetMapping("/get-emp")
    public EmployeeDto getUser(@RequestParam(value = "id") Integer id){
        return this.employeeService.getUser(id);
    }

    @PostMapping("/add")
    public Employee save(@RequestBody Employee employee){
        return this.employeeService.save(employee);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestParam Integer id){
        this.employeeService.delete(id);
    }
}
