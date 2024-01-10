package com.ra.controller;

import com.ra.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class UserController {
    @GetMapping("/register")
    public String register(Model model){
        //Khởi tạo đối tượng user
        User user = new User();
        //Mang dữ liệu xang view
        model.addAttribute("user", user);
        return "register";
    }
    @GetMapping("/post-register")
    public String post_register(@ModelAttribute("user") User user){
        return "redirect:/";
    }
}
