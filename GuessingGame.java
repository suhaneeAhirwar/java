
    import java.util. Random;

public class GuessingGame {
    public static void main(String[] args) {
          Random random = new Random();
        
        // Generate random numbers for both players
        int playerAGuess = random.nextInt(100)+1;  // Player A's guess (1-100)
        int playerBGuess =  random.nextInt(100)+1;  // Player B's guess (1-100)
        
        // Display the guesses
        System.out.println("Player A guessed: " + playerAGuess);
        System.out.println("Player B guessed: " + playerBGuess);
        
        // Determine and declare the winner
        if (playerAGuess > playerBGuess) {
            System.out.println("Player A wins!");
        } else if (playerBGuess > playerAGuess) {
            System.out.println("Player B wins!");
        } else {
            System.out.println("It's a tie!");
        }
    }
}

