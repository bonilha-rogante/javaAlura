import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("== Programa Triangulo ==");

        System.out.println("Informe a altura: ");
        double a = input.nextDouble();

        System.out.println("Informe a base: ");
        double b = input.nextDouble();

        double x = areaTriangulo(b, a);
        System.out.println("A área do triângulo é: " + x);

    }

    public static double areaTriangulo(double base, double altura) {
        double area = (base * altura) / 2;
        return area;
    }

}
