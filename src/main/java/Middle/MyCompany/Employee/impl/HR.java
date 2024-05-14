package Middle.MyCompany.Employee.impl;

import Middle.MyCompany.Employee.BaseEmployee;
import Middle.MyCompany.Employee.EmplBonus;
import Middle.MyCompany.Employee.EmplSalary;
import Middle.MyCompany.Employee.TypeofEmployee;

public class HR extends BaseEmployee {

    public HR() {
        super(TypeofEmployee.HR, EmplSalary.HR_SALARY, EmplBonus.HR_BONUS);
    }

    @Override
    public double getBaseSalary() {
        return EmplSalary.HR_SALARY.getSalary();
    }

    @Override
    public double getbonus() {
        return EmplBonus.HR_BONUS.getBonus();
    }
    @Override
    public double getTotalSalary() {
        return super.getTotalSalary();
    }
}
