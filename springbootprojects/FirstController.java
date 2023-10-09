package com.practice.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class FirstController {

    @GetMapping ("/index1")
    public String fun(){
      return "index1";
    }
     @GetMapping ("/quiz")
    public String fun1(){
      return "quiz";
    }

     @GetMapping ("/result")
    public String fun3(){
      return "result";
    }

    //  @GetMapping ("/products")
    // public String fun4(){
    //   return "products";
    // }

    //   @GetMapping ("/login")
    // public String fun5(){
    //   return "login";
    // }
}
