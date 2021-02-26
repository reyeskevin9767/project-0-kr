package com.dealership.ui;

import com.dealership.model.User;
import com.dealership.services.UserService;

import java.util.Scanner;

public class LoginMenu extends AbstractMenu {

    @Override
    public void showMenu(Scanner scan) {

        for(int i =0; i <= 2; i++) {
            System.out.println("username: ");
            String username = scan.nextLine().toLowerCase();

            System.out.println("password: ");
            String password = scan.nextLine();

            User u = new UserService().findUserByUsername(username);

            if (u == null || !u.getPassword().equals(password)) {
                System.out.println("login failed");
            } else {
                System.out.println("Welcome Back" + u.getUsername());

                break;
            }
        }
    }
}
