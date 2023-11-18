package com.islandsoftwaref250.shenlong.models.enums;

public enum PaymentType {
    CREDIT_CARD("Credit Card"),
    BANK_SLIP("Bank Slip"),
    PIX("PIX");

    private final String displayName;

    PaymentType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}