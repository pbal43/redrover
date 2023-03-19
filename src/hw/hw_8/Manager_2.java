package hw.hw_8;

public class Manager_2 extends Worker_2{

    private int NumberOfSubordinates;

    public int getNumberOfSubordinates() {
        return NumberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        NumberOfSubordinates = numberOfSubordinates;
    }

    double getSalaryManager() {
        double nadbavka_manager = (NumberOfSubordinates / 100.0 * 3.0);
        if (nadbavka_manager == 0) {
            return getBaseSalary();
        } else {
            return (getBaseSalary() * nadbavka_manager);
        }
    }

}
