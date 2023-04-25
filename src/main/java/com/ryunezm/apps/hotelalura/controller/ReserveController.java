package com.ryunezm.apps.hotelalura.controller;

import com.ryunezm.apps.hotelalura.factory.MySQL;
import com.ryunezm.apps.hotelalura.model.Reserve;

import java.util.List;

public class ReserveController {

    private MySQL db;

    public ReserveController(MySQL db) {
        this.db = db;
    }

    public void addReserve(Reserve reserve){
        db.addReserve(reserve);
    }

    public List<Reserve> getAllReserves(){
        return db.getAllReserves();
    }

    public double getTotalValue(List<Reserve> reserves){
        double total = 0;
        for (Reserve reserve : reserves){
            total += reserve.getValueReserve();
        }
        return  total;
    }
}
