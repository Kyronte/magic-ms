package com.kyro.sideboardwizard.controller;

import com.kyro.sideboardwizard.model.CardDTO;
import com.kyro.sideboardwizard.services.CardService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/v1/card")
@RestController
public class CardController {

    private final CardService cardService;

    public CardController(CardService cardService) {
        this.cardService = cardService;
    }

    @GetMapping("/{cardId}")
    public ResponseEntity<CardDTO> getCardById(@PathVariable("cardId") String cardId) {
        return new ResponseEntity<>(cardService.getCardById(cardId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveNewCard(@RequestBody CardDTO cardDTO) {
        //todo missing implementation
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/{cardId}")
    public ResponseEntity updateCardById(@PathVariable("cardId") String cardId, @RequestBody CardDTO cardDTO) {
        return new ResponseEntity<>(cardService.updateCardById(cardId), HttpStatus.NO_CONTENT);
    }

}
