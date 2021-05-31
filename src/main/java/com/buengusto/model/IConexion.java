package com.buengusto.model;

import java.sql.Connection;
import java.sql.SQLException;

public interface IConexion {
    Connection getConnection() throws SQLException;
}
