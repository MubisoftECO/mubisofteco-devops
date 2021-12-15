package eco.mubisoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/signin")
    public String signin(){
        return "/login/signin";
    }

    @GetMapping("/signup")
    public String signup(){
        return "/login/signin";
    }
}
