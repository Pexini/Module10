package Middle.RentCar.Cars;

import Middle.RentCar.impl.Car;

public class Honda_Civic extends Car {
    public Honda_Civic(int year, int millage, int coefficient) {
        super(year, millage, coefficient);
    }

    @Override
    public int getYear() {
        return super.getYear();
    }

    @Override
    public int getMillage() {
        return super.getMillage();
    }

    @Override
    public int getCoefficient() {
        return super.getCoefficient();
    }

    @Override
    public double calculateRealCost(int rentalTime) {
        return super.calculateRealCost(rentalTime);
    }
}
