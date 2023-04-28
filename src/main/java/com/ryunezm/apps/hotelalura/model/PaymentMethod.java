package com.ryunezm.apps.hotelalura.model;

import lombok.Getter;

@Getter
public record PaymentMethod(String name, String symbol, Double charge) {

    public String getLongName() {
        return name + " (" + symbol + ")";
    }
}
