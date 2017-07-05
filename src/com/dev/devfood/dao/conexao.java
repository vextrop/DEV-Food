/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dev.devfood.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexao {

    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("org.hsqldb.jdbcDriver");
            //conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/foodb", "sa", "");
            conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/foodb", "sa", "");
        } catch (SQLException e) {
            System.out.println("Problemas ao conectar no banco de dados");
        } catch (ClassNotFoundException e) {
            System.out.println("O driver não foi configurado corretametne");
        }

        return conn;
    }
}
