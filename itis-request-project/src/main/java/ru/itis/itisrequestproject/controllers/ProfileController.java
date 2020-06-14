package ru.itis.itisrequestproject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.itis.itisrequestproject.dto.PostDto;
import ru.itis.itisrequestproject.models.Post;
import ru.itis.itisrequestproject.models.User;
import ru.itis.itisrequestproject.security.details.UserDetailsImpl;
import ru.itis.itisrequestproject.service.PostService;

@Controller
public class ProfileController {

    @Autowired
    private PostService service;

    @PreAuthorize("isAuthenticated()")
    @GetMapping("/profile")
    public String getProfile(Authentication authentication, Model model) {
        UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();
        User user = userDetails.getUser();
        model.addAttribute("user", user);
        return "profile";
    }

    @PreAuthorize("isAuthenticated()")
    @PostMapping("/profile")
    public String createPost(PostDto form, Model model) {
        Post post = service.createPost(form);
        model.addAttribute("post", post);
        return "post";
    }
}
