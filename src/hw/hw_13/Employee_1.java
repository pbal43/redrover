package hw.hw_13;

public final class Employee_1 extends BaseEmployee{


    @Override
    int getSalary(MonthUtils.Month[] monthArray) {
        int days_count = 0;
        for (int i = 0; i < monthArray.length; i++) {
            days_count += monthArray[i].getDays();
        }
        return (days_count * getSalaryPerDay());
    }
}
