package com.example.demo.domain;

import com.example.demo.model.EmailAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Set;

/**
 * @author Andrew Han
 * @since 2019-10-03
 */

@Controller
public class EmailExtractorController {

    @Autowired
    private EmailExtractorService emailExtractorService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("emailAddress", new EmailAddress());
        return "index";
    }

    @PostMapping("/extract")
    public String extract(@ModelAttribute EmailAddress emailAddress, Model model) {
        Set<String> extract = emailExtractorService.extract(String.valueOf(emailAddress));
        model.addAttribute("emailAddress", extract);

        return "result";
    }

}
