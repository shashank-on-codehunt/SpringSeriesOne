package com.example.Series1.Controllers;

import com.example.Series1.repositories.AuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {
    AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @RequestMapping("/Authors")
    public String getAuthor(Model model){
        model.addAttribute("Authors",authorRepository.findAll());
        return "Authors";
    }
}
