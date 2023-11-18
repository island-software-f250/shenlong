package com.islandsoftwaref250.shenlong.request;

import com.islandsoftwaref250.shenlong.models.Item;
import com.islandsoftwaref250.shenlong.models.PaymentDetails;
import com.islandsoftwaref250.shenlong.models.ShippingAddress;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.Set;
import java.util.UUID;

public record OrderRequest(@NotNull UUID customerId, @NotNull ShippingAddress shippingAddress,
                           @NotNull BigDecimal total, @NotNull Set<Item> items, @NotNull PaymentDetails paymentDetails) {
}
