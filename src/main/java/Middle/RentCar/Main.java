package Middle.RentCar;

import Middle.RentCar.Cars.*;
import Middle.RentCar.impl.Car;

import java.util.Scanner;

import static Middle.RentCar.CarFactory.getCar;
import static Middle.RentCar.TypeOfCar.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Car toyota = getCar(Toyota_Camry);
        Car audi = getCar(Audi_Q3);
        Car vw = getCar(Volkswagen_Golf);
        Car honda = getCar(Honda_Civic);
        Car bmw = getCar(BMW_M3);
        System.out.println("Добро пожаловать в наш салон.");
        System.out.println("На данный момен в салоне для аренды доступны следующие автомобили:");
        System.out.println("1. Toyota_Camry год выпуска " + toyota.getYear() + " пробег = " + toyota.getMillage());
        System.out.println("2. Audi_Q3 год выпуска " + audi.getYear() + " пробег = " + audi.getMillage());
        System.out.println("3. Volkswagen_Golf год выпуска " + vw.getYear() + " пробег = " + vw.getMillage());
        System.out.println("4. Honda_Civic год выпуска " + honda.getYear() + " пробег = " + honda.getMillage());
        System.out.println("5. BMW_M3 год выпуска " + bmw.getYear() + " пробег = " + bmw.getMillage());
        System.out.println("Выберите номер и мы расчитаем аренду за 1 час");

        int chouse = scanner.nextInt();

        switch (chouse) {
            case 1:
                System.out.println("Стоимость аренды: " + TypeOfCar.Toyota_Camry + " за 1 час составит  - " + toyota.calculateRealCost(1));
                break;
            case 2:
                System.out.println("Стоимость аренды: " + TypeOfCar.Audi_Q3 + " за 1 час составит  - " + audi.calculateRealCost(1));
                break;
            case 3:
                System.out.println("Стоимость аренды: " + TypeOfCar.Volkswagen_Golf + " за 1 час составит  - " + vw.calculateRealCost(1));
                break;
            case 4:
                System.out.println("Стоимость аренды: " + TypeOfCar.Honda_Civic + " за 1 час составит  - " + honda.calculateRealCost(1));
                break;
            case 5:
                System.out.println("Стоимость аренды: " + TypeOfCar.BMW_M3 + " за 1 час составит  - " + bmw.calculateRealCost(1));
                break;
            default:
                System.out.println("Неверный автомобиль");
                break;
        }

    }

}

