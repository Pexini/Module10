package Middle.MyCompany;

import Middle.MyCompany.Employee.*;
import Middle.MyCompany.Employee.impl.*;

public class EmployeeFactory {
    static Employee getEmployee(TypeofEmployee typeofEmployee) {
        EmplBonus bonus;
        EmplSalary baseSalary;
        switch (typeofEmployee) {
            case HR:
                bonus = EmplBonus.HR_BONUS;
                baseSalary = EmplSalary.HR_SALARY;
                return new HR();
            case Scientist:
                bonus = EmplBonus.SCIENTIST_BONUS;
                baseSalary = EmplSalary.SCIENTIST_SALARY;
                return new Scientist ();
            case Financial_Officer:
                bonus = EmplBonus.FINANCIAL_OFFICER_BONUS;
                baseSalary = EmplSalary.FINANCIAL_OFFICER_SALARY;
                return new Financial_Officer ();
            case Cleaner:
                bonus = EmplBonus.CLEANER_BONUS;
                baseSalary = EmplSalary.CLEANER_SALARY;
                return new Cleaner();
            case Manager:
                bonus = EmplBonus.MANAGER_BONUS;
                baseSalary = EmplSalary.MANAGER_SALARY;
                return new Manager();
            case Engineer:
                bonus = EmplBonus.ENGINEER_BONUS;
                baseSalary = EmplSalary.ENGINEER_SALARY;
                return new Engineer ();
            default:
                throw new IllegalArgumentException("Неизвестный тип сотрудника: " + typeofEmployee);
        }
    }
}

