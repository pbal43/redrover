public class Lesson_3 {
    public static void main(String[] args) {
        char a = '0' + 1;
        System.out.println(a);

        int b = 1;
        b = b + 1 + b + 2;
        int c = 2 + 1;
        System.out.println(b + c);

//        if else

        if (1 == 2) {
            System.out.println("они равны");
        }

        if (a % 2 == 0) {
            System.out.println("a - четное");
        } else {
            System.out.println("a - нечетное");
            if (a == 9) {
                System.out.println("a == 9");
            } else {
                System.out.println("a != 9");
            }
        }

        if (a % 2 == 0) {
            System.out.println("a - четное");
        } else if (a == 9) {
                System.out.println("a == 9");
        } else if (a != 0) {
                System.out.println("a != 9");
        }

//      Операторы сравнения
//      a > b
//      a < b
//      a == b
//      a != b
//      a >= b
//      a <= b

        if (b < a) {
            System.out.println("b < a");
        }

//        Цикл for

//        иницилализация int i = 1
//        проверка i <- 5 - тут если условие тру - цикл выполняется
//        изменения переменной (шаг) в конце цикла

            for (int i = 1; i <= 5; i = i + 1){
                System.out.println(i);
                int q = 5;
        }

//        Если только ВНУТРИ цикла ИНИЦИАЛИЗИРОВАТЬ переменную или внутри IF, то ее не будет снаружи (закомментил ниже)
//        Или внутри блока кода - внути скобок {}

//        System.out.println(i);
//        System.out.println(q);

        if (1 > 2) {
            int i = 5;
        }

//        System.out.println(i);
//        Но если инициализирована раньше, то норм переприсвоит значение:
        int i = 5;
        if (1 < 2) {
            i = 10;
        }
        System.out.println(i);

        System.out.println( " true && false = " + ( true && false));
        System.out.println( " true && true  = " + ( true && true));
        System.out.println( "false && true  = " + (false && true));
        System.out.println( "false && false = " + (false && false));

        System.out.println("=========================================");
        System.out.println( "true  || true = " +  (true  || true));
        System.out.println( "true  || false = " + (true  || false));
        System.out.println( "false || true  = " + (false || true));
        System.out.println( "false || false = " + (false || false));

        System.out.println("=========================================");
        System.out.println( "!false = " + (!false));
        System.out.println( "!true = "  + (!true));

//        у И (&&) больший приоритет, чем у ИЛИ (||)

//  Лучше сравнивать числа с одинаковым типом

        if (1 == 1.0) {
            System.out.println("1 == 1.0");

        }

    }
}
