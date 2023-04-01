package org.example;

public class Director_2 extends Manager_2 {
    public Director_2() {
    }

    double getSalaryDirector() {
        double nadbavka_dirik = (double)this.getNumberOfSubordinates() / 100.0 * 9.0;
        System.out.println(nadbavka_dirik);
        return nadbavka_dirik == 0.0 ? this.getBaseSalary() : this.getBaseSalary() + (this.getBaseSalary() * nadbavka_dirik);
    }
}
