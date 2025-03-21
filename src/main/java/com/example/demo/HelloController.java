package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String hello() {
        // 콘솔 출력 (개발자 확인용)
        System.out.println("HELLO 찍혔어! 🖥️");

        // 브라우저 출력 (사용자 확인용)
        return "HELLO 브라우저에 보임 😄";
    }
}