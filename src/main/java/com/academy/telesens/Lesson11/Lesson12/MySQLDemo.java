package com.academy.telesens.Lesson11.Lesson12;

import java.io.IOException;
import java.sql.*;

public class MySQLDemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/newschema?user=root&password=password_2021";
        String sqlInsert = "INSERT INTO subscriber" +
                "(first_name, last_name, gender, age)" +
                "VALUES( 'demo', 'demo', 'm', 23)";
        String sqlInsertTemplate = "INSERT INTO subscriber" +
                "(first_name, last_name, gender, age)" +
                "VALUES( ?,?,?,?)";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url);
            Statement statement = conn.createStatement();
            statement.executeUpdate(sqlInsert);

            PreparedStatement preparedStatement = conn.prepareStatement(sqlInsertTemplate);
            preparedStatement.setString(1, "demo_first_name2");
            preparedStatement.setString(2, "demo_last_name2");
            preparedStatement.setString(3, "f");
            preparedStatement.setInt(4, 26);
            preparedStatement.executeUpdate();

            //read subscriber table
           Statement readStatement =  conn.createStatement();
           ResultSet resultSet = readStatement.executeQuery("SELECT * FROM SUBSCRIBER");

          while (resultSet.next()) {

              int id = resultSet.getInt("subscriber_id");
              String firstName = resultSet.getString("first_name");
              String lastName = resultSet.getString("last_name");
              String gender = resultSet.getString("gender");
              Integer age = resultSet.getInt("age");

              System.out.println(String.format("%d | %s | %s | %s |%d", id, firstName, lastName, gender, age));

          }
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
