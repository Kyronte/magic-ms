package com.kyro.sideboardwizard.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CardDTO {
    private String id;
    private String name;
    private Supertype[] supertypes;
    private Subtype[] subtypes;
}
