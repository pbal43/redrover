package hw.hw_13;

public abstract class BaseEmployee {

    private String name;
    private int age;
    private String sex;
    private int salaryPerDay;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public int getSalaryPerDay() {
        return salaryPerDay;
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

    public void setSalaryPerDay(int salaryPerDay) {
        this.salaryPerDay = salaryPerDay;
    }

    abstract int getSalary(MonthUtils.Month[] monthArray);
}
