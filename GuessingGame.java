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
    int[] guessHistory = new int[100];// Array called guessHistory that has space for a 100 integers
    int index = 0;


    public Game(){
            randomNumber = ThreadLocalRandom.current().nextInt(1,101);   
                
    }
    public void runGame () {
        Scanner scanner = new Scanner(System.in);

        // I can do a while loop basically until number is guess keep asking. I can turn the askForNumber

        //While loop easy: While guess doesn't equal random number keep running the program
        System.out.print("I've randomly selected a Number from 1-100.\n Please guess a number: ");
        int guessedNumber = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i <= guessHistory.length; i++){
            //Add +1 to the tries counter, compare guess to randomnumber, too low, too high, if it breaks while loop throw a if ststement correct
                if (guessedNumber < randomNumber && guessedNumber <= 100 && guessedNumber > 0) {
                    guessHistory[i] = guessedNumber;
                    numGuesses++;
                    System.out.print("Too LOW\n"+ "Number of tries: " + numGuesses + "\nnext number: ");
                    guessedNumber = scanner.nextInt();
                }
                else if (guessedNumber > randomNumber && guessedNumber <= 100 && guessedNumber > 0) {
                    guessHistory[i] = guessedNumber;
                    numGuesses++;
                    System.out.print("Too HIGH\n"+ "Number of tries: " + numGuesses + "\nnext number: ");
                    guessedNumber = scanner.nextInt();

                }
                else if (randomNumber == guessedNumber){
                    numGuesses++;
                    guessHistory[i] = guessedNumber;
                    break;
            
                }
                else{
                    i--;
                    System.out.print("Try Again only 1-100: ");
                    guessedNumber = scanner.nextInt();
                    
                }
            }

            for (int i = 0; i < guessHistory.length; i++) {
                if (guessHistory[i] == 0){
                    break;
                }
                else {
                System.out.println(guessHistory[i]);
                }
            }
        
        
    
        scanner.close();
    

    
        
        

    }
}

