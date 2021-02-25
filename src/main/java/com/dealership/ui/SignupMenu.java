package com.dealership.ui;

import com.dealership.model.User;

import java.util.Scanner;

public class SignupMenu extends AbstractMenu{

    @Override
    public void showMenu(Scanner scan) {

        System.out.println("=====Welcome To Dealing Cares=====");

        System.out.println("Username: ");
        String username = scan.nextLine();

        System.out.println("Password: ");
        String password = scan.nextLine();

        System.out.println("Phone Number: ");
        String phoneNumber = scan.nextLine();

        System.out.println("Email: ");
        String email = scan.nextLine();

        User us = new User(username, password, phoneNumber, email);

        System.out.println(us.getUsername());

    }
}
