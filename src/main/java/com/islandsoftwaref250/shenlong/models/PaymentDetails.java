package com.islandsoftwaref250.shenlong.models;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class PaymentDetails {

    @NotNull
    private String token;

    @NotNull
    private String paymentMethod;

    private Integer installments;

}
