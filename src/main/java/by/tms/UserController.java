package by.tms;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/registration")
    public String reg() {
        return "reg";
    }

    @GetMapping("/authorization")
    public String auth() {
        return "redirect:/calc";
    }


    @PostMapping("/registration")
    public String reg(User user) {
        System.out.println(user);
        return "redirect:/user/authorization";
    }


}
