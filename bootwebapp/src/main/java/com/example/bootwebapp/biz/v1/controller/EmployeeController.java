package com.example.bootwebapp.biz.v1.controller;

import com.example.bootwebapp.db.entity.Employee;
import com.example.bootwebapp.db.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeRepository employeeRepository;
    private final Logger logger = LoggerFactory.getLogger(EmployeeController.class);

    @GetMapping(path = {"/list", "/"})
    public ModelAndView getAllEmployees() {
        ModelAndView mav = new ModelAndView("list-employees");
        mav.addObject("employees", employeeRepository.findAll());
        return mav;
    }

    @GetMapping(path = "/addEmployeeForm")
    public ModelAndView addEmployee(){
        ModelAndView mav = new ModelAndView("add-employee-form");
        Employee ep = new Employee();
        mav.addObject("employee", ep);
        return mav;
    }

    @PostMapping(path = "/saveEmployee")
    public String saveemployee(@ModelAttribute Employee employee){
        employeeRepository.save(employee);
    return "redirect:/list";
    }

    @GetMapping(path = "/showUpdateForm")
    public ModelAndView showUpdateForm(@RequestParam Long employeeId){
        logger.info("update - {}", employeeId);
        ModelAndView mav = new ModelAndView("add-employee-form");
        Employee employee = employeeRepository.findById(employeeId).orElse(null);
        mav.addObject("employee", employee);
        return mav;
    }

    @GetMapping(path = "/deleteEmployee")
    public String deleteEmployee(@RequestParam Long employeeId){
        logger.info("delete - {}", employeeId);
        employeeRepository.deleteById(employeeId);
        return "redirect:/list";

    }

}
