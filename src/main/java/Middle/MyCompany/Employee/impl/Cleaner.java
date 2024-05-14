package Middle.MyCompany.Employee.impl;

import Middle.MyCompany.Employee.BaseEmployee;
import Middle.MyCompany.Employee.EmplBonus;
import Middle.MyCompany.Employee.EmplSalary;
import Middle.MyCompany.Employee.TypeofEmployee;

public class Cleaner extends BaseEmployee {


    public Cleaner() {
        super(TypeofEmployee.Cleaner, EmplSalary.CLEANER_SALARY, EmplBonus.CLEANER_BONUS);
    }

    @Override
    public double getBaseSalary() {
        return EmplSalary.CLEANER_SALARY.getSalary();
    }

    @Override
    public double getbonus() {
        return EmplBonus.CLEANER_BONUS.getBonus(); }

    @Override
    public double getTotalSalary() {
        return super.getTotalSalary();
    }
}
