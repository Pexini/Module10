package Middle.MyCompany.Employee;

public enum EmplBonus {
    MANAGER_BONUS(10_000),
    CLEANER_BONUS(5_000),
    FINANCIAL_OFFICER_BONUS(0),
    HR_BONUS(30_000),
    ENGINEER_BONUS(50_000),
    SCIENTIST_BONUS(70_000);

    private final int bonus;

    EmplBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

}
