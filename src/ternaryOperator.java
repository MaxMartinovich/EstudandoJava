import java.util.Scanner;
public class ternaryOperator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double score;
        System.out.print("Type your score: ");
        score = scanner.nextDouble();

        String passOrFail = (score >= 60) ? "PASS" : "FAIL";

        System.out.println(passOrFail);

        scanner.close();

        int number = 3;

        String evenOrOdd = (number % 2 == 0 )? "EVEN" : "ODD";

        System.out.println(evenOrOdd);
    }
}
