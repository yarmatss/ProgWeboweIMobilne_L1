package pl.edu.pw.progweboweimobilne_l1.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.web.bind.annotation.*;
import pl.edu.pw.progweboweimobilne_l1.model.User;

@RestController
public class Zad4RestController {

    @Getter @AllArgsConstructor
    public static class ResponseData {
        private String message;
    }

    @PostMapping("/api/submitData")
    public ResponseData submitData(@RequestBody User user) {
        String responseMessage = "Dziękujemy, " + user.getName() + "! Twoja wiadomość została odebrana.";
        return new ResponseData(responseMessage);
    }
}
