package Middle.MyCompany.Employee.impl;

import Middle.MyCompany.Employee.BaseEmployee;

public class Scientist extends BaseEmployee {
    private static final double SCIENTIST_BONUS = 70_000;

    public Scientist() {
        super(30_000);
    }


    @Override
    public double getBonus() {
        return SCIENTIST_BONUS;
    }

    @Override
    public double getTotalSalary() {
        return super.getTotalSalary();
    }
}
