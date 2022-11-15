package com.example.demo.Classes;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.sql.SQLException;

@Controller
public class ClassController {
    HumanDTO human;

    @GetMapping()
    public String greetingForm(Model model) {
        model.addAttribute("userName", human);
        return "index";
    }


    @PostMapping("/index")
    public String greetingSubmit(@ModelAttribute HumanDTO greeting) throws SQLException {
    HumanDTO var = new HumanDTO();
//        model.addAttribute("greeting", greeting);
        human = greeting;
        /// add to database
        SQLQuery run = new SQLQuery();
        System.out.println(human.userName+ "  -------------  " + human.userName );
        run.inserDataDB(human);
        return "redirect:result";
    }

    @GetMapping("/result")
    public String showResult(Model model) {
        model.addAttribute("human", human.userName);
        model.addAttribute("humanpass", human.passWord);
        return "result";
    }
}