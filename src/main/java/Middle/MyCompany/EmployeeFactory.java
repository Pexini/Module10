package Middle.MyCompany;

import Middle.MyCompany.Employee.Employee;
import Middle.MyCompany.Employee.impl.*;

public class EmployeeFactory {
    public static Employee getEmployee(TypeofEmployee typeofEmployee) {
        switch (typeofEmployee) {
            case HR:
                return new HR();
            case Scientist:
                return new Scientist();
            case Engineer:
                return new Engineer();
            case Financial_Officer:
                return new Financial_Officer();
            case Cleaner:
                return new Cleaner();
            case Manager:
                return new Manager();
            default:
                throw new IllegalArgumentException("Неизвестный тип сотрудника: " + typeofEmployee);
        }

    }
}
