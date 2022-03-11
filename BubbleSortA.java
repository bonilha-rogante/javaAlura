import java.util.Arrays;

public class BubbleSortA {
    public static void bubbleSortA(int[] v) {
        boolean troca = true;
        for (int i = 0; i < v.length && troca; i++) {
            troca = false;

            for (int j = 0; j < v.length - i - 1; j++) {
                if (v[j] > v[j + 1]) {
                    trocar(v, j, j + 1);
                    troca = true;
                }
            }
            System.out.printf("Passagem %d -> %s \n", i, Arrays.toString(v));
        }

    }

    public static void trocar(int[] v, int a, int b) {
        int aux = v[a];
        v[a] = v[b];
        v[b] = aux;
    }

    public static void main(String[] args) {
        int[] v = { 36, 15, 75, 2, 16, 48, 51 };
        System.out.printf("Início ->  %s \n",
                Arrays.toString(v));

        bubbleSortA(v);

        System.out.printf("Fim ->  %s \n",
                Arrays.toString(v));
    }

}