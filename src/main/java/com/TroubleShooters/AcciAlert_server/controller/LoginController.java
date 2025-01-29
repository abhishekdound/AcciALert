package com.TroubleShooters.AcciAlert_server.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
public class LoginController {

    @GetMapping("/UserLogin")
    public String bhang(){
        return "this is User login page";
    }

    @GetMapping("/HospitalLogin")
    public String bhosda(){
        return "this is hospital login page";
    }

    @PostMapping("/HospitalLogin")
    public String qwew(){
        return "this is the portal";
    }

}
