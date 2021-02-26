package com.dealership.ui;

import com.dealership.model.User;
import com.dealership.services.UserService;

import java.util.Scanner;

public class LoginMenu extends AbstractMenu {

    @Override
    public void showMenu(Scanner scan) {

        for(int i =0; i <= 2; i++) {
            System.out.println("username: ");
            String username = scan.nextLine();

            System.out.println("password: ");
            String password = scan.nextLine();

            User user = new UserService().findUserByUsername(username);

            if (user == null || !user.getPassword().equals(password)) {
                System.out.println("login failed");
            } else {
                System.out.println("Welcome Back " + user.getUsername());
                CustomerMenu cm = new CustomerMenu(user);
                cm.showMenu(scan);
                break;
            }
        }
    }
}
