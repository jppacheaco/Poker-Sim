package pokersim;
//main program for poker sim
//this part will take in the hand of the player and the cards on the board
//returning the odds that the player has the best hands

import java.util.ArrayList;
import java.util.Scanner;

public class pokersim{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the cards in your hand with the format number space suit. (ex. jack spade, 10 club ");
        String response = keyboard.nextLine();

        String[] splitRes = response.split(" ");

        //determine the hand from the response

        String suit1 = "empty";
        String suit2 = "empty";
        Integer card1 = 0;
        Integer card2 = 0;

        Deck myDeck = new Deck();
        Integer[] posCards = myDeck.cards;
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
                    char[] myString = splitRes[i].toCharArray(); 
                    StringBuilder val = new StringBuilder();
                    for (int c = 0; c<myString.length; c++){
                        if (Character.isDigit(myString[c])){
                            val.append(myString[c]);
                        }
                    }
                    if (val.toString()!= ""){
                        card1 = Integer.valueOf(val.toString());
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
                    char[] myString = splitRes[i].toCharArray(); 
                    StringBuilder val = new StringBuilder();
                    for (int c = 0; c<myString.length; c++){
                        if (Character.isDigit(myString[c])){
                            val.append(myString[c]);
                        }
                    }
                    
                    if (val.toString()!= ""){
                        System.out.print(val.toString());
                        card2 = Integer.valueOf(val.toString());
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
        ArrayList<Hand<String, Integer>> myHand = new ArrayList<Hand<String, Integer>>();
        myHand.add(new Hand (card1, suit1));
        myHand.add(new Hand (card2, suit2));

        System.out.println(myHand.toString());


    }
}