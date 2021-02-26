package com.dealership;

import com.dealership.ui.LoginMenu;
import com.dealership.ui.SignupMenu;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        LoginMenu lm = new LoginMenu();
        SignupMenu sm = new SignupMenu();
        boolean continueLoop = true;

        do {
            System.out.println("Welcome to Dealing Cars");
            System.out.println("What Would You Like To Do: SignUp, Login, or Exit");
            String answer = scan.nextLine().toLowerCase();

            switch (answer){
                case "exit":
                    continueLoop = false;
                    System.out.println("Thank You For Visiting Dealing Cars, Come Again");
                case "signup":
                case "sign up":
                    sm.showMenu(scan);
                    break;
                case "login":
                    lm.showMenu(scan);
                    break;
            }

        } while (continueLoop);


    }


}
