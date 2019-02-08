package databasedemo;

import java.sql.*;

public class SqliteStorage {
    private Connection sqliteConnection;
    String path = "jdbc:sqlite:customers.db";
    SqliteStorage() {

        try {
            Connection sqliteConnection = DriverManager.getConnection(path);
            String sql_create_table = "CREATE TABLE IF NOT EXISTS Customers(" +
                    "ID integer PRIMARY KEY," +
                    "Name TEXT);";
            Statement stmt = sqliteConnection.createStatement();
            stmt.execute(sql_create_table);
            stmt.close();
            sqliteConnection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void addCustomer(Customer customer) {
        try {
            Connection sqliteConnection = DriverManager.getConnection(path);
            String sql_insert_customer = "INSERT INTO Customer(Name)" + " VALUES(" + customer.name + "');";
            Statement stmt = sqliteConnection.createStatement();
            stmt.execute(sql_insert_customer);
            stmt.close();

        }catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public Customer findFirstCustomer(String name) {
        Customer customer = new Customer(-1, "NoOne");

        try {
            Connection sqliteConnection = DriverManager.getConnection(path);

            //Hämta alla kunder med matchande namn
            String sql_select_customer = "SELECT * FROM Customers WHERE NAME ='"+name+"'";

            Statement stmt = sqliteConnection.createStatement();

            ResultSet rs = stmt.executeQuery(sql_select_customer);

            if (rs.next()) {
                customer = new Customer(rs.getInt("ID"), rs.getString("Name"));
            }
            rs.close();
            stmt.close();
            sqliteConnection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customer;
    }


    }