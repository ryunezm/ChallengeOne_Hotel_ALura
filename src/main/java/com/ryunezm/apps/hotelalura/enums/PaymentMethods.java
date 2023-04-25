package com.ryunezm.apps.hotelalura.enums;

public enum PaymentMethods {

    cash("Cash", "\uD83D\uDCB5", 1.0),
    debit_card("Debit card", "💳", 1.1),
    credit_card("Credit card", "\uD83D\uDCB3,", 1.4),
    online_payment("Online payment", "\uD83E\uDD11", 1.2);

    private final String name;
    private final String symbol;
    private final Double charge;

    PaymentMethods(String name, String symbol, Double charge){
        this.name = name;
        this.symbol = symbol;
        this.charge = charge;
    }
}
