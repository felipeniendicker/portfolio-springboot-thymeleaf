package com.felipe.portfolio.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

@WebMvcTest(PortfolioController.class)
class PortfolioControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void deveExibirPortfolioComDadosDoController() throws Exception {
        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(view().name("index"))
                .andExpect(model().attribute("nome", "Felipe Rafael Niendicker"))
                .andExpect(model().attribute("curso", "Estudante de Sistemas de Informação"))
                .andExpect(model().attribute(
                        "mensagem",
                        "Sou estudante de Sistemas de Informação e tenho interesse em desenvolvimento de sistemas e desenvolvimento web."
                ))
                .andExpect(content().string(org.hamcrest.Matchers.containsString("/css/style.css")));
    }
}
