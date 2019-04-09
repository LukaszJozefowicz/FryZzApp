package pl.spring.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/401")
public class ErrorPageController {

    @GetMapping
    public String getErrorPage(){
        return "401";
    }


    @PostMapping
    public String postErrorPage() {
        return "redirect:/401";
    }
}
