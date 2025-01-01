package org.practice.krish_solution_unit.controller.login;

import org.practice.krish_solution_unit.service.login.LoginService;
import org.practice.krish_solution_unit.service.login.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/register")
public class RegisterController {

    @Autowired
    private RegisterService registerService;

    @PostMapping("/1")
    public String loginWithUserIdAndPassword(@RequestParam String userId, @RequestParam String password) {
        registerService.registerNewUser(userId, password);
        return "new user created";
    }



}
