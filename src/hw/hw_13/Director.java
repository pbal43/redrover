package hw.hw_13;

final public class Director extends Employee{

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
}
