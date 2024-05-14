package Middle.MyCompany.Employee;

public abstract class BaseEmployee implements Employee {
    private TypeofEmployee typeofEmployee;
    private EmplBonus bonus;
    private EmplSalary baseSalary;


    public BaseEmployee(TypeofEmployee typeofEmployee, EmplSalary baseSalary, EmplBonus bonus) {
        this.baseSalary = baseSalary;
        this.bonus = bonus;
        this.typeofEmployee = typeofEmployee;
    }


    @Override
    public double getTotalSalary() {
        double total = getBaseSalary() + bonus.getBonus();
        return total;
    }

}
