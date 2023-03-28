package hw.hw_9;

public class Employee {

    public Employee(String name, double baseSalary) { // добавил кокнструктор класса
        this.name = name;
        this.baseSalary = baseSalary;
    }

    private String name;

    private double baseSalary;

    public String getName() {
        return name;
    }

    double getSalary() {
        return baseSalary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

}
