package hw;

public class Hw_4 {
    public static void main(String[] args) {
//        1

        for (int i = 0; i < 16; i += 1) {
            System.out.println(i);
        }

//        2

        for (int i = 1; i < 10000; i += 1) {
            System.out.println("Степень числа 5 в итерации = " + i);
            int res = (int) Math.pow(5, i);
            System.out.println("Результат возведения числа 5 в степень = " + res);
        }

//        или

        int goal = 5;
        for (int i = 1; i < 10000; i += 1) {
            System.out.println("Степень числа 5 в итерации = " + i);
            if (i > 1) {
                goal *= 5;
            }
            System.out.println("Результат возведения числа 5 в степень = " + goal);
        }

//        или другое понимание задачи: результат возведения в степень дб меньше 10000

        for (int i = 5; i < 10000; i *= 5) {
            System.out.println(i);
        }

//        3

//        3.1

        for (int i = 40; i < 61; i = i + 1) {
            if (i % 4 == 0) {
                System.out.println("3 задача для 1 варианта " + i);
            }
        }

//        3. 2

        for (int i = 40; i < 61; i = i + 4) {
            System.out.println("3 задача для 2 варианта " + i);
        }
    }
}