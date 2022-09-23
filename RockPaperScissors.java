/* Rock Paper Scissors
* Authors: 794748 Raiyan Aaijaz
* Course: ICS3UO
* Teacher: Mr. King
*/
package rockpaperscissors;
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

    public static void main(String[] args) {
	String input; //User's play -- "R", "P", or "S"
	String computer; //Computer's play -- "R", "P", or "S"
	int computerInt;      
        //Randomly generated number used to determine computer's play
        Scanner scan = new Scanner(System.in); //allows use of scanner as 'scan'
	Random generator = new Random(); 
        //allows use of generator as 'generator'
        
        for (int i = 0; i < 5; i++) {
            System.out.println ("Enter R for Rock, P for Paper, S for Scissors: "); 
            input = scan.next(); //user's input is stored in string 'input'

            input = input.toUpperCase(); 
            //user's string input is changed to uppercase
            computerInt = generator.nextInt(3);
            /*computer generates a random number between 0 and 3 and is stored into
            variable 'computerInt'*/
            switch (computerInt) { //switch code for computerInt

                case 0: { //if computer chose number as 0 this case will happen
                    computer = "R";//if computer chose 0 it played Rock
                    break; } //breaks out of switch 
                case 1: {//if computer chose number as 1 this case will happen
                    computer = "P";//if computer chose 1 it played Paper
                    break; } //breaks out of switch 
                case 2: {//if computer chose number as 2 this case will happen
                    computer = "S";//if computer chose 2 it played Scissors
                    break; } //breaks out of switch 
                default: { 
                //default case for when computer generates a number too nig
                    computer = "will not happen"; 
                    //the computer will say nothing will happen
                    }	
            } //ends the switch cases

            System.out.println ("Computer plays: " + computer); 
            //tells user what the computer played

            if (input.equals(computer)){ 
            /* if input is the same as computer play string 
            then computer will say it was a tie */
                System.out.println("It's a tie!");
            }
                
            else if (input.equals("R")) { 
                if (computer.equals("S"))
                    System.out.println("Rock beats scissors.  You win!!");
                else if (computer.equals("P"))
                    System.out.println ("Paper beats rock. You lose!!");
            } /* If user plays rock then the computer will say rock beats 
            scissors if computer played scissors or it will say paper beats 
            rock if computer played paper*/
                
            else if (input.equals("P")) {
                if (computer.equals("S"))
                    System.out.println ("Scissor beats paper. You lose!!");
                else if (computer.equals("R"))
                    System.out.println ("Paper beats rock. You win!!");
            } /* If user plays paper then the computer will say scissor beats 
            paper if computer played scissors or it will say paper beats 
            rock if computer played rock*/
                
            else if (input.equals("S")){
                if (computer.equals("P"))
                    System.out.println ("Scissor beats paper. You win!!");
                else if (computer.equals("R"))
                    System.out.println ("Rock beats scissors. You lose!!");
            } /* If user plays scissors then the computer will say scissor beats 
            paper if computer played paper or it will say rock beats 
            scissors if computer played rock*/
                
            else {
                System.out.println ("Invalid user input.");
            } 
            //if the user puts in any other letter, then computer will say invalid
            
            System.out.println("Would you like to play again? Yes or No");
            char answer = scan.next().charAt(0); 
            //allows user to input yes or no 
            //it only collects the first character in the word
            
            if (answer == 'n' || answer == 'N'){
                break; 
            //if statement that says if the user inputs no
            //the program will break out of the loop
            }  
            
        }
        System.out.println("Thanks For Playing!"); 
        //tells user thanks for playing
    }//ends the main
} //ends the class
