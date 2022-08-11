package com.skyjun.keycloakclient.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class UserController {

    @GetMapping(path = "/index")
    public String getProducts(Principal principal, Model model) {
        model.addAttribute("principal", principal);
        return "index.html";
    }

}
