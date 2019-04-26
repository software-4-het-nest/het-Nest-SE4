package be.odisee.se4.hetnest.controllers;

import be.odisee.se4.hetnest.domain.User;
import be.odisee.se4.hetnest.service.HetNestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController {



    @Autowired
    private HetNestService hetNestService = null;

    /*@GetMapping()
    public String home() {
        return "home";
    }*/

    @GetMapping("/login-error")
    public String loginerror(Model model) {
        model.addAttribute("error", true);
        return "login";
    }

    @RequestMapping("/")
    public String home(ModelMap model){
        List<User> hetLijst = Arrays.asList(
                new User(1, "tibovds1", "test", "Tibo", "Van De Sijpe", "Administrator"),
                new User(2, "tibovds2", "test", "Tibo", "Van De Sijpe", "Administrator"),
                new User(3, "tibovds3", "test", "Tibo", "Van De Sijpe", "Administrator")
                );
        List<User> deLijst = hetNestService.geefAllePersonen();
        model.addAttribute("users", deLijst);
        return "/home";
    }
}
