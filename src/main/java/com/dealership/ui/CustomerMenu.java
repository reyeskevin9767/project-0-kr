package com.dealership.ui;

import com.dealership.model.User;

import java.util.Scanner;

public class CustomerMenu extends AbstractMenu{

    private User user;

    @Override
    public void showMenu(Scanner scan) {

        System.out.println("1: View All the Cars");
        System.out.println("2. Make An Offer");
        System.out.println("3. View Own Cars");
        System.out.println("4. View Remaining Payments");
        System.out.println("5: Return To Login Screen");
        switch(scan.nextLine()){
            case "1":
                ViewAllCarsMenu vm = new ViewAllCarsMenu();
                vm.showMenu(scan);
                break;
            case "2":
                // TODO: ALLOW USER TO MAKE AN OFFER
            case "3":
                // TODO: VIEW THE CARS I OWN
            case "4":
                // TODO: VIEW REMAINING PAYMENTS ON SPECIFIC CAR
            case "5":
                SignupMenu sm = new SignupMenu();
                sm.showMenu(scan);
                break;
            default:
                showMenu(scan);
                return;
        }
    }

    public CustomerMenu(User user){
        this.user = user;
    }
}
