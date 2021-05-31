package com.buengusto.model;

import java.sql.Connection;
import java.sql.SQLException;

public class Conn {
    public static Connection getConexion(IConexion conexion) throws SQLException {
        return conexion.getConnection();
    }
}
