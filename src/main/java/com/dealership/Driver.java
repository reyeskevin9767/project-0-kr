package com.dealership;

import com.dealership.ui.LoginMenu;
import com.dealership.ui.SignupMenu;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

<<<<<<< HEAD
        SignupMenu sm = new SignupMenu();
        LoginMenu lm = new LoginMenu();

        sm.showMenu(scan);
        lm.showMenu(scan);

=======
        LoginMenu lm = new LoginMenu();
        SignupMenu sm = new SignupMenu();

        lm.showMenu(scan);
        sm.showMenu(scan);
>>>>>>> b0375adfa9b976815d4b636cc14d401b0f332807


    }

<<<<<<< HEAD
=======

>>>>>>> b0375adfa9b976815d4b636cc14d401b0f332807
}
