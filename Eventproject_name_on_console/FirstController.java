package com.practice.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class FirstController {
  

    @GetMapping ("/index2")
    public String fun(){
      return "index2";
    }
     @GetMapping ("/events")
    public String fun1(){
      return "events";
    }

     @GetMapping("/registration")
    public String fun3(){
      return "registration";
    }

    @PostMapping("/registration1")
  public String getregistration(@RequestParam String name){
    System.out.println(name);
    return "registration";
  }

     @GetMapping ("/submitted")
    public String fun4(){
      return "submitted";
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
