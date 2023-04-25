package com.ryunezm.apps.hotelalura.factory;

import com.ryunezm.apps.hotelalura.model.Guest;
import com.ryunezm.apps.hotelalura.model.Reserve;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class MySQL {

    private Connection connection;

    public MySQL(String url, String user, String password) throws SQLException {
        connection = DriverManager.getConnection(url, user, password);
    }

    public void addGuest(Guest guest) throws SQLException {
        String query = "INSERT INTO guests (guestID, guestName, guestEmail, guestPhone) VALUES (?, ?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, guest.getGuestID());
        statement.setString(2, guest.getGuestName());
        statement.setString(3, guest.getGuestEmail());
        statement.setString(4, guest.getGuestPhone());
        statement.executeUpdate();
    }

    public List<Guest> getAllGuests() {
        return null;
    }

    public Guest getGuestByID() {
        return null;
    }

    public void closeConnection() throws SQLException {
        connection.close();
    }

    public void addReserve(Reserve reserve) {
    }

    public List<Reserve> getAllReserves() {
        return null;
    }


}
