package hw.hw_13;

import java.util.Arrays;

public class Hw_13 {

    public static void main(String[] args) {

        MonthUtils.Month[] arr = MonthUtils.quartaRet(4);
        System.out.println(Arrays.deepToString(arr));

        MonthUtils.Month [] arr_1 = MonthUtils.halfyearRet(2);
        System.out.println(arr_1[5].getMonthName());

        MonthUtils.Month [] arr_2 = MonthUtils.yearRet();
        System.out.println(Arrays.deepToString(arr_2));

        MonthUtils.Month [] arr_3 = MonthUtils.halfyearRet(2);

        Manager_1 manager = new Manager_1("PAvlik", 150, 10);

        System.out.println(manager.getSalary(arr_3));


    }

}
