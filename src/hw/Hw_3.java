package hw;

public class Hw_3 {
    public static void main(String[] args) {

//        1

        int a = 5;
        int b = 10;
        if (a == b) {
            System.out.println("a == b");
        } else if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        }

//      2

        int c = 12;
        int d = 47;
        if ((c + d) % 2 == 0) {
            System.out.println("maybe a and b are even");
        } else {
            System.out.println("some variable is odd");
        }

//      3

        int e = 500;
        if (e > 10) {
            System.out.println("e больше 10");
        }
        if (e < 100) {
            System.out.println("e меньше 100");
        }
        if ((e / 2) > 20) {
            System.out.println("результат деления e на 2 больше 20");
        }
        if (e >= 5 && e <= 40) {
            System.out.println("значение переменной e между 5 и 40 включительно");
        }
        if (!(e >= 5 && e <= 40)) {
            System.out.println("значение переменной меньше 5 или больше 40");
        }
//        или
        if (e < 5 || e > 40) {
            System.out.println("значение переменной меньше 5 или больше 40");
        }

    }
}
