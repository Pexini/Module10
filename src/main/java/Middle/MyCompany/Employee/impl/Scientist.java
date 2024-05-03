package Middle.MyCompany.Employee.impl;

import Middle.MyCompany.Employee.BaseEmployee;

public class Scientist extends BaseEmployee {
    public Scientist() {
        super(30_000);
    }

    @Override
    public double getBaseSalary() {
        return 30_000;
    }

    @Override
    public double getBonus() {
        return 70_000;
    }

    @Override
    public double getTotalSalary() {
        return super.getTotalSalary();
    }
}
