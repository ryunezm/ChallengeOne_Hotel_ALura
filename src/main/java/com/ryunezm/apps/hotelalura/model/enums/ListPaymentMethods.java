package com.ryunezm.apps.hotelalura.model.enums;

import lombok.Getter;

@Getter
public enum ListPaymentMethods {

    mastercard("Mastercard", TypesPaymentMethods.card, 1.0),
    visa("Visa", TypesPaymentMethods.card, 1.0),
    american_express("American Express", TypesPaymentMethods.card, 1.0),
    diners_club("Diners Club International", TypesPaymentMethods.card, 1.0),
    paypal("PayPal", TypesPaymentMethods.online_payment, 1.0),
    apple_pay("Apple Pay", TypesPaymentMethods.online_payment, 1.0),
    google_pay("Google Pay", TypesPaymentMethods.online_payment, 1.0),
    amazon_pay("Amazon Pay", TypesPaymentMethods.online_payment, 1.0),
    cash("Cash", TypesPaymentMethods.cash, 1.0);

    private final String name;
    private final TypesPaymentMethods typesPaymentMethods;
    private final Double charge;
    ListPaymentMethods(String name, TypesPaymentMethods typesPaymentMethods, Double charge) {
        this.name = name;
        this.typesPaymentMethods = typesPaymentMethods;
        this.charge = charge;
    }
}
