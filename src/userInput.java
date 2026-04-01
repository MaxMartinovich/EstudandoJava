import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("What is your gpa: ");
        double gpa = scanner.nextDouble();


        System.out.println("Ola! " + name + " Você tem " + age + " anos" +" e seu gpa é: " + gpa);
        scanner.close();
    }
}
