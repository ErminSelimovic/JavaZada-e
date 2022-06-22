package com.erminselimovic;

import java.sql.*;

public class DB {
    private String ime;
    private int age;


    public DB(String ime, int age) {
        this.ime = ime;
        this.age = age;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void CreateDB() {

        try {
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/testdb", "postgres", "Admin2904");
            ;
            Statement statement = connection.createStatement();
            Class.forName("org.postgresql.Driver");

            String sql = "CREATE TABLE if not EXISTS person  " +
                    "(ID            INT     PRIMARY KEY     NOT NULL," +
                    " NAME          TEXT                    NOT NULL, " +
                    " AGE           INT                     NOT NULL)";
            statement.execute(sql);
            statement.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void InsertNewPerson(String ime, int age) {

        try {
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/testdb", "postgres", "Admin2904");
            ;
            Statement statement = connection.createStatement();
            Class.forName("org.postgresql.Driver");

            String sql2 =
                    "INSERT INTO person" +
                            "(NAME,AGE)" +
                            "VALUES ('" + ime + "'," + age + ")";
            statement.execute(sql2);
            statement.close();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void UpdatePerson(String ime, int newAge) {

        try {
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/testdb", "postgres", "Admin2904");
            Statement statement = connection.createStatement();
            Class.forName("org.postgresql.Driver");

            String sql3 = "UPDATE person SET age ="+newAge+" WHERE NAME ='"+ime+"'";

            statement.execute(sql3);
            statement.close();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void SellectAllFromDB() throws SQLException, ClassNotFoundException {

            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/testdb", "postgres", "Admin2904");
            Statement statement = connection.createStatement();
            Class.forName("org.postgresql.Driver");

            String sqlSelect = "Select * from person ORDER BY ID";
            ResultSet resultSet = statement.executeQuery(sqlSelect);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                System.out.println(id + "-" + name + "-" + age);
                }
        statement.close();
        connection.close();

    }

    public void DeleteWhereId(int id) {

        try {
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/testdb", "postgres", "Admin2904");
            Statement statement = connection.createStatement();
            Class.forName("org.postgresql.Driver");

            String sql4 = "DELETE from person WHERE id ="+id;

            statement.execute(sql4);
            statement.close();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}