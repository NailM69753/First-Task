import java.util.Scanner;
import java.util.Random;

public class GuessGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int number = random.nextInt(10) + 1;
        int guess;

        System.out.println("I picked a number between 1 and 10. Try to guess it!");

        guess = scanner.nextInt();

        if (guess == number) {
            System.out.println("Congratulations! You guessed it right.");
        } else {
            System.out.println("Sorry, wrong guess. The number was: " + number);
        }

        scanner.close();
    }
}
