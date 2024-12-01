package exercise.controller;

import exercise.daytime.Daytime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

// BEGIN
@RestController
@RequestMapping("/")
public class WelcomeController {
    @Autowired
    private Daytime daytime;

    @GetMapping("/welcome")
    public String welcome() {
        var name = daytime.getName();
        return "It is " + name + " now! Welcome to Spring!";
    }
}
// END
