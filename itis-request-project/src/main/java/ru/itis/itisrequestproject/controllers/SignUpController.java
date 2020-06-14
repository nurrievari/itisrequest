package ru.itis.itisrequestproject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.itis.itisrequestproject.dto.SignUpDto;
import ru.itis.itisrequestproject.service.SignUpService;

@Controller
public class SignUpController {
    @Autowired
    private SignUpService service;

    @PreAuthorize("permitAll()")
    @GetMapping("/signUp")
    public String getSignUpPage(Authentication authentication) {
        if (authentication == null) {
            return "sign_up";
        } else {
            return "redirect:/";
        }
    }

    @PreAuthorize("permitAll()")
    @PostMapping("/signUp")
    public String signUp(SignUpDto form) {
        service.signUp(form);
        return "redirect:/signIn";
    }
}
