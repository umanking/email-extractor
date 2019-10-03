package com.example.demo.controller;

import com.example.demo.model.EmailAddress;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author Andrew Han
 * @since 2019-10-03
 */

@Controller
public class WebController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("emailAddress", new EmailAddress());
        return "index";
    }

    @PostMapping("/extract")
    public String extract(@ModelAttribute EmailAddress emailAddress) {
        System.out.println(emailAddress);
        return "result";
    }

}
