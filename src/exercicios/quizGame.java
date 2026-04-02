package exercicios;

import java.util.Scanner;

public class quizGame {

    public static void main(String[] args) {
        String[] questions =  {"Quantos ossos, em média, tem o corpo humano?",
                               "Quantas calorias em media tem uma banana de 100g",
                               "Quanta copas do mundo a Argentina tem?",
                               "Em que ano foi fundado a BMW"};

        String[][] options = {{"1. 252 ossos", "2. 212 ossos", "3. 245 ossos", "4. 206 ossos", "5. 198 ossos"},
                              {"1. 89kcal", "2. 112kcal", "3. 60kcal", "4. 120kcal", "5. 70kcal"},
                              {"1. 2 copas", "2. 3 copas", "3. 5 copas", "4. 1 copa", "5. 2 copas"},
                              {"1. 1922", "2. 1914", "3. 1916", "4. 1920", "5. 1918"},
                              };


        int[] answers = {4, 1, 2, 3};
        int score = 0;
        int guess;

        Scanner scanner = new Scanner(System.in);

        System.out.println("*********************************");
        System.out.println("Bem vindo ao jogo de Quiz do Java");
        System.out.println("*********************************");

        for(int i=0; i< questions.length; i++){
            System.out.println(questions[i]);

            for(String option: options[i]){
                System.out.println(option);
            }

            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if(guess == answers[i]){
                System.out.println("🏆🏆🏆🏆 CORRECT!!!! 🏆🏆🏆🏆");
                score++;
            } else {
                System.out.println("❌❌❌❌ WRONG!!!! ❌❌❌❌");
            }
        }

        System.out.println("Your final score is: " +score);
        scanner.close();
    }
}
