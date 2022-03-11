import java.util.Arrays;

public class QuickSort {

    public static void sort(int x[], int inicio, int fim) {
        if (inicio < fim) {
            int pivot = divide(x, inicio, fim);
            sort(x, inicio, pivot - 1);
            sort(x, pivot + 1, fim);
        }
    }

    public static int divide(int x[], int inicio, int fim) {
        int pivot = x[inicio];
        int postPivot = inicio;
        for (int i = inicio + 1; i <= fim; i++) {
            if (x[i] < pivot) {
                x[postPivot] = x[i];
                x[i] = x[postPivot + 1];
                postPivot++;
            }
        }
        x[postPivot] = pivot;
        return postPivot;

    }

    public static void main(String[] args) {
        int x[] = { 29, 10, 36, 18, 83, 42, 8, 20 };
        sort(x, 0, x.length - 1);
        System.out.printf("Ordenado: %s\n",
                Arrays.toString(x));
    }
}
