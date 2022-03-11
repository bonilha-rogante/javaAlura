import java.util.Arrays;

public class MergeSort {

    public static void sort(int x[], int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            sort(x, inicio, meio);
            sort(x, meio + 1, fim);
            merge(x, inicio, meio, fim);
            System.out.printf("Passo recursivo: %s\n",
                    Arrays.toString(x));
        }
    }

    private static void merge(int x[], int inicio, int meio, int fim) {
        int i, esquerda, direita;
        int aux[] = new int[x.length];

        for (i = inicio; i <= fim; i++)
            aux[i] = x[i];

        esquerda = inicio;
        direita = meio + 1;
        i = inicio;

        while (esquerda <= meio && direita <= fim) {
            if (aux[esquerda] <= aux[direita])
                x[i++] = aux[esquerda++];
            else
                x[i++] = aux[direita++];

        }

        while (esquerda <= meio)
            x[i++] = aux[esquerda++];
    }

    public static void main(String[] args) {
        int x[] = { 31, 10, 29, 42, 51, 19, 83, 7 };
        sort(x, 0, x.length - 1);

        System.out.printf("Orgenado: %s\n",
                Arrays.toString(x));
    }
}
