package pl.edu.pw.progweboweimobilne_l1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.edu.pw.progweboweimobilne_l1.model.User;

@Controller
public class Zad2Controller {

    @GetMapping("/form")
    public String showForm(Model model) {
        model.addAttribute("user", new User());
        return "zad2/form";
    }

    @PostMapping("/submitForm")
    public String submitForm(@ModelAttribute("user") User user, Model model) {
        model.addAttribute("user", user);
        return "zad2/result";
    }
}
