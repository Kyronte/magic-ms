package com.kyro.sideboardwizard.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kyro.sideboardwizard.SideboardwizardApplication;
import com.kyro.sideboardwizard.model.CardDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(classes = SideboardwizardApplication.class)
@AutoConfigureMockMvc
class CardControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;

    @Test
    void getCardById() throws Exception {
        mockMvc.perform(get("/api/v1/card/" + "205065").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    void saveNewCard() throws Exception {
        CardDTO cardDTO = CardDTO.builder().build();
        String cardDTOtoJson = objectMapper.writeValueAsString(cardDTO);

        mockMvc.perform(post("/api/v1/card/")
                .contentType(MediaType.APPLICATION_JSON)
                .content(cardDTOtoJson))
                .andExpect(status().isCreated());
    }

    @Test
    void updateCardById() throws Exception {
        CardDTO cardDTO = CardDTO.builder().build();
        String cardDTOtoJson = objectMapper.writeValueAsString(cardDTO);

        mockMvc.perform(put("/api/v1/card/" + "205065")
                .contentType(MediaType.APPLICATION_JSON)
                .content(cardDTOtoJson))
                .andExpect(status().isNoContent());
    }
}