import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Random random = new Random();

        Scanner scanner = new Scanner(System.in);

            int guess;
            int attempts = 0;
            int randomNumber = random.nextInt(10) + 1; // 1 to 10

            System.out.println("--- WELCOME TO NUMBER GUESSING GAME ---");
            System.out.println("Guess a number between 1 and 10");

            do {
                System.out.print("Enter your guessed number: ");
                guess = scanner.nextInt();
                attempts++;

                if (guess > randomNumber) {
                    System.out.println("TOO HIGH! Try again...");
                } else if (guess < randomNumber) {
                    System.out.println("TOO LOW! Try again...");
                } else {
                    System.out.println(" CONGRATULATIONS! You guessed it!");
                    System.out.println("Attempts taken: " + attempts);
                }

            } while (guess != randomNumber);
        }
    }