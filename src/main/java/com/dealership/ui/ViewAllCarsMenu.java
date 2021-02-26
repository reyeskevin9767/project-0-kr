package com.dealership.ui;

import com.dealership.services.DealershipService;

import java.util.Scanner;

public class ViewAllCarsMenu extends AbstractMenu{

    @Override
    public void showMenu(Scanner scan) {

        System.out.println("====Available Cars====");
        DealershipService ds = new DealershipService();
        ds.showCars();

        switch(scan.nextLine()){
            case "Return":
                System.out.println();
        }
    }
}
