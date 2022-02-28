package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    // 访问 hello 地址，返回 Hello World!
    @RequestMapping("/hello")
    public String hello() {
        return "Hello World!";
    }
}
