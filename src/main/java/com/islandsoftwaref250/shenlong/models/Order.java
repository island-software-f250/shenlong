package com.islandsoftwaref250.shenlong.models;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document
public class Order implements Serializable {

    @Id
    private UUID id;

    private UUID customerId;

    private ShippingAddress shippingAddress;

    private BigDecimal total;

    private LocalDateTime date;

    private Set<Item> items;

    private PaymentDetails paymentDetails;
}
