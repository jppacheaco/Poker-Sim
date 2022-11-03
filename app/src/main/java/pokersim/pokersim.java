package pokersim;
//main program for poker sim
//this part will take in the hand of the player and the cards on the board
//returning the odds that the player has the best hands

import java.util.ArrayList;
import java.util.Scanner;
import pokersim.Deck;
import pokersim.Hand;

public class pokersim{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the cards in your hand with the format number space suit. (ex. jack spade, 10 club) ");
        String response = keyboard.nextLine();
        keyboard.close();


        //determine the hand from the response

        //get cards on the table? 
        keyboard = new Scanner(System.in);

        System.out.print("What are the cards showing on the table?");
        response = keyboard.nextLine();
        keyboard.close();

        splitRes = response.split(" ");






    }
}