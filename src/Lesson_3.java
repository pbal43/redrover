public class Lesson_3 {
    public static void main(String[] args) {
        char a = '0' + 1;
        System.out.println(a);

        int b = 1;
        b = b + 1 + b + 2;
        int c = 2 + 1;
        System.out.println(b + c);

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

    }
}
