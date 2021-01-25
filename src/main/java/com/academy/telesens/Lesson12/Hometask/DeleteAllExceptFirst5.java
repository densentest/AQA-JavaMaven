package com.academy.telesens.Lesson12.Hometask;

import com.academy.telesens.Util.PropertyProvider;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteAllExceptFirst5 {
    public static void main(String[] args) {
        String dbUrl = PropertyProvider.get("db.url");

        String sqlQueryDelete = "DELETE FROM newschema.subscriber WHERE subscriber_id > 6";
        try {
            Connection connection = DriverManager.getConnection(dbUrl);
            Class.forName("com.mysql.cj.jdbc.Driver");
            Statement statement = connection.createStatement();
            statement.executeUpdate(sqlQueryDelete);
            connection.close();

        } catch (Exception e){
            System.out.println(e);
        }

    }
}
