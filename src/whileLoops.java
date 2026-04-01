import java.util.Scanner;

public class whileLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = 0;

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        while(age<0){
            System.out.println("You age can´t be negative");
            System.out.print("Enter your age: ");
            age = scanner.nextInt();
        }

        System.out.println("You are " + age + " years old");

        scanner.close();
    }
}
