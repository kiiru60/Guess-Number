import java.util.Random;
import java.util.Scanner;

/**
 * Play the number guessing game
 *
 * @author Alex Kiiru
 * @version Sept 19, 2018
 */
public class GuessTheNumber
{
    public static void main(String [] args){
        Random generator = new Random();
        
        int secretNumber = generator.nextInt(100) + 1;
        
        int turns = 1;
        
        System.out.println("I have a secret number between 1 and 100.");
        System.out.println("What's your guess?");
        
        Scanner keybd = new Scanner(System.in);
        int guess = keybd.nextInt();
        
        System.out.println("The secret number is: " + secretNumber);
        System.out.println("Your guess is: " + guess);
        
        while (guess != secretNumber && turns <= 7){
            provideFeedBack(guess,secretNumber);
            System.out.println("you`ve taken  "  +  turns +" turns,");
            if (guess!=secretNumber){
                System.out.println("Guess again Idiot!:");
                guess=keybd.nextInt();
                turns++;
            }
            if (guess != secretNumber && turns <= 7) {
                System.out.println("Guess again Idiot!:");
                turns++;
            }
        }
        
        if (guess == secretNumber){
            System.out.println("That's correct!");
            System.out.println("You took "+  turns   + " turns.");
        } else {
            System.out.println("Sorry, you are soo dumb the secretNumber " + 
                secretNumber);
            System.out.println("please play again soon");
        }
    }  
    //myGuess and the secretNumber are parameters for the metheod definition.
    private static void provideFeedBack(int myGuess , int theSecret){
        if (myGuess > theSecret){
                System.out.println("Sorry the guess was too high");
        } else {
                System.out.println("Sorry the guess was too low");
        }
    }
}

