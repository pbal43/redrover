package hw.hw_8;

public class Manager {

    private String name;

    private int age;

    private String sex;

    private double daily_salary;

    private int count_employees;

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

    public int getCount_employees() {
        return count_employees;
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

    public void setCount_employees(int count_employees) {
        this.count_employees = count_employees;
    }

    double getSalary(int days) {
        return days * ((daily_salary) + (daily_salary / 100 * count_employees));
    }


}
