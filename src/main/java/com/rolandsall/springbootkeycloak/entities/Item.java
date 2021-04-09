package com.rolandsall.springbootkeycloak.entities;

import lombok.*;

import java.util.UUID;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Item {

    private UUID itemId;
    private String name;
    private String description;
    private String price;
}
