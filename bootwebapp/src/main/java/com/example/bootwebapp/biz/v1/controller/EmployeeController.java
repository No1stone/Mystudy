package com.example.bootwebapp.biz.v1.controller;

import com.example.bootwebapp.db.entity.Employee;
import com.example.bootwebapp.db.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeRepository employeeRepository;

    @GetMapping(path = {"/list", "/"})
    public ModelAndView getAllEmployees() {
        ModelAndView mav = new ModelAndView("list-employees");
        mav.addObject("employees", employeeRepository.findAll());
        return mav;
    }

    @GetMapping(path = "/addEmployee")
    public ModelAndView addEmployee(){
        ModelAndView mav = new ModelAndView("add-employee-form");
        Employee ep = new Employee();
        mav.addObject("employee", ep);
        return mav;
    }

}
