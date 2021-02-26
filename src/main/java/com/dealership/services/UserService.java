package com.dealership.services;

import com.dealership.model.User;

/**
 * TODO: Keep track of each user
 * TODO: Do not allow duplicate users
 * TODO: Delete Users
 * TODO: Update user/customer status
 * TODO: Update user information
 */

public class UserService {

    private static User[] users = new User[10];
    private static int currentIndex = -1;


    public boolean doesUsernameExist(String username) {
        return findUserByUserName(username) != null;
    }

    public User findUserByUserName(String username) {
        if (currentIndex > -1) {
            for (int i = 0; i <= currentIndex; i++) {
                if (users[i].getUsername().equals(username)) {
                    return users[i];
                }
            }
        }
        return null;
    }


    public boolean makeUser(String username, String password, String phoneNumber, String email) {
        if (!doesUsernameExist(username)) {
            if ((currentIndex + 1) < users.length) {
                if (users[currentIndex + 1] == null) {
                    users[++currentIndex] = new User(username, password, phoneNumber, email);
                    return true;
                }
            }
        } else {
            System.out.println("user already exists");
        }
        return false;
    }

}
