package com.kyro.sideboardwizard.services;

import com.kyro.sideboardwizard.model.CardDTO;

public interface CardService {
    CardDTO getCardById(String cardId);
}
