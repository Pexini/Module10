package Middle.MyCompany.Employee.impl;

import Middle.MyCompany.Employee.BaseEmployee;

public class Cleaner extends BaseEmployee {
    public Cleaner() {
        super(30_000);
    }

    @Override
    public double getBaseSalary() {
        return 30_000;
    }

    @Override
    public double getBonus() {
        return 5000;
    }

    @Override
    public double getTotalSalary() {
        return super.getTotalSalary();
    }
}
