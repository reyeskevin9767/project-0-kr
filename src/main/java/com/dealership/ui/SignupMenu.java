package com.dealership.ui;

import com.dealership.model.User;

import java.util.Scanner;

/**
 *
 *      TODO:   Check for validation for each variable
 *      TODO:   Check if user already exist in the system
 *
 *
 */

public class SignupMenu extends AbstractMenu{

    @Override
    public void showMenu(Scanner scan){
        System.out.println("=====Welcome To Dealing Cars=====");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Username: ");
        String username = scanner.nextLine();

        System.out.println("Password: ");
        String password = scanner.nextLine();

        System.out.println("Phone Number: ");
        String phoneNumber = scanner.nextLine();

        System.out.println("Email: ");
        String email = scanner.nextLine();

        User u = new User(username, password, phoneNumber, email);

        System.out.println("Thanking of taking part of this new car dealerships");
    }

}
