import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        playRockPaperScissors();
    }

    public static void playRockPaperScissors() {
        String[] choices = {"Rock", "Paper", "Scissors"};
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to Rock, Paper, Scissors!");

        while (true) {
            System.out.print("Enter your move (Rock, Paper, or Scissors) or 'exit' to end: ");
            String userChoice = scanner.nextLine();

            if (userChoice.equalsIgnoreCase("exit")) {
                System.out.println("Game over. Thanks for playing!");
                break;
            }

            if (!isValidChoice(userChoice)) {
                System.out.println("Invalid choice. Please enter Rock, Paper, or Scissors.");
                continue;
            }

            int computerIndex = random.nextInt(choices.length);
            String computerChoice = choices[computerIndex];

            System.out.println("Computer chose: " + computerChoice);

            determineWinner(userChoice, computerChoice);
        }

        scanner.close();
    }

    public static boolean isValidChoice(String choice) {
        return choice.equalsIgnoreCase("Rock") ||
               choice.equalsIgnoreCase("Paper") ||
               choice.equalsIgnoreCase("Scissors");
    }

    public static void determineWinner(String userChoice, String computerChoice) {
        if (userChoice.equalsIgnoreCase(computerChoice)) {
            System.out.println("It's a tie!");
        } else if (
                (userChoice.equalsIgnoreCase("Rock") && computerChoice.equalsIgnoreCase("Scissors")) ||
                (userChoice.equalsIgnoreCase("Paper") && computerChoice.equalsIgnoreCase("Rock")) ||
                (userChoice.equalsIgnoreCase("Scissors") && computerChoice.equalsIgnoreCase("Paper"))
        ) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }
    }
}
