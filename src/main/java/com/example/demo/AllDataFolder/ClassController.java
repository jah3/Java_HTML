package com.example.demo.AllDataFolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ClassController {

//    @GetMapping("/index")
//    public String greetingForm(Model model) {
//        model.addAttribute("userName", new HumanDTO());
//        return "result";
//    }
//
//    @PostMapping("/index")
//    public String greetingSubmit(@ModelAttribute HumanDTO greeting, Model model) {
//        model.addAttribute("greeting", greeting);
//        return "index";
//    }

    HumanDTO human;

    @GetMapping()
    public String greetingForm(Model model) {
        model.addAttribute("userName", human);
        return "index";
    }

    @PostMapping("/index")
    public String greetingSubmit(@ModelAttribute HumanDTO greeting) {
//        model.addAttribute("greeting", greeting);
        human = greeting;
        /// add to database
        return "redirect:result";
    }

    @GetMapping("/result")
    public String showResult(Model model) {
        model.addAttribute("human", human.userName);
        model.addAttribute("humanpass", human.passWord);
        return "result";
    }
}