package com.kyro.sideboardwizard.services;

import com.kyro.sideboardwizard.model.CardDTO;

public interface CardService {
    CardDTO getCardById(String cardId);

    CardDTO updateCardById(String cardId);
}
