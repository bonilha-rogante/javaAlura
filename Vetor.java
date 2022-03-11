import java.util.Scanner;

public class Vetor {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Qual o tamanho do vetor? ");
        int qtd = input.nextInt();
        input.nextLine();

        String[] items = carregarVetorTexto(qtd);
        exibirVetorTexto(items);

        int busca = buscarTexto(items, "java");
        System.out.println("A busca retornou: " + busca);

        /*
         * int[] items = carregarVetor(qtd);
         * 
         * int busca = buscar(items, 4);
         * System.out.println("A busca retornou: " + busca);
         * 
         * int soma = somarValores(items);
         * System.out.println("A soma do vetor é: " + soma);
         * 
         * int maior = maiorValor(items);
         * System.out.println("O maior valor é " + maior);
         * 
         * System.out.println("O vetor foi carregado com : ");
         * // for(int i = 0; i < qtd; i++){
         * // System.out.print(items[i] + ", "); Mostra os números que o usuário
         * determinou
         * no
         * // vetor.
         * exibirVetor(items);
         */
    }

    public static int buscarTexto(String[] items, String valor) {
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals(valor))
                return i;
        }
        return -1;
    }

    public static int buscar(int[] items, int valor) {
        for (int i = 0; i < items.length; i++) {
            // int x = vetor[i];
            if (items[i] == valor)
                return i;
        }
        return -1;
    }

    public static int somarValores(int[] vetor) {
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            int x = vetor[i];
            soma = soma + x;

        }
        return soma;
    }

    public static int maiorValor(int[] items) {

        int maior = Integer.MIN_VALUE;

        for (int i = 0; i < items.length; i++) {
            int item = items[i];
            if (item > maior)
                maior = item;
        }

        return maior; // erro!
    }

    public static String[] carregarVetorTexto(int qtd) {

        String[] items = new String[qtd];

        for (int i = 0; i < qtd; i++) {
            System.out.println("Informe um valor: ");
            items[i] = input.nextLine();
        }
        return items;

    }

    public static int[] carregarVetor(int qtd) {

        int[] items = new int[qtd];

        for (int i = 0; i < qtd; i++) {
            System.out.println("Informe um valor: ");
            items[i] = input.nextInt();
        }
        return items;

    }

    public static void exibirVetor(int[] items) {
        for (int i = 0; i < items.length; i++) {
            System.out.print(items[i] + ", ");
        }
    }

    public static void exibirVetorTexto(String[] items) {
        for (int i = 0; i < items.length; i++) {
            System.out.println(i + ". " + items[i]);
        }
    }

    // int []x = new int {5, 3, 4, 6, 9} -> determinando cada elemento do vetor
    // int[] x = new int[4]; // determinando apenas o tamanho do array
    // x[0] = 2;
    // x[1] = 5;
    // x[2] = 0;
    // x[3] = 10;
    // int c = x[x.length - 1]; // mostra o último elemento do array;

}
