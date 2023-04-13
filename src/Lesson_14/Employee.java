package Lesson_14;

abstract public class Employee implements inter {

    private int baseSalary;

    private String name;

    private int salary;

    public int getBaseSalary() {
        return baseSalary;
    }

    public String getName() {
        return name;
    }

    abstract public int getSalary();

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
