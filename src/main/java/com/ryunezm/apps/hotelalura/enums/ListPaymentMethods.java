package com.ryunezm.apps.hotelalura.enums;

public enum ListPaymentMethods {

    mastercard("Mastercard", TypesPaymentMethods.card, 1.1),
    visa("Visa", TypesPaymentMethods.card, 1.1),
    american_express("American Express", TypesPaymentMethods.card, 1.1),
    diners_club("Diners Club International", TypesPaymentMethods.card, 1.1),
    paypal("PayPal", TypesPaymentMethods.online_payment, 1.01),
    apple_pay("Apple Pay", TypesPaymentMethods.online_payment, 1.01),
    google_pay("Google Pay", TypesPaymentMethods.online_payment, 1.01),
    amazon_pay("Amazon Pay", TypesPaymentMethods.online_payment, 1.01),
    cash("Cash", TypesPaymentMethods.cash, 1.0);

    ListPaymentMethods(String name, TypesPaymentMethods typesPaymentMethods, Double charge) {
    }
}
