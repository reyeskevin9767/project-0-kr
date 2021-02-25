package com.dealership;

import com.dealership.ui.LoginMenu;
import com.dealership.ui.SignupMenu;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        SignupMenu sm = new SignupMenu();
        LoginMenu lm = new LoginMenu();

        sm.showMenu(scan);
        lm.showMenu(scan);



    }

}
