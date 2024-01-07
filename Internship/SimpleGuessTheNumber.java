import java.util.Scanner;
import java.util.Random;

public class SimpleGuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int maxAttempts = 10;

        do {
            int targetNumber = random.nextInt(100) + 1;
            int attempts = 0;
            System.out.println("Welcome to the Number Guessing game\n");
            System.out.println("Can you guess the number between 1 to 100");

            while (attempts < maxAttempts) {
                System.out.print("Your guess: ");
                int userGuess = scanner.nextInt();

                if (userGuess == targetNumber) {
                    System.out.println("Congratulations! You guessed it right in " + attempts + " attempts.\n");
                    break;
                } else {
                    System.out.println(userGuess < targetNumber ? "Too low!" : "Too high!");
                    System.out.println("Attempts left: " + (maxAttempts - attempts));
                }

                attempts++;
            }

            if (attempts == maxAttempts) {
                System.out.println(" you've run out of attempts. The correct number was " + targetNumber + "\n");
            }

            System.out.print("Do you want to play again? (yes/no): ");
        } while (scanner.next().equalsIgnoreCase("yes"));

        System.out.println("Thanks for playing!");

        scanner.close();
    }
}
