package Middle.MyCompany;

public abstract class BaseEmployee implements Employee {

    private double baseSalary;

    public BaseEmployee(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double getBaseSalary() {
        return baseSalary;
    }

    public abstract double getBonus();


    @Override
    public double getTotalSalary() {
        return getBaseSalary() + getBonus();
    }

}
