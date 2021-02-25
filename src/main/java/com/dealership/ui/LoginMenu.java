package com.dealership.ui;

import java.util.Scanner;

public class LoginMenu extends AbstractMenu {

    @Override
    public void showMenu(Scanner scan) {

        System.out.println("Username: ");
        String username = scan.nextLine();

        System.out.println("Password: ");
        String password = scan.nextLine();

    }
}
