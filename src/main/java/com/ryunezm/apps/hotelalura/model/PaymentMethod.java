package com.ryunezm.apps.hotelalura.model;

public class PaymentMethod {
    private final String name;
    private final String symbol;

    public PaymentMethod(String name, String symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    public PaymentMethod getPaymentMethod(){
        return new PaymentMethod(name, symbol);
    }
}
