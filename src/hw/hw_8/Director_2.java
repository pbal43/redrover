package hw.hw_8;

public class Director_2 extends Manager_2{

    double getSalaryDirector() {
        double nadbavka_dirik = ((getNumberOfSubordinates() / 100.0) * 9.0);
        System.out.println(nadbavka_dirik);
        if (nadbavka_dirik == 0.0) {
            return (getBaseSalary());
        }
        else {
            return (getBaseSalary() * nadbavka_dirik);
        }
    }

}
