package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public CarSkeleton() {
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
    public void startEngine(){}

    public void drive() {
runEngine();
    }
    protected void runEngine(){}
}
public class GasPoweredCar extends CarSkeleton{
    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String name, String description, double avgKmPerLitre, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }


    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getCylinders() {
        return cylinders;
    }
    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName() + " gas engine is starting");
    }
    @Override
    public void drive() {
        System.out.println(getClass().getSimpleName() + " gas car is driving");
        runEngine();
    }
}
public class ElectricCar extends CarSkeleton{
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String name, String description, double avgKmPerCharge, int batterySize) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }
    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName() + " electric engine is starting");
    }
    @Override
    public void drive() {
        System.out.println(getClass().getSimpleName() + " electric car is driving");
        runEngine();
    }
}
public class HybridCar extends CarSkeleton{
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String name, String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public int getCylinders() {
        return cylinders;
    }
    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName() + " hybrid engine is starting");
    }
    @Override
    public void drive() {
        System.out.println(getClass().getSimpleName() + " hybrid car is driving");
        runEngine();
    }
}
