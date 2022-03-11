import java.util.Arrays;

public class BubbleSortB {
    public static void bubbleSortB(int[] v) {
        boolean troca = true;
        for (int i = 0; i < v.length && troca; i++) {
            troca = false;

            for (int j = 0; j < v.length - i - 1; j++) {
                if (v[j] > v[j + 1]) {
                    trocar(v, j, j + 1);
                    troca = true;
                }
            }
            System.out.printf("Passagem %d -> %s \n",
                    i, Arrays.toString(v));
        }
    }

    public static void trocar(int[] v, int a, int b) {
        int aux = v[a];
        v[a] = v[b];
        v[b] = aux;
    }

    public static void main(String[] args) {
        int[] v = { 13, 45, 38, 20, 23, 7, 6, 5, 10, 11 };
        System.out.printf("Início ->  %s \n",
                Arrays.toString(v));

        bubbleSortB(v);

        System.out.printf("Fim ->  %s \n",
                Arrays.toString(v));
    }

}
