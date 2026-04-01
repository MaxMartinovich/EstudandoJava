package exercicios;
import java.util.Scanner;

public class areaRetangulo {
    public static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a base do retangulo: ");
        double base = scanner.nextDouble();

        System.out.print("Digite a altura do retangulo: ");
        double altura = scanner.nextDouble();

        System.out.println("A área do triangulo é: " + altura * base );

        scanner.close();
    }
}
