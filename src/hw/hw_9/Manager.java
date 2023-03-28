package hw.hw_9;


public class Manager extends Worker {

    public Manager (String name, double baseSalary, int NumberOfSubordinates) {
        super(name, baseSalary);
        this.NumberOfSubordinates = NumberOfSubordinates;
    }

    private int NumberOfSubordinates;

    public int getNumberOfSubordinates() {
        return NumberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        NumberOfSubordinates = numberOfSubordinates;
    }

    @Override
    double getSalary() {
        double nadbavka_manager = (NumberOfSubordinates / 100.0 * 3.0);
        if (nadbavka_manager == 0) {
            return super.getSalary();
        } else {
            return (super.getSalary() + (super.getSalary() * nadbavka_manager)); //  немного поправил
        }
    }

}
