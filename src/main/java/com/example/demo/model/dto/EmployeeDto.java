package com.example.demo.model.dto;

import com.example.demo.model.entity.Employee;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDto {

    private Integer id;
    private String name;
    private double salary;
    private String lastname;
    private String email;
    private String passwd;

    public static EmployeeDto toDto(Employee entity){
        return EmployeeDto.builder()
                .id(entity.getId())
                .name(entity.getName())
                .lastname(entity.getLastname())
                .salary(entity.getSalary())
                .email(entity.getEmail())
                .build();
    }
}
