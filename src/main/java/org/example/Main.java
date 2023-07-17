package org.example;

import org.example.database.UserDatabase;

/**
 * Created by: Abdulaziz Pulatjonov
 * Date: ${DATE} ${HOUR}:${MINUTE}
 */
public class Main {
    public static void main(String[] args) {
        UserDatabase database = new UserDatabase();
        System.out.println("-------------");
        database.getInfo("Wick").printInfo();
        System.out.println("-------------");
        database.getInfo("Martin").printInfo();
        System.out.println("-------------");
        database.getInfo("Anonymous").printInfo();
        System.out.println("-------------");
        database.getInfo("Adam").printInfo();
        System.out.println("-------------");
    }
}