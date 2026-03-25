package org.jdbcconnection;

import java.sql.*;
import java.util.*;

public class DBConnection {
    public static volatile Connection connection;

    public static Connection getConnection() {

        if (connection == null) {

            synchronized (DBConnection.class) {

                if (connection == null) {

                    try {
                        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignmentcsv", "root", "root@123");
                        System.out.println("Connected to database successfully");
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        return connection;

    }


    public static void closeConnection() {
        if (connection != null) {
            synchronized (DBConnection.class) {

                if (connection != null) {
                    try {
                        connection.close();
                        System.out.println("the connection is closed successfully");
                    } catch (SQLException e) {
                        e.printStackTrace();
                        System.out.println("error in closing connection : e - " + e);
                    }
                }
                connection = null;
            }
        }
    }

    public static void createTable(String tableName) {
        if (connection != null) {
            try {
                Statement st = connection.createStatement();
                st.execute("CREATE TABLE " + tableName + " (id INT PRIMARY KEY AUTO_INCREMENT, first_name VARCHAR(30), last_name VARCHAR(30), age INT)");
                System.out.println("table : " + tableName + " created successfully");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            getConnection();
            createTable(tableName);
        }
    }

    public static void insertPerson(Person person) {
        try {
            PreparedStatement st = connection.prepareStatement("INSERT INTO persons VALUES(null, ?, ?, ?)");
            st.setString(1, person.getFirstName());
            st.setString(2, person.getLastName());
            st.setInt(3, person.getAge());

            System.out.println("rows affected : " + st.executeUpdate());

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<Person> getAllPerson() {
        List<Person> ans = new ArrayList();
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM persons");
            while (rs.next()) {
                String first_name = rs.getString(2);
                String last_name = rs.getString(3);
                int age = rs.getInt(4);

                Person person = new Person(first_name, last_name, age);
                ans.add(person);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return ans;
    }

    public static Person getPersonbyId(int id) {
        Person ans = null;
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM persons where id = " + id);
            while (rs.next()) {
                String first_name = rs.getString(2);
                String last_name = rs.getString(3);
                int age = rs.getInt(4);

                ans = new Person(first_name, last_name, age);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return ans;
    }

    public static void deletePersonBYId(int id) {
        try {
            Statement st = connection.createStatement();
            int rows_affected = st.executeUpdate("DELETE FROM persons where id = " + id);
            if (rows_affected >= 1) {
                System.out.println("Person with id " + id + " has been successfully deleted");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void updatePerson(Person person, Person updatePerson) {
        try {
            Person p = getPersonbyId(person.getId());

            if (p != null) {

                String query = "UPDATE person SET first_name=?, last_name=?, age=? WHERE id=?";
                PreparedStatement ps = connection.prepareStatement(query);

                ps.setString(1, updatePerson.getFirstName());
                ps.setString(2, updatePerson.getLastName());
                ps.setInt(3, updatePerson.getAge());
                ps.setInt(4, person.getId());

                int rowsUpdated = ps.executeUpdate();

                if (rowsUpdated > 0) {
                    System.out.println("Person updated successfully");
                } else {
                    System.out.println("Update failed");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }

    }

}