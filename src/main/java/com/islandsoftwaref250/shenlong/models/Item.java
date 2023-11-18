package com.islandsoftwaref250.shenlong.models;

import lombok.*;

import java.util.UUID;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Item {
    private UUID id;
    private int quantity;
}
