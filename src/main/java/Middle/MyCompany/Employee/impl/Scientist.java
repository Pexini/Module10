package Middle.MyCompany.Employee.impl;

import Middle.MyCompany.Employee.BaseEmployee;
import Middle.MyCompany.Employee.EmplBonus;
import Middle.MyCompany.Employee.EmplSalary;
import Middle.MyCompany.Employee.TypeofEmployee;

public class Scientist extends BaseEmployee {


    public Scientist() {
        super(TypeofEmployee.Scientist, EmplSalary.SCIENTIST_SALARY, EmplBonus.SCIENTIST_BONUS);
    }

    @Override
    public double getBaseSalary() {
        return EmplSalary.SCIENTIST_SALARY.getSalary();
    }

    @Override
    public double getbonus() {
        return EmplBonus.SCIENTIST_BONUS.getBonus();
    }
    @Override
    public double getTotalSalary() {
        return super.getTotalSalary();
    }
}
