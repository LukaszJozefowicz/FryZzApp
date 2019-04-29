package pl.spring.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.spring.core.services.UserService;

import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("/home")
public class HomePageController {

    @GetMapping
    public String getHomePage(HttpSession session){
        if (session.getAttribute("user") == null) {
            return "401";
        }
        return "redirect:/your_arranged";
    }


    @PostMapping
    public String postHomePage() {
        return "redirect:/home";
    }
}
