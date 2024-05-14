package Middle.MyCompany.Employee.impl;

import Middle.MyCompany.Employee.BaseEmployee;
import Middle.MyCompany.Employee.EmplBonus;
import Middle.MyCompany.Employee.EmplSalary;
import Middle.MyCompany.Employee.TypeofEmployee;

public class Financial_Officer extends BaseEmployee {

    public Financial_Officer() {
        super(TypeofEmployee.Financial_Officer, EmplSalary.ENGINEER_SALARY, EmplBonus.FINANCIAL_OFFICER_BONUS);
    }

    @Override
    public double getBaseSalary() {
        return EmplSalary.FINANCIAL_OFFICER_SALARY.getSalary();
    }

    @Override
    public double getbonus() {
        return EmplBonus.FINANCIAL_OFFICER_BONUS.getBonus();
    }
    @Override
    public double getTotalSalary() {
        return super.getTotalSalary();
    }
}
