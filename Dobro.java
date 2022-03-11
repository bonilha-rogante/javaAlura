import java.util.Scanner;

public class Dobro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);// pede para o usuário

        System.out.println("== Programa do Dobro ==");
        System.out.println("Digite um número: ");
        int n = input.nextInt();

        int x = dobro(n);
        System.out.println("O dobro é: " + x);

    }

    public static int dobro(int numero) {
        int d = numero * 2;
        return d;
    }
}