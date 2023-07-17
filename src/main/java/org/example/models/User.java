package org.example.models;

/**
 * Created by: Abdulaziz Pulatjonov
 * Date: 7/11/2023 15:29
 */
public abstract class User {
    public String firstName;
    public String lastName;
    public String passportId;
    public String address;

    public User(String firstName, String lastName, String passportId, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportId = passportId;
        this.address = address;
    }

    public User(){}

    public abstract void printInfo();
}
