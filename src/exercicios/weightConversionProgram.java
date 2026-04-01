package exercicios;
import java.util.Scanner;
public class weightConversionProgram {
    public static void main(String[] args) {
        double peso;
        double transform;


        Scanner scanner = new Scanner(System.in);
        System.out.print("Type your weight (IN KG): ");
        peso = scanner.nextDouble();

        transform = peso * 2.20462;

        System.out.println("Seu peso em libras é: " + transform);

        scanner.close();
    }
}
