package Middle.RentCar.Cars;

import Middle.RentCar.impl.Car;

public class Toyota_Camry extends Car {
    public Toyota_Camry(int year, int millage, int coefficient) {
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
