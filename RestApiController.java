package com.study.chat.controller;

import com.study.chat.model.BookQueryParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api")
public class RestApiController {
    @GetMapping(path = "/hello")
    public String hello(){
        var html = "<html><body> <h1>Hello Spring boot</h1> </body></html";
        return html;
    }
    @GetMapping(path = "/ehco/{message}/age/{age}/is-man/{isMan}")
    public String ehco(
            @PathVariable(name="message") String msg,
            @PathVariable int age,
            @PathVariable boolean isMan

    ){
        System.out.println("ehco message : "+ msg);
        System.out.println("ehco age : "+ age);
        System.out.println("ehco isMan : "+ isMan);
        return msg.toUpperCase();
    }
    //http://localhost:5000/book?category=IT&issuedYear=2023&issued-month=01&issued_day=31
    @GetMapping("/book")
    public void queryParam(@RequestParam String category,
                           @RequestParam int issuedYear,
                           @RequestParam(name="issued-month") int issuedMonth,
                           @RequestParam(name="issued_day") int issuedDay
    ){
        System.out.println("category : " + category);
        System.out.println("issuedYear : " + issuedYear);
        System.out.println("issued-month : " + issuedMonth);
        System.out.println("issued_day : " + issuedDay);
    }


    @GetMapping("/book2")
    public void queryParamDto(BookQueryParam bookQueryParam){
        System.out.println("bookQueryParam : " + bookQueryParam);

    }
    @DeleteMapping(path = {
            "/user/{userName}/delete/",
            "user/{userName}/del"
    })
    public void delete(
            @PathVariable String userName
    ){
        log.info("user-name : {}" , userName);
    }

}
