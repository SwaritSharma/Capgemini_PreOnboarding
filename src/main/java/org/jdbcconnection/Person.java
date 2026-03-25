package org.jdbcconnection;

public class Person {
    int id, age;
    String firstName, lastName;
    public Person(String firstName, String lastName, int age) {
        this.id = this.id;
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    @Override
    public String toString() {
        return "first name : " + this.firstName + ", last name : " + this.lastName + ", age : " + this.age;
    }
}