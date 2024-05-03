package Middle.MyCompany.Employee.impl;

import Middle.MyCompany.Employee.BaseEmployee;

public class Manager extends BaseEmployee {
    public Manager(double baseSalary) {
        super(baseSalary);
    }

    @Override
    public double getBaseSalary() {
        return 50_000;
    }

    @Override
    public double getBonus() {
        return 10_000;
    }

    @Override
    public double getTotalSalary() {
        return super.getTotalSalary();
    }
}
