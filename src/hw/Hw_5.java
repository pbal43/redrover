package hw;

public class Hw_5 {
    public static void main(String[] args) {

//        1

//        int rows_1 = 10;
//        int columns_1 = 10;
//        for (int i = 0; i < rows_1; i++) {
//            for (int j = 0; j < columns_1; j++) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//            columns_1--;
//        }
//
//        System.out.println("===================================");

//        2

        String space = " ";
        int spaces = 2;
        int rows = 10;
        int columns = 10;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(j + space);
            }
            System.out.print("\n" + space.repeat(spaces));
            spaces+=2;
            columns--;
        }

//        String space = " ";
//        int spaces = 1;
//        int rows = 10;
//        int columns = 10;
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < columns; j++) {
//                System.out.print(j + " ");
//            }
//            System.out.print("\n" + space.repeat(spaces));
//            spaces++;
//            columns--;
//        }

    }
}
