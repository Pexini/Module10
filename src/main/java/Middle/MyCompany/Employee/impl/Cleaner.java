package Middle.MyCompany.Employee.impl;

import Middle.MyCompany.Employee.BaseEmployee;

public class Cleaner extends BaseEmployee {
    private static final double CLEANER_BONUS = 5_000;

    public Cleaner() {
        super(30_000);
    }


    @Override
    public double getBonus() {
        return CLEANER_BONUS;
    }

    @Override
    public double getTotalSalary() {
        return super.getTotalSalary();
    }
}
