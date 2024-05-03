package Middle.MyCompany;

public class Scientist extends BaseEmployee {
    public Scientist(double baseSalary) {
        super(baseSalary);
    }

    @Override
    public double getBaseSalary() {
        return super.getBaseSalary();
    }

    @Override
    public double getBonus() {
        return 0;
    }

    @Override
    public double getTotalSalary() {
        return super.getTotalSalary();
    }
}
