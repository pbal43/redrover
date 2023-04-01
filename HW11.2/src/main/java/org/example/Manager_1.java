package org.example;

public class Manager_1 extends Employee_1 {
    private int count_employees;

    public Manager_1() {
    }

    public int getCount_employees() {
        return this.count_employees;
    }

    public void setCount_employees(int count_employees) {
        this.count_employees = count_employees;
    }

    double getSalary(int days) {
        return (double)days * (this.getDaily_salary() + this.getDaily_salary() / 100.0 * (double)this.count_employees);
    }
}