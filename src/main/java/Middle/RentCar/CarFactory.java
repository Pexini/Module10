package Middle.RentCar;

import Middle.RentCar.Cars.*;
import Middle.RentCar.impl.Car;

public class CarFactory {
    public static Car getCar(TypeOfCar typeOfCar) {
        switch (typeOfCar) {
            case Toyota_Camry:
                return new Toyota_Camry();
            case Audi_Q3:
                return new Audi_Q3();
            case Volkswagen_Golf:
                return new Volkswagen_Golf();
            case Honda_Civic:
                return new Honda_Civic();
            case BMW_M3:
                return new BMW_M3();
            default:
                throw new IllegalArgumentException("Неверный тип автомобиля");
        }
    }
}
