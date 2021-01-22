package com.academy.telesens.Lesson12.Hometask;

import com.mysql.cj.jdbc.Driver;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Insert200users {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/newschema?user=root&password=password_2021";

        String sqlInsertSimple= "INSERT INTO subscriber " +
                "(first_name, last_name, gender, age)" +
                "VALUES('test', 'test', 'm', 1)";



        String sqlInsertRequestTemp = "INSERT INTO subscriber " +
                "(first_name, last_name, gender, age)" +
                "VALUES(?, ?, ?, ?)";

        try {
            Connection connection = DriverManager.getConnection(url);
            Class.forName("com.mysql.cj.jdbc.Driver");
            // PreparedStatement preparedStatement =

            Statement statement = connection.createStatement();
            for ( int i = 0; i < 201; i++){
                statement.executeUpdate(sqlInsertSimple);
            }

            connection.close();

        } catch (Exception e){
            System.out.println(e);
        }



    }
}
