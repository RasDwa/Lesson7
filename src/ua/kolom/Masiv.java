package ua.kolom;

import java.util.Arrays;

import static ua.kolom.Sortirovka.sort;

public class Masiv {
    public static void main(String[] args) {
        int[][] a = {
                {3, 1, 2, 3, 4, 5, 6, 7},
                {4, 5, 8, 7, 12, 13, 14, 15},
                {8, 9, 10, 11, 5, 8, 14, 7},
                {12, 13, 14, 15, 0, 1, 2, 3},
                {5, 8, 14, 7, 9, 20, 8, 4}
        };
        for (int[] x : a) {
            System.out.println(Arrays.toString(x));
        }
        System.out.println();
        for (int[] x : a) {
            sort(x);
            System.out.println(Arrays.toString(x));
        }


    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {    // i - номер текущего шага
            int pos = i;
            int min = array[i];
            // цикл выбора наименьшего элемента
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    pos = j;    // pos - индекс наименьшего элемента
                    min = array[j];
                }
            }
            if (array[pos] != array[i]) {
                array[pos] = array[i];
                array[i] = min;    // меняем местами наименьший с array[i]
            }
        }
    }


}
