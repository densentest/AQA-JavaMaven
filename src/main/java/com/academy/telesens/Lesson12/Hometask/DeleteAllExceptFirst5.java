package com.academy.telesens.Lesson12.Hometask;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteAllExceptFirst5 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/newschema?user=root&password=password_2021";

        String sqlQueryDelete = "DELETE FROM newschema.subscriber WHERE subscriber_id > 6";
        try {
            Connection connection = DriverManager.getConnection(url);
            Class.forName("com.mysql.cj.jdbc.Driver");
            Statement statement = connection.createStatement();
            statement.executeUpdate(sqlQueryDelete);
            connection.close();

        } catch (Exception e){
            System.out.println(e);
        }

    }
}
