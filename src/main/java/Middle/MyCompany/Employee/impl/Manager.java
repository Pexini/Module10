package Middle.MyCompany.Employee.impl;

import Middle.MyCompany.Employee.BaseEmployee;

public class Manager extends BaseEmployee {
    private static final double MANAGER_BONUS = 10_000;

    public Manager() {
        super(50_000);
    }


    @Override
    public double getBonus() {
        return MANAGER_BONUS;
    }

    @Override
    public double getTotalSalary() {
        return super.getTotalSalary();
    }
}
