import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        String[] choices = {"rock", "paper", "scissors"};
        
        System.out.println("Welcome to Rock Paper Scissors!");
        System.out.println("Enter your choice (rock, paper, or scissors):");
        String playerChoice = input.nextLine();
        
        int computerChoiceIndex = rand.nextInt(3);
        String computerChoice = choices[computerChoiceIndex];
        
        System.out.println("You chose " + playerChoice);
        System.out.println("Computer chose " + computerChoice);
        
        if (playerChoice.equals(computerChoice)) {
            System.out.println("It's a tie!");
        } else if (playerChoice.equals("rock") && computerChoice.equals("scissors")
                || playerChoice.equals("paper") && computerChoice.equals("rock")
                || playerChoice.equals("scissors") && computerChoice.equals("paper")) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }
    }
}
