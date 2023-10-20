package com.vaccination.vaccine;


import com.vaccination.vaccine.model.UserDetails;
import com.vaccination.vaccine.service.UserService;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/add-user")
    public String showUserForm(Model model) {
        model.addAttribute("user", new UserDetails());
        return "add-user";
    }

    @PostMapping("/add-user")
    public String addUser(@Valid UserDetails userDetails, BindingResult result) {
        if (result.hasErrors()) {
            return "add-user"; // Return to the form with validation errors
        }
        
        userService.addUser(userDetails);
        return "redirect:/show-all-users";
    }

    @GetMapping("/show-all-users")
    public String showAllUsers(Model model) {
        model.addAttribute("users", userService.getAllUsers());
        return "show-all-users";
    }
}
