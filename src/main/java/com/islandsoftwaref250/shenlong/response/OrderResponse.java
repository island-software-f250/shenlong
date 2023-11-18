package com.islandsoftwaref250.shenlong.response;

import java.time.LocalDateTime;
import java.util.UUID;

public record OrderResponse(UUID orderId, LocalDateTime createdAt) {
}
