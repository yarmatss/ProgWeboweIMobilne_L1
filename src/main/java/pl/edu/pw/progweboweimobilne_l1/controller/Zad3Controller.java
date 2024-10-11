package pl.edu.pw.progweboweimobilne_l1.controller;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.edu.pw.progweboweimobilne_l1.model.User;

@Controller
public class Zad3Controller {

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        User user = new User();
        user.setMessage("Domyślna wiadomość");
        model.addAttribute("user", user);
        return "zad3/register";
    }

    @PostMapping("/register")
    public String registerUser(@Valid @ModelAttribute User user, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            System.err.println(user);
            return "zad3/register";
        }

        model.addAttribute("user", user);
        return "zad3/registrationSuccess";
    }
}
