package com.dealership.ui;

import com.dealership.services.UserService;

import java.util.Scanner;

public class SignupMenu extends AbstractMenu{

    @Override
    public void showMenu(Scanner scan) {

        UserService us = new UserService();

        System.out.println("====Ready To Join====");
        String username = "";

        do{
            if (!us.doesUsernameExist(username)) {
                System.out.println("Provide Us With Username, Please Try Again: ");
            }else{
                System.out.println("Username Already Taken : ");
            }

            username = scan.nextLine();
        } while(us.doesUsernameExist(username));


        // TODO : Check length of password
        System.out.println("Provide Us With Password: ");
        String password = scan.nextLine();

        // TODO: check phoneNumber
        System.out.println("Provide Us With Phone Number:");
        String phoneNumber = scan.nextLine();

        // TODO: check email
        System.out.println("Provide Us With An Email: ");
        String email = scan.nextLine();

        System.out.println(us.addUser(username, password, phoneNumber, email) ?
                "successfully made "+username :
                "cancelled registration");

    }
}
