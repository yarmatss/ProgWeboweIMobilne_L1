package pl.edu.pw.progweboweimobilne_l1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.edu.pw.progweboweimobilne_l1.model.User;

@Controller
public class Zad5Controller {

    @GetMapping("/jqueryajax")
    public String jqueryAjax(Model model) {
        model.addAttribute("user", new User());
        return "zad5/jqueryAjax";
    }
}
