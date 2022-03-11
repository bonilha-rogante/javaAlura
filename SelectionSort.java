import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int[] v) {
        for (int i = 0; i < v.length; i++) {
            int sindex = i;
            for (int j = i + 1; j < v.length; j++) {
                if (v[j] < v[sindex])
                    sindex = j;
            }
            trocar(v, i, sindex);
            System.out.printf("Iteração %d => %s\n",
                    i,

                    Arrays.toString(v));
        }
    }

    public static void trocar(int[] v, int a, int b) {
        int aux = v[a];
        v[a] = v[b];
        v[b] = aux;
    }

    public static void main(String[] args) {
        int[] v = { 36, 12, 29, 42, 10, 83 };
        System.out.printf("Início -> %s \n",
                Arrays.toString(v));
        selectionSort(v);
        System.out.printf("Fim -> %s \n",
                Arrays.toString(v));
    }

}
