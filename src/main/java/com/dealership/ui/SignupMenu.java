package com.dealership.ui;

import com.dealership.services.UserService;

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

        UserService us = new UserService();

        System.out.println("=====Welcome To Dealing Cars=====");
        Scanner scanner = new Scanner(System.in);
        String username = "";

        do{
            System.out.println("Username: ");
            username = scanner.nextLine();
        }while(us.doesUsernameExist(username));



        System.out.println("Password: ");
        String password = scanner.nextLine();

        System.out.println("Phone Number: ");
        String phoneNumber = scanner.nextLine();

        System.out.println("Email: ");
        String email = scanner.nextLine();

        System.out.println(us.makeUser(username,password, phoneNumber, email) ? username + " was successfully made" : "cancelled registration");
    }

}
