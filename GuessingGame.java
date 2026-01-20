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
    int[] guessArray = new int[10000];// Array called guessHistory that has space for a 100 integers
    int index = 0;
    String correctHighLow;

    


    public Game(){
            //Load array with numbers
            for (int i = 0; i < guessArray.length; i++) {
                guessArray[i] = i; 
            }
                
    }
    public void runGame () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("I will guess a number your thinking from 1-100");

        BinarySearch(0, guessArray.length, scanner);
                    
    
        scanner.close();
    
    }

    public void BinarySearch(int low, int high, Scanner scanner){
        int mid = low + (high - low) / 2;
        
        System.out.print("Is this correct, low, or high " + guessArray[mid] + "? ");
        correctHighLow = scanner.next();

        if (correctHighLow.equals("correct")) {
            System.out.print("Nice I got it");
        }

        if (correctHighLow.equals("Low")){
            BinarySearch(mid + 1, high, scanner);
        }

        if (correctHighLow.equals("High")) {
            BinarySearch(low, mid, scanner);
        }
        
    }
}

