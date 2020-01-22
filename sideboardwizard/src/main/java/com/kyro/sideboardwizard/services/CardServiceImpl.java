package com.kyro.sideboardwizard.services;

import com.kyro.sideboardwizard.model.CardDTO;
import org.springframework.stereotype.Service;

@Service
public class CardServiceImpl implements CardService {

    @Override
    public CardDTO getCardById(String cardId) {
        return CardDTO.builder()
                .name("Ajani's Pridemate")
                .multiverseId("205065")
                .build();
    }

    @Override
    public CardDTO updateCardById(String cardId) {
        return CardDTO.builder()
                .name("Ajani's Pridemate")
                .multiverseId("205065")
                .build();
    }

}
