package hw.hw_8;

public class Employee {

    private String name;

    private int age;

    private String sex;

    private double daily_salary;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public double getDaily_salary() {
        return daily_salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setDaily_salary(double daily_salary) {
        this.daily_salary = daily_salary;
    }

    double getSalary(int days) {
        return (daily_salary * days);
    }

}
