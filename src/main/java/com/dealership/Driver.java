package com.dealership;

import com.dealership.ui.LoginMenu;
import com.dealership.ui.SignupMenu;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        LoginMenu lm = new LoginMenu();
        SignupMenu sm = new SignupMenu();

        lm.showMenu(scan);
        sm.showMenu(scan);


    }


}
