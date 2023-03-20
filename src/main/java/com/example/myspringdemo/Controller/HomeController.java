package com.example.myspringdemo.Controller;
import com.example.myspringdemo.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;

@Controller

public class HomeController {
    @GetMapping("/")
    public String index(){
        return "home/index";
    }
    @PostMapping("/personData")
    public String personData(@ModelAttribute Person person, Model model){
        model.addAttribute("Munira", person);



      /*  String first_name = wr.getParameter("first_name");
        String last_name = wr.getParameter("last_name");

        model.addAttribute("first_name", first_name);*
        model.addAttribute("last_name", last_name);*/

        return "home/personData";
    }


}
