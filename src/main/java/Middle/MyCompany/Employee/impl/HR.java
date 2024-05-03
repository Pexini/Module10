package Middle.MyCompany.Employee.impl;

import Middle.MyCompany.Employee.BaseEmployee;

public class HR extends BaseEmployee {
    public HR() {
        super(60_000);
    }

    @Override
    public double getBaseSalary() {
        return 60_000;
    }

    @Override
    public double getBonus() {
        return 30_000;
    }

    @Override
    public double getTotalSalary() {
        return super.getTotalSalary();
    }
}
