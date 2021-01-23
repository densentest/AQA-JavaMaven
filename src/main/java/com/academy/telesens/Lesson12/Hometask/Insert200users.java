package com.academy.telesens.Lesson12.Hometask;

import com.academy.telesens.Lesson8_Interfaces.Programmer;
import com.academy.telesens.Util.PropertyProvider;
import com.mysql.cj.jdbc.Driver;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Properties;

public class Insert200users {
    public static void main(String[] args) {

        String dbURL2 = PropertyProvider.get("db.url");

 //       String url = "jdbc:mysql://localhost:3306/newschema?user=root&password=password_2021";

        String sqlInsertSimple = "INSERT INTO subscriber " +
                "(first_name, last_name, gender, age)" +
                "VALUES('test', 'test', 'm', 1)";


        String sqlInsertRequestTemp = "INSERT INTO subscriber " +
                "(first_name, last_name, gender, age)" +
                "VALUES(?, ?, ?, ?)";

        try {
            Connection connection = DriverManager.getConnection(dbURL2);
            Class.forName("com.mysql.cj.jdbc.Driver");
            // PreparedStatement preparedStatement =

            Statement statement = connection.createStatement();
            for (int i = 0; i < 201; i++) {
                statement.executeUpdate(sqlInsertSimple);
            }

            connection.close();

        } catch (Exception e) {
            System.out.println(e);
        }


    }
}
