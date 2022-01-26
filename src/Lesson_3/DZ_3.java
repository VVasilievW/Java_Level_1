package Lesson_3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DZ_3 {
    public static void main(String[] args) {
        invertMass();
        createArray100();
    }

    //1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    // С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static void invertMass() {
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1};
        System.out.println("1)\n" + Arrays.toString(arr1));
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 0) arr1[i] = 1;
            else arr1[i] = 0;
        }
        System.out.println(Arrays.toString(arr1));

    }
    //2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;

    public static void createArray100() {
        int [] arr2 = new int[100];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i +1;
        }
        System.out.println("2)\n" + Arrays.toString(arr2));

    }
}
