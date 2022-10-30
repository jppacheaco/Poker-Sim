//main program for poker sim
//this part will take in the hand of the player and the cards on the board
//returning the odds that the player has the best hands

import java.util.ArrayList;
import java.util.Scanner;

import main.java.pokersim.Hand;
import pokersim.deck;

public class pokersim{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the cards in your hand with the format number space suit. (ex. jack spade, 10 club ");
        String response = keyboard.nextLine();

        String[] splitRes = response.split(" ");

        //determine the hand from the response

        String suit1;
        String suit2;
        Integer card1 = 0;
        Integer card2 = 0;

        deck myDeck = new deck();
        Integer[] posCards = mydeck.cards;
        String[] posSuits = myDeck.suits;

        //iterate through entire response
        for(int i = 0; i < splitRes.length; i++){
            //check the card
            //if we havent found the first card
            if(card1 == 0){
                //check for face cards first
                if(splitRes[i].equalsIgnoreCase("jack")){
                    card1 = 11;
                }
                else if(splitRes[i].equalsIgnoreCase("queen")){
                    card1 = 12;
                }
                else if(splitRes[i].equalsIgnoreCase("king")){
                    card1 = 13;
                }
                else if(splitRes[i].equalsIgnoreCase("ace")){
                    card1 = 14;
                }
                else{
                    //find numeric value else
                    for (int c = 0; c<10; c++){
                        Integer iterCard = posCards[c];
                        if (Integer.parseInt(splitRes[i]) == iterCard){
                            card1 = iterCard;
                        }
                    }
                }
            }
            //if we have found the first card but not the second
            else if(card2 == 0){
                //check for face cards first
                if(splitRes[i].equalsIgnoreCase("jack")){
                    card2 = 11;
                }
                else if(splitRes[i].equalsIgnoreCase("queen")){
                    card2 = 12;
                }
                else if(splitRes[i].equalsIgnoreCase("king")){
                    card2 = 13;
                }
                else if(splitRes[i].equalsIgnoreCase("ace")){
                    card2 = 14;
                }
                else{
                    //find numeric value else
                    for (int c = 0; c<10; c++){
                        Integer iterCard = posCards[c];
                        if (Integer.parseInt(splitRes[i]) == iterCard){
                            card2 = iterCard;
                        }
                    }
                }
            }

            //finding suits
            for (int s = 0; s < 4; s++){
                //compare word with each suit to find a match
                if(posSuits[s].equalsIgnoreCase(splitRes[i])){
                    //if we havent found the first suit
                    if (suit1.equals(null)){
                        suit1 = splitRes[i];
                    }
                    else{
                        suit2 = splitRes[i];
                    }
                }
            }
        }
        
        //add hand to array
        ArrayList<Hand<C,S>> myHand = new ArrayList<Hand>();
        myHand.add(new Hand <String, Integer> (card1, suit1));
        myHand.add(new Hand <String, Integer> (card2, suit2));

        System.out.println(myHand.toString());
    }
}