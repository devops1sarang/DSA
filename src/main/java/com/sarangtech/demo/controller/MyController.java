package com.sarangtech.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping(value = "/get/{name}")
    public ResponseEntity<?> getName(@PathVariable("name") String name) {
        return new ResponseEntity<>("hi , hellow " + name, HttpStatus.OK);
    }
}
