package com.study.chat.controller;

import com.study.chat.model.UserDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController
@RequestMapping("/api")
public class PutApiController {

    @PutMapping("/put")
    public void put(@RequestBody UserDto userDto){
        log.info("Request : {}", userDto); // {} 에 대한 userDto toString()
    }
}
