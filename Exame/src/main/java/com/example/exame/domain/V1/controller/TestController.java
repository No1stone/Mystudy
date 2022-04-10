package com.example.exame.domain.V1.controller;

import com.example.exame.domain.V1.service.TestService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequiredArgsConstructor
public class TestController {

    private final Logger logger = LoggerFactory.getLogger(TestController.class);
    private final TestService testService;


    @GetMapping(path = "/test1")
    public void test1Controller(){
        testService.test1Service();
    }

}
