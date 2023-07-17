package org.example.database;

import org.example.models.ActiveUser;
import org.example.models.NullUser;
import org.example.models.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by: Abdulaziz Pulatjonov
 * Date: 7/11/2023 15:24
 */
public class UserDatabase {
    List<User> users;

    public UserDatabase() {
        this.users = new ArrayList<>();
        users.add(new ActiveUser("John", "Wick", "AB123", "Continental"));
        users.add(new ActiveUser("James", "Smith", "CD987", "New Jersey"));
        users.add(new ActiveUser("Martin", "Eden", "QW998", "London"));
    }

    public User getInfo(String byName){
        for (User user : this.users){
            if (byName.equalsIgnoreCase(user.firstName) || byName.equalsIgnoreCase(user.lastName)){
                return user;
            }
        }
        return new NullUser();
    }
}
