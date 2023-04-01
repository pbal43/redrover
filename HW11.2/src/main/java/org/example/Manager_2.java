package org.example;

public class Manager_2 extends Worker_2 {
    private int NumberOfSubordinates;

    public Manager_2() {
    }

    public int getNumberOfSubordinates() {
        return this.NumberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.NumberOfSubordinates = numberOfSubordinates;
    }

    public double getSalaryManager() {
        double nadbavka_manager = (double)this.NumberOfSubordinates / 100.0 * 3.0;
        return nadbavka_manager == 0.0 ? this.getBaseSalary() :  this.getBaseSalary() + (this.getBaseSalary() * nadbavka_manager);
    }
}
