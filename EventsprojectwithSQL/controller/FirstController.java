package com.practice.firstproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.practice.firstproject.model.User;
import com.practice.firstproject.model.UserLogin;
import com.practice.firstproject.service.EventsIMPL;

@Controller
public class FirstController {
// injecting dependency of service
  @Autowired
 EventsIMPL service;
 

  @GetMapping("/index2")
  public String fun() {
    return "index2";
  }

  @GetMapping("/events")
  public String fun1() {
    return "events";
  }

  @GetMapping("/registration")
  public String fun3() {
    return "registration";
  }
 
  @PostMapping("/registration1")
  public String getregistration(@ModelAttribute User a) {
    service.addUser(a);//User aUser= service.addUser(a);
    System.out.println(a);
    System.out.println("done");
    return "submitted";
  }

  // @PostMapping("/registration1")
  // public String getregistration(@RequestParam String name){
  // System.out.println(name);
  // return "submitted";
  // }
   @PostMapping("/login")
  public String loginn(@ModelAttribute UserLogin b) {
    System.out.println(b);
    return "events";
  }


  @GetMapping("/submitted")
  public String fun4() {
    return "submitted";
  }

  // @GetMapping ("/products")
  // public String fun4(){
  // return "products";
  // }

  // @GetMapping ("/login")
  // public String fun5(){
  // return "login";
  // }
}
