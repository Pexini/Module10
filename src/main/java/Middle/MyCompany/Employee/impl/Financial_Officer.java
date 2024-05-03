package Middle.MyCompany.Employee.impl;

import Middle.MyCompany.Employee.BaseEmployee;

public class Financial_Officer extends BaseEmployee {
    public Financial_Officer() {
        super(150_000);
    }

    @Override
    public double getBaseSalary() {
        return 150_000;
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
