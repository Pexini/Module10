package Middle.MyCompany;

import Middle.MyCompany.Employee.EmplBonus;
import Middle.MyCompany.Employee.Employee;
import Middle.MyCompany.Employee.impl.HR;

import java.text.DecimalFormat;

import static Middle.MyCompany.Employee.TypeofEmployee.*;
import static Middle.MyCompany.EmployeeFactory.getEmployee;


public class Main {
    public static void main(String[] args) {
        Employee hr = getEmployee(HR);
        Employee manager = getEmployee(Manager);
        Employee scientist = getEmployee(Scientist);
        Employee engineer = getEmployee(Engineer);
        Employee financial = getEmployee(Financial_Officer);
        Employee cleaner = getEmployee(Cleaner);


        System.out.println("HR зарплата: ");
        getEmployeeInfo(hr);
        System.out.println("Manager зарплата: ");
        getEmployeeInfo(manager);
        System.out.println("Scientist зарплата: ");
        getEmployeeInfo(scientist);
        System.out.println("Engineer зарплата: ");
        getEmployeeInfo(engineer);
        System.out.println("Financial_Officer зарплата: ");
        getEmployeeInfo(financial);
        System.out.println("Cleaner зарплата: ");
        getEmployeeInfo(cleaner);


    }

    private static void getEmployeeInfo(Employee employee) {
        System.out.println("Зарплата за месяц " + new DecimalFormat("#,###,###,##0.00").format(employee.getBaseSalary()));
        System.out.println("Бонусы за месяц " + new DecimalFormat("#,###,###,##0.00").format(employee.getbonus()));
        System.out.println("Итого за месяц " + new DecimalFormat("#,###,###,##0.00").format(employee.getTotalSalary()));
        System.out.println();

    }


}
