package com.ryunezm.apps.hotelalura.controller;

import com.ryunezm.apps.hotelalura.model.Guest;
import com.ryunezm.apps.hotelalura.factory.MySQL;

import java.sql.SQLException;
import java.util.List;

public class GuestController {

    private MySQL db;

    public GuestController(MySQL db) {
        this.db = db;
    }

    public void addGuest(Guest guest) throws SQLException {
        db.addGuest(guest);
    }

    public List<Guest> getAllGuests(){
        return db.getAllGuests();
    }

    public Guest getGuestByID(String id){
        return db.getGuestByID();
    }
}
