package com.skyjun.keycloakclient.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by alan on 2022/8/11.
 */
@Controller
public class LogoutController {

    @GetMapping(path = "/logout")
    public String logout() {
        return "logout.html";
    }

}
