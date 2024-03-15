package com.study.chat.controller;

import com.study.chat.model.BookRequest;
import com.study.chat.model.UserDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PostApiController {
    @PostMapping("/post")
    public String post(@RequestBody BookRequest bookRequest
                                                            ){
        System.out.println(bookRequest);
        return bookRequest.toString();
    }

    @PostMapping("/user")
    public UserDto userPost(@RequestBody UserDto userDto){
        System.out.println(userDto);
        return userDto;
    }
}
