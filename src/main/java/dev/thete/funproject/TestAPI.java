package dev.thete.funproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestAPI {

    @GetMapping("/greeting")
    public String greeting() {
        return "Greetings";
    }
}
