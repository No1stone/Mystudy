package com.example.pattern.biz.V1.controller;

import com.example.pattern.biz.component.BooleanExExame;
import com.google.gson.Gson;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@CrossOrigin("*")
@RequestMapping(path = "/V1/API")
public class ExameController {

    private final Logger logger = LoggerFactory.getLogger(ExameController.class);

    @GetMapping(path = "/test1")
    public void test1Controller(@RequestBody BooleanExExame q){
        BooleanExExame be = BooleanExExame.builder().a(q.getA()).b(q.getB()).c(q.getC()).d(q.getD());
        logger.info("be - {}",new Gson().toJson(be));


        String be1 = BooleanExExame.builder().a(q.getA()).b(q.getB()).c(q.getC()).d(q.getD()).build();
        logger.info("be1 - {}",new Gson().toJson(be1));
    }

}
