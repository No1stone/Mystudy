package com.example.bootwebapp.biz.v1.controller;

import com.example.bootwebapp.db.entity.Employee;
import com.example.bootwebapp.db.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class testSaceController {
    private final EmployeeRepository employeeRepository;

    @GetMapping(path = "/save")
    public void testsave(){
        employeeRepository.save(Employee.builder()
                .id(1L)
                .email("testemail@aa.com")
                .name("testname1")
                .department("departest1")
                .build());
        employeeRepository.save(Employee.builder()
                .id(2L)
                .email("testemail@aa.com2")
                .name("testname2")
                .department("departest2")
                .build());


    }

}
