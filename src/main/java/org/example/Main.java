package org.example;

import org.example.arge.CarSkeleton;
import org.example.arge.ElectricCar;
import org.example.arge.GasPoweredCar;
import org.example.arge.HybridCar;

public class Main {

    public static void main(String[] args) {

        CarSkeleton gasCar =
                new GasPoweredCar(
                        "Toyota Corolla",
                        "Gas powered car",
                        14.5,
                        4
                );

        CarSkeleton electricCar =
                new ElectricCar(
                        "Tesla",
                        "Electric powered car",
                        1.1,
                        60
                );

        CarSkeleton hybridCar =
                new HybridCar(
                        "Toyota RAV4",
                        "Hybrid powered car",
                        3.4,
                        40,
                        4
                );

        gasCar.startEngine();
        gasCar.drive();

        electricCar.startEngine();
        electricCar.drive();

        hybridCar.startEngine();
        hybridCar.drive();
    }
}