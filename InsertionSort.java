import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int[] v) {
        for (int i = 1; i < v.length; i++) {
            int x = v[i];
            for (int j = i - 1; j >= 0 && v[j] > x; j--) {
                v[j + 1] = v[j];
                v[j] = x;
            }
            System.out.printf("Iteração no nro %d -> %s \n",
                    x, Arrays.toString(v));
        }

    }

    public static void main(String[] args) {
        int[] v = { 36, 12, 29, 42, 10, 83 };
        System.out.printf("Início -> %s \n",
                Arrays.toString(v));
        insertionSort(v);
        System.out.printf("Fim -> %s \n",
                Arrays.toString(v));
    }

}
