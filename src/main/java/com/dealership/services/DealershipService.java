package com.dealership.services;

import com.dealership.model.Car;

public class DealershipService {

    //    public static final int MAXIMUM_CAPACITY = 5;
    private static Car[] listOfCars = new Car[5];

    Car newCar1 = new Car("Honda1", 14000.00);
    Car newCar2 = new Car("Honda2", 14000.00);
    Car newCar3 = new Car("Honda3", 14000.00);
    Car newCar4 = new Car("Honda4", 14000.00);
    Car newCar5 = new Car("Honda5", 14000.00);

    public void setCars() {
        listOfCars[0] = newCar1;
        listOfCars[1] = newCar1;
        listOfCars[2] = newCar1;
        listOfCars[3] = newCar1;
        listOfCars[4] = newCar1;
    }

    public void showCars() {
        setCars();
        for (int i = 0; i < listOfCars.length; i++) {
            System.out.println(i + ". " + listOfCars[i].getName() + " " +  listOfCars[i].getPrice());
        }
    }

}
