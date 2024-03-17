package com.jkomala.springboot.todolist.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    private final AuthenticationService authenticationService;

    public LoginController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }


    @RequestMapping(value="/login", method = RequestMethod.GET)
    public String loginJsp() {
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String handleLogin(@RequestParam String username, @RequestParam String password, ModelMap model) {
        if(authenticationService.authenticate(username, password)) {
            model.put("name", username);
            model.put("password", password);
            return "welcome";
        }

        model.put("error", "Incorrect username or password :(");
        return "login";
    }

}
