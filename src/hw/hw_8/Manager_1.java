package hw.hw_8;

public class Manager_1 extends Employee_1 {

    private int count_employees;

    public int getCount_employees() {
        return count_employees;
    }

    public void setCount_employees(int count_employees) {
        this.count_employees = count_employees;
    }

    double getSalary(int days) {
        return days * ((getDaily_salary()) + (getDaily_salary() / 100.0 * count_employees));
    }


}
