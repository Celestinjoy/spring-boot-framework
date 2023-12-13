package com.celestin.SampleWebApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    private Authentication authentication;

    public LoginController(Authentication authentication) {
        this.authentication = authentication;
    }

    @RequestMapping(value ="login",method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    @RequestMapping(value ="login",method = RequestMethod.POST)
    public String welcome(@RequestParam String username,String password,ModelMap model) {

        if (authentication.authenticate(username, password)) {
            model.put("name", username);
            return "welcome";
        }

        model.put("errormessage","Invalid Credentials, Please try again..");
        return "login";
    }
}
