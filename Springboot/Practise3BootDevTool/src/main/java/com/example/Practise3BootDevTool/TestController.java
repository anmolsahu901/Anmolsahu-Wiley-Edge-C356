package com.example.Practise3BootDevTool;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        int a = 10;
        int b = 10;
        int c = 100;
        return "this is just testing sum of a and b is "+(a+b+c);


    }
}
