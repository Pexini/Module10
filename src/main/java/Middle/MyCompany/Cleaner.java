package Middle.MyCompany;

public class Cleaner extends BaseEmployee{
    public Cleaner(double baseSalary) {
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
