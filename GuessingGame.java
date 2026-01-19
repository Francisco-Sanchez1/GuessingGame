//Goal is to ask for a input range from person and guess the number they are thinking.
//Iteration 1: Linerarly search for it.
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GuessingGame {
    public static void main(String [] args){
        //Goal is to ask for a input range from person and guess the number they are thinking.
        //Iteration 1 
        
        Game newGame = new Game();
        //When I make a new Game object there should be random number generated everytime: Check
        newGame.runGame();

        
        
    }
}

class Game {
    int randomNumber;
    int numGuesses = 0;
    

    public Game(){
            randomNumber = ThreadLocalRandom.current().nextInt(1,101);   
                
    }
    public void runGame () {
        Scanner scanner = new Scanner(System.in);

        // I can do a while loop basically until number is guess keep asking. I can turn the askForNumber

        //While loop easy: While guess doesn't equal random number keep running the program
        System.out.println("I've randomly selected a Number from 1-100.\n Please guess a number: ");
        int guess = scanner.nextInt();

        while (randomNumber != guess) {
            //Add +1 to the tries counter, compare guess to randomnumber, too low, too high, if it breaks while loop throw a if ststement correct
            if (guess < randomNumber && guess <= 100) {
                numGuesses++;
                System.out.println("Too LOW\n"+ "Number of tries: " + numGuesses+ "\nnext number: ");
                guess = scanner.nextInt();

            }
            else if (guess > randomNumber && guess <= 100) {
                numGuesses++;
                System.out.println("Too HIGH\n"+ "Number of tries: " + numGuesses+ "\nnext number: ");
                guess = scanner.nextInt();

            }
            else{
                System.out.println("Not valud input");
                
            }
        }
        if (randomNumber == guess){
            numGuesses++;
            System.out.println("Correct\n Number of Tries" + numGuesses);
        }
        scanner.close();

    }
}

