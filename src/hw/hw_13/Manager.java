package hw.hw_13;

final public class Manager extends Employee{

    private int NumberOfSubordinates;

    public int getNumberOfSubordinates() {
        return NumberOfSubordinates;
    }

    final private int manager_index = 3;

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        NumberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public int getSalary() {
        int nadbavka_manager = (NumberOfSubordinates / 100 * manager_index);
        if (nadbavka_manager == 0) {
            return getBaseSalary();
        } else {
            return (getBaseSalary() + (getBaseSalary() * nadbavka_manager));
        }
    }
}


