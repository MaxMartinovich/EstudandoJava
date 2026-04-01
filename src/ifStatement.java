import java.util.Scanner;

public class ifStatement {
    public static void main(String[] args) {
        int age;

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your age?: ");
        age = scanner.nextInt();

        if(age >= 65){
            System.out.println("You are a Senior!");
        } else if(age <= 0) {
            System.out.println("It´s impossible!");
        } else if(age >=18 ){
            System.out.println("You are an adult!");
        }
        else {
            System.out.println("You are a child");
        }
    }
}
