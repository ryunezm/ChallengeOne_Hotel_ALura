package com.ryunezm.apps.hotelalura.enums;

public enum TypesPaymentMethods {

    cash("Cash", "\uD83D\uDCB5", 1.0),
    card("Credit/Debit card", "\uD83D\uDCB3,", 1.4),
    online_payment("Online payment", "\uD83E\uDD11", 1.2);

    private final String name;
    private final String symbol;
    private final Double charge;

    TypesPaymentMethods(String name, String symbol, Double charge){
        this.name = name;
        this.symbol = symbol;
        this.charge = charge;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public Double getCharge() {
        return charge;
    }
}
