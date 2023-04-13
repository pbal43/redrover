package Lesson_14;

import hw.hw_13.Employee;

final public class Director extends Employee implements inter, Diet {

    private String diet;

    private int NumberOfSubordinates;

    public int getNumberOfSubordinates() {
        return NumberOfSubordinates;
    }

    final private int director_index = 9;

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        NumberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public int getSalary() {
        int nadbavka_manager = (NumberOfSubordinates / 100 * director_index);
        if (nadbavka_manager == 0) {
            return getBaseSalary();
        } else {
            return (getBaseSalary() + (getBaseSalary() * nadbavka_manager));
        }
    }

    public Director(String name, String diet) {
        this.setName(name);
        this.diet = diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    @Override
    public String getDiet() {
        return diet;
    }
}
