import java.util.Scanner;
public class mathClass {
    public static void main(String[] args) {
       // System.out.println(Math.PI);
        // /System.out.println(Math.E);

        double resultPow;
        double resultAbs;
        double resultSqrt;
        double resultRound;
        double resultCeil;
        double resultFloor;
        resultPow = Math.pow(2,6);
        System.out.println(resultPow);

        resultAbs = Math.abs(-5); // Transforma em positivo
        System.out.println(resultAbs);

        resultSqrt = Math.sqrt(144);
        System.out.println(resultSqrt);

        resultRound = Math.round(3.14); // Arredonda pro mais perto
        System.out.println(resultRound);

        resultCeil = Math.ceil(3.14); // Arredonda pra CIMA
        System.out.println(resultCeil);

        resultFloor = Math.floor(3.99); // Arredonda pra BAIXO
        System.out.println(resultFloor);


        //Hyptoneusa c = Math.sqrt(a² + b²)

        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double c;

        System.out.print("Enter the length of side A: ");
        a = scanner.nextDouble();

        System.out.print("Enter the length of side B: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println(c);
    }
}
