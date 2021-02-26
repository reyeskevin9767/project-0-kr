package com.dealership.ui;

import com.dealership.services.UserService;

import java.util.Scanner;

public class LoginMenu extends AbstractMenu {


    @Override
    public void showMenu(Scanner scan) {

        System.out.println("Username: ");
        String username = scan.nextLine();

        System.out.println("Password: ");
        String password = scan.nextLine();

        User user = new UserService().findUserByUserName(username);


    }



}
