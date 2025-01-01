package org.practice.krish_solution_unit.controller.login;

import com.mysql.cj.log.Log;
import org.practice.krish_solution_unit.service.login.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @GetMapping("/1")
    public String loginWithUserIdAndPassword(@RequestParam String userId, @RequestParam String password) {
        boolean isValid = loginService.validateUser(userId, password);
        return isValid ? "Login successful" : "Invalid credentials";
    }

    @GetMapping("/2")
    public String loginWithSSO() {
        return "In developing!!!";
    }

}
