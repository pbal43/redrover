package hw.hw_13;

public class Worker extends Employee{
    @Override
    final public int getSalary() {
        return getBaseSalary();
    }
}
