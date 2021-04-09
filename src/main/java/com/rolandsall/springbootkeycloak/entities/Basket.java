package com.rolandsall.springbootkeycloak.entities;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import java.util.List;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@Document(collection = "products")
public class Basket {

    @Id
    private UUID id;
    private UUID userId;
    private List<Item> itemList;
}
