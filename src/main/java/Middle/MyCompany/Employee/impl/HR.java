package Middle.MyCompany.Employee.impl;

import Middle.MyCompany.Employee.BaseEmployee;

public class HR extends BaseEmployee {
    private static final double HR_BONUS = 30_000;

    public HR() {
        super(60_000);
    }

    @Override
    public double getBaseSalary() {
        return 60_000;
    }

    @Override
    public double getBonus() {
        return HR_BONUS;
    }

    @Override
    public double getTotalSalary() {
        return super.getTotalSalary();
    }
}
