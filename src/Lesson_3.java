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
        }

//      Операторы сравнения
//      a > b
//      a < b
//      a == b
//      a != b
//      a >= b
//      a <= b

        if (b < a) {
            System.out.println("a - четное");
        }

//        Цикл for

//        иницилализация int i = 1
//        проверка i <- 5 - тут если условие тру - цикл выполняется
//        изменения переменной (шаг) в конце цикла

            for (int i = 1; i <= 5; i = i + 1){
                System.out.println(i);
                int q = 5;
        }

//            если только ВНУТРИ цикла есть переменная, то ее не будет снаружи

        System.out.println(i);
        System.out.println(q);

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

    }
}
