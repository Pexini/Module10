package Middle.MyCompany.Employee.impl;

import Middle.MyCompany.Employee.*;

public class Manager extends BaseEmployee {


    public Manager() {
        super(TypeofEmployee.Manager, EmplSalary.MANAGER_SALARY, EmplBonus.MANAGER_BONUS);
    }

    @Override
    public double getBaseSalary() {
        return EmplSalary.MANAGER_SALARY.getSalary();
    }

    @Override
    public double getbonus() {
        return EmplBonus.MANAGER_BONUS.getBonus();
    }
    @Override
    public double getTotalSalary() {
        return super.getTotalSalary();
    }
}
