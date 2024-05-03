package Middle.RentCar.impl;

import java.util.Calendar;

public abstract class Car {
    private int year;
    private int mileage;
    private int coefficient;

    public Car(int year, int millage, int coefficient) {
        this.year = year;
        this.mileage = millage;
        this.coefficient = coefficient;
    }

    public int getYear() {
        return year;
    }

    public int getMillage() {
        return mileage;
    }


    public double calculateRealCost(int rentalTime) {
        int currentYear = java.util.Calendar.getInstance().get(Calendar.YEAR);
        int age = currentYear - year;
        if (year < 20 || mileage < 10_000) {
            double cost = ((10_000 - mileage) * (20 - age) * coefficient * rentalTime) / 1000.0;
            return cost;
        } else {
            System.out.println(" Данный автомобиль не подлежит аренде. ");
            return 0;
        }
    }
}
