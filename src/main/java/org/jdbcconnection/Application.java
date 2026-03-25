

package org.jdbcconnection;

public class Application {
    public static void main(String[] args) {
        DBConnection.closeConnection();
        DBConnection.getConnection();
        DBConnection.createTable("persons");
        DBConnection.insertPerson(new Person("John", "Doe", 25));
        DBConnection.insertPerson(new Person("Swarit", "Sharma", 21));

        System.out.println(DBConnection.getAllPerson());
        DBConnection.deletePersonBYId(2);
        DBConnection.getAllPerson();
    }
}