package pl.spring.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.spring.core.services.UserService;
import pl.spring.dto.LoggedUserDTO;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
@RequestMapping
public class AuthenticationController {

    private UserService userService;

    @Autowired
    public AuthenticationController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String prepareLoginPage() {
        return "login";
    }

    @PostMapping("/")
    public void login(String login, String password, HttpSession session, HttpServletResponse response) throws IOException {
        boolean validCredentials = userService.checkCredentials(login, password);
        if (!validCredentials) {
            response.sendRedirect("/401");
            return;
        }

        LoggedUserDTO user = userService.getUser(login, password);
        session.setAttribute("user", user);
        response.sendRedirect("/home"); // przekierowuje na strone glowna
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "logout";
    }
}
