package hw;

public class Hw_5 {
    public static void main(String[] args) {

//        1

        System.out.println("==================1=================");

        int rows_1 = 10;
        int columns_1 = 10;
        for (int i = 0; i < rows_1; i++) {
            for (int j = 0; j < columns_1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
            columns_1--;
        }

//        2

        System.out.println("==================2=================");

        String space_2 = " ";
        int spaces_2 = 2;
        int rows_2 = 10;
        int columns_2 = 10;
        for (int i = 0; i < rows_2; i++) {
            for (int j = 0; j < columns_2; j++) {
                System.out.print(j + space_2);
            }
            System.out.print("\n" + space_2.repeat(spaces_2));
            spaces_2+=2;
            columns_2--;
        }

//        3
        System.out.println();
        System.out.println("=================3==================");

        String space_3 = " ";
        int spaces_3 = 2;
        int rows_3 = 10;
        int min_columns = -9;
        int columns_3 = 10;
        for (int i = 0; i < rows_3; i++) {
            for (int j = min_columns; j < columns_3; j++) {
                System.out.print(Math.abs(j) + " ");
            }
            System.out.print("\n" + space_3.repeat(spaces_3));
            spaces_3+=2;
            columns_3--;
            min_columns++;
        }

    }
}
