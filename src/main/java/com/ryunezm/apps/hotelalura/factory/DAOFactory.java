package com.ryunezm.apps.hotelalura.factory;

import com.ryunezm.apps.hotelalura.model.Reserve;
import java.sql.Connection;

public class DAOFactory {

    private Connection connection;

    public DAOFactory(Connection connection){
        this.connection = connection;
    }

    public void saveReserve(Reserve reserve){

    }
}
