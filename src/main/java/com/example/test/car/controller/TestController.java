package com.example.test.car.controller;

import com.example.test.car.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;

    @GetMapping("/init")
    public void initLedger() throws Exception {
        testService.initLedger();
    }

    @GetMapping("/get")
    public void getAllAssets() throws Exception {
        testService.getAllAssets();

    }


}
