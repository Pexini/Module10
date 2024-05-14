package Middle.MyCompany.Employee.impl;

import Middle.MyCompany.Employee.BaseEmployee;
import Middle.MyCompany.Employee.EmplBonus;
import Middle.MyCompany.Employee.EmplSalary;
import Middle.MyCompany.Employee.TypeofEmployee;

public class Engineer extends BaseEmployee {


    public Engineer() {
        super(TypeofEmployee.Engineer, EmplSalary.ENGINEER_SALARY, EmplBonus.ENGINEER_BONUS);
    }

    @Override
    public double getBaseSalary() {
        return EmplSalary.ENGINEER_SALARY.getSalary();
    }

    @Override
    public double getbonus() {
        return EmplBonus.ENGINEER_BONUS.getBonus();
    }
    @Override
    public double getTotalSalary() {
        return super.getTotalSalary();
    }

}
