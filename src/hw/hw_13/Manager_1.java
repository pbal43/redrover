package hw.hw_13;

public final class Manager_1  extends BaseEmployee{

    private int number_of_sub;

    public int getNumber_of_sub() {
        return number_of_sub;
    }

    public void setNumber_of_sub(int number_of_sub) {
        this.number_of_sub = number_of_sub;
    }


    public Manager_1(String name, int salary_per_day,int number_of_sub) {
        this.setName(name);
        this.setSalaryPerDay(salary_per_day);
        this.number_of_sub = number_of_sub;
    }

    @Override
    int getSalary(MonthUtils.Month[] monthArray) {
        int days_count = 0;
        for (int i = 0; i < monthArray.length; i++) {
            days_count += monthArray[i].getDays();
        }
        int salary = days_count * getSalaryPerDay();
        return salary + (salary / 100) * number_of_sub;
    }
}
