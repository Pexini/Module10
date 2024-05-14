package Middle.MyCompany.Employee;

public enum EmplSalary {
    MANAGER_SALARY(60_000),
    CLEANER_SALARY(25_000),
    FINANCIAL_OFFICER_SALARY(150_000),
    HR_SALARY(70_000),
    ENGINEER_SALARY(150_000),
    SCIENTIST_SALARY(70_000);

    private final int salary;

    EmplSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

}

