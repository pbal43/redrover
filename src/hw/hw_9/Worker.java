package hw.hw_9;

public class Worker extends Employee {

    public Worker(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    double getSalary() {
        return (super.getSalary());
    }

}
