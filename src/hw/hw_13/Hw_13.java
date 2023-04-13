package hw.hw_13;

import java.util.Arrays;

public class Hw_13 {

    public static void main(String[] args) {

        Month [] arr = MonthUtils.quartaRet(4);
        System.out.println(Arrays.deepToString(arr));

        Month [] arr_1 = MonthUtils.halfyearRet(2);
        System.out.println(arr_1[5].getMonthName());

        Month [] arr_2 = MonthUtils.yearRet();
        System.out.println(Arrays.deepToString(arr_2));

    }

}
