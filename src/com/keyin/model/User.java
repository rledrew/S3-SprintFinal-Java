package com.keyin.model;

public class User {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private boolean isDoctor;


    public User(int id, String firstName, String lastName, String email, String password, boolean isDoctor) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.isDoctor = isDoctor;
    }
    // getters for the properties
    public String getEmail() {
        return email;
    }
    public String getFirstName() {
        return firstName;
    }
    public int getId() {
        return id;
    }
    public String getLastName() {
        return lastName;
    }
    public String getPassword() {
        return password;
    }
    public boolean isDoctor() {
        return isDoctor;
    }
    public String toString() {
        return "First Name: " + firstName + "\n" +
                "Last Name: " + lastName + "\n" +
                "Email: " + email + "\n" +
                "Password: " + password + "\n" +
                "Is Doctor: " + isDoctor + "\n";
    }

    // setters for the properties

    public void setEmail(String email) {
        this.email = email;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName (String lastName) {
        this.lastName = lastName;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public void setDoctor(boolean doctor) {
        isDoctor = doctor;
    }

}
