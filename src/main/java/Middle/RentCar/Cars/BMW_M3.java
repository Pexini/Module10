package Middle.RentCar.Cars;

import Middle.RentCar.impl.Car;

public class BMW_M3 extends Car {
    private static final int COEFFICIENT_BMW_MS = 5;

    public BMW_M3(int year, int millage) {
        super(year, millage, COEFFICIENT_BMW_MS);
    }
}

