package hw;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Collections;

public class Hw_6_1 {
    public static void main(String[] args) {

//        1

        System.out.println("===========1===========");

        int[] array1_1 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int sum1_1 = 0;
        for (int i = 0; i < array1_1.length; i++) {
            sum1_1 += array1_1[i];
        }
        System.out.println("Сумма элементов массива array1_1 = " + sum1_1);

//        или

        int[] array1_2 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int sum1_2 = Arrays.stream(array1_2).sum();
        System.out.println("Сумма элементов массива array1_2 = " + sum1_2);

//        или

        int[] array1_3 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int sum1_3 = 0;
        for (int element : array1_3) { // использовал цикл for each
            sum1_3 += element;
        }
        System.out.println("Сумма элементов массива array1_3 = " + sum1_3);

//        2

        System.out.println("===========2===========");

        int[] array2_1 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int maxima2_1 = array2_1[0];
        for (int i = 0; i < array2_1.length; i++) {
            if (maxima2_1 < array2_1[i]) {
                maxima2_1 = array2_1[i];
            }
        }
        System.out.println(maxima2_1);

//        или

        int[] array2_2 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        Arrays.sort(array2_2);
        ;
        System.out.println(array2_2[array2_2.length - 1]);

//        3

        System.out.println("===========3===========");

        int[] array3 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int minimum = array3[0];
        for (int i = 0; i < array3.length; i++) {
            if (minimum > array3[i]) {
                minimum = array3[i];
            }
        }
        System.out.println(minimum);

//        4

        System.out.println("===========4===========");

        int[] array4 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        double sr_arifm4;
        double sum_4 = 0;
        for (int i = 0; i < array4.length; i++) {
            sum_4 += array4[i];
        }
        sr_arifm4 = sum_4 / array4.length;
        System.out.println(sr_arifm4);

//    5

        System.out.println("===========5===========");

        int[][] array5 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int sum5 = 0;
        for (int i = 0; i < array5.length; i++) {
            for (int j = 0; j < array5[i].length; j++) {
                sum5 += array5[i][j];
            }
        }
        System.out.println(sum5);

//        6

        System.out.println("===========6===========");

        int[][] array6 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int max6 = Integer.MIN_VALUE;
        for (int i = 0; i < array6.length; i++) {
            for (int j = 0; j < array6[i].length; j++) {
                if (max6 < array6[i][j]) {
                    max6 = array6[i][j];
                }
            }
        }
        System.out.println(max6);

//        7

        System.out.println("===========7===========");

        int[][] array7 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int counter7_1 = array7.length;
        int counter7_2 = 0;
        for (int i = 0; i < array6.length; i++) {
            for (int j = 0; j < array6[i].length; j++) {
                counter7_2++;
            }
        }
        System.out.println("Количество элементов в массиве array7 = " + counter7_1);
        System.out.println("Количество всех элементов в массиве и во вложенных масиивах array7 = " + counter7_2);
    }
}