package Middle.MyCompany.Employee.impl;

import Middle.MyCompany.Employee.BaseEmployee;

public class Engineer extends BaseEmployee {
    private static final double ENGINEER_BONUS = 50_000;

    public Engineer() {
        super(50_000);
    }


    @Override
    public double getBonus() {
        return ENGINEER_BONUS;
    }

    @Override
    public double getTotalSalary() {
        return super.getTotalSalary();
    }
}
