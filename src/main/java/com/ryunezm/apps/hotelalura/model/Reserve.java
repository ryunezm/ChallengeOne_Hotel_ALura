package com.ryunezm.apps.hotelalura.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@AllArgsConstructor
public class Reserve {
    private String reserveID;
    private Date checkInDate;
    private Date checkOutDate;
    private Double valueReserve;
    private PaymentMethod paymentMethod;
}
