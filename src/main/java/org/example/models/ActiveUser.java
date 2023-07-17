package org.example.models;

/**
 * Created by: Abdulaziz Pulatjonov
 * Date: 7/11/2023 15:25
 */
public class ActiveUser extends User{

    public ActiveUser(String firstName, String lastName, String passportId, String address) {
        super(firstName, lastName, passportId, address);
    }

    @Override
    public void printInfo() {
        {
            System.out.println("Firstname: " + this.firstName +"\n"
                    + "Lastname: " + this.lastName + "\n"
                    + "Address: " + this.address + "\n"
                    + "Passport: " + this.passportId);
        }
    }
}
