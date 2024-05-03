package Middle.RentCar;

public abstract class Car {
    private int year;
    private int millage;
    private int coefficient;

    public Car(int year, int millage, int coefficient) {
        this.year = year;
        this.millage = millage;
        this.coefficient = coefficient;
    }

    public int getYear() {
        return year;
    }

    public int getMillage() {
        return millage;
    }

    public int getCoefficient() {
        return coefficient;
    }

    public double calculateRealCost(int rentalTime){
        int age = 2024 - year;
        if (age > 20 || millage > 10_000){
            throw new  IllegalArgumentException (" Данный автомобиль не подлежит аренде. ");
        }
       double coast = ((10_000 - millage) * (20 - age) * coefficient * rentalTime) /  1000.0;
        return  coast;
    }
}
