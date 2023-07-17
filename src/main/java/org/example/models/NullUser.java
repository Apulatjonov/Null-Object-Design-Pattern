package org.example.models;

/**
 * Created by: Abdulaziz Pulatjonov
 * Date: 7/11/2023 15:31
 */
public class NullUser extends User{
    @Override
    public void printInfo() {
        System.out.println("No info available!");
    }
}
