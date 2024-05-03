package Middle.MyCompany.Employee.impl;

import Middle.MyCompany.Employee.BaseEmployee;

public class Engineer extends BaseEmployee {
    public Engineer(double baseSalary) {
        super(baseSalary);
    }

    @Override
    public double getBaseSalary() {
        return 100_000;
    }

    @Override
    public double getBonus() {
        return 50_000;
    }

    @Override
    public double getTotalSalary() {
        return super.getTotalSalary();
    }
}
