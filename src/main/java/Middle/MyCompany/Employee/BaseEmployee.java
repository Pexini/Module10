package Middle.MyCompany.Employee;

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
        double total = getBaseSalary() + getBonus();
        return total;
    }

}
