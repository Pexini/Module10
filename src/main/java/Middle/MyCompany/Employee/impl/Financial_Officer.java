package Middle.MyCompany.Employee.impl;

import Middle.MyCompany.Employee.BaseEmployee;

public class Financial_Officer extends BaseEmployee {
    private static final double FINANCIAL_OFFICER_BONUS = 0;

    public Financial_Officer() {
        super(150_000);
    }


    @Override
    public double getBonus() {
        return FINANCIAL_OFFICER_BONUS;
    }

    @Override
    public double getTotalSalary() {
        return super.getTotalSalary();
    }
}
