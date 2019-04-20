package ua.kolom;

public class Sortirovka {
    public static int[] sort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int min = a[i];
            int min_pos = i;
            for (int j = i + 1; j < a.length; j++) {
                if (min < a[j]) {
                    min = a[j];
                    min_pos = j;
                }
            }
            if (min_pos != i) {
                a[i] = a[i] + a[min_pos];
                a[min_pos] = -a[min_pos] + a[i];
                a[i] = a[i] - a[min_pos];
            }
        }
        return a;
    }
}
