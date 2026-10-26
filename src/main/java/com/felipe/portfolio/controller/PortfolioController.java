package com.felipe.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PortfolioController {

    @GetMapping("/")
    public String exibirPortfolio(Model model) {
        model.addAttribute("nome", "Felipe Rafael Niendicker");
        model.addAttribute("curso", "Estudante de Sistemas de Informação");
        model.addAttribute(
                "mensagem",
                "Sou estudante de Sistemas de Informação e tenho interesse em desenvolvimento de sistemas e desenvolvimento web."
        );

        return "index";
    }
}
