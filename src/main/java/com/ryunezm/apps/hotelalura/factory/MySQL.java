package com.ryunezm.apps.hotelalura.factory;

import com.ryunezm.apps.hotelalura.model.Guest;
import com.ryunezm.apps.hotelalura.model.Reserve;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQL {

    private Connection connection;

    public MySQL(String url, String user, String password) throws SQLException {
        connection = DriverManager.getConnection(url, user, password);
    }

    public void addGuest(Guest guest) throws SQLException {
        String query = "INSERT INTO guests (guestID, guestName, guestEmail, guestPhone) VALUES (?, ?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, guest.getId());
        statement.setString(2, guest.getName());
        statement.setString(3, guest.getEmail());
        statement.setString(4, guest.getPhone());
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

    public List<Reserve> getAllReserves() throws SQLException {

        List<Reserve> reserves = new ArrayList<>();

        String query = "SELECT * FROM reserves";
        PreparedStatement statement = connection.prepareStatement(query);
        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()){

        }


        return null;
    }


}
