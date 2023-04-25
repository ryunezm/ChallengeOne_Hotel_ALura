package com.ryunezm.apps.hotelalura.model;

import java.sql.Date;

public class Reserve {
    private String reserveID;
    private Date checkInDate;
    private Date checkOutDate;
    private Double valueReserve;
    private String paymentMethods;

    public Reserve(String reserveID, Date checkInDate, Date checkOutDate, Double valueReserve, String paymentMethods) {
        this.reserveID = reserveID;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.valueReserve = valueReserve;
        this.paymentMethods = paymentMethods;
    }

    public Reserve(Date checkInDate, Date checkOutDate, Double valueReserve, String paymentMethods) {
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.valueReserve = valueReserve;
        this.paymentMethods = paymentMethods;
    }

    public String getReserveID() {
        return reserveID;
    }

    public void setReserveID(String reserveID) {
        this.reserveID = reserveID;
    }

    public Date getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(Date checkInDate) {
        this.checkInDate = checkInDate;
    }

    public Date getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(Date checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public Double getValueReserve() {
        return valueReserve;
    }

    public void setValueReserve(Double valueReserve) {
        this.valueReserve = valueReserve;
    }

    public String getPaymentMethods() {
        return paymentMethods;
    }

    public void setPaymentMethods(String paymentMethods) {
        this.paymentMethods = paymentMethods;
    }
}
