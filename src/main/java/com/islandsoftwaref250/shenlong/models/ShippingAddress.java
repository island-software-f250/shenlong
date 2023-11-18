package com.islandsoftwaref250.shenlong.models;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class ShippingAddress {

    @NotNull
    private String street;

    @NotNull
    private String city;

    @NotNull
    private String zipCode;
}
