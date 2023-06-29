package com.ryunezm.apps.hotelalura.model.enums;

import com.ryunezm.apps.hotelalura.model.PaymentMethod;
import lombok.Getter;

@Getter
public enum TypesPaymentMethods {

    cash("Cash"),
    card("Credit/Debit card"),
    online_payment("Online payment");

    private final String name;

    TypesPaymentMethods(String name){
        this.name = name;
    }
}
