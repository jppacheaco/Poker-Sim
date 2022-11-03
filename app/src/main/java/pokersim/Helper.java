package pokersim;
//stores the helper functions I will use during the sim

import pokersim.Deck;
import pokersim.Hand;
import java.util.ArrayList;

class HelperClass {
    public static ArrayList<Hand<Integer, String>> sortHand(String response){
        //arrays to store the suits and cards sorted out of response
        ArrayList<String> storeS;
        ArrayList<Integer> storeC;
        String[] splitRes = response.split(" ");

        ArrayList<Hand<Integer, String>> myHand = new ArrayList<Hand<Integer, String>>();
        //determine the hand from the response
        
        Deck myDeck = new Deck();
        // Integer[] posCards = myDeck.cards;
        String[] posSuits = myDeck.suits;

        //iterate through entire response
        for(int i = 0; i < splitRes.length; i++){
            //check the card
            //if we havent found the first card
            //check for face cards first
            if(splitRes[i].equalsIgnoreCase("jack")){
                storeC.add(11);
            }
            else if(splitRes[i].equalsIgnoreCase("queen")){
                storeC.add(12);
            }
            else if(splitRes[i].equalsIgnoreCase("king")){
                storeC.add(13);
            }
            else if(splitRes[i].equalsIgnoreCase("ace")){
                storeC.add(14);
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
                if ((val.toString().equals("")) == false){
                    storeC.add(Integer.valueOf(val.toString()));
                }
            }

            //finding suits
            System.out.println(splitRes[i]);
            for (int s = 0; s < 4; s++){
                System.out.println(posSuits[s]);
                //compare word with each suit to find a match
                if((posSuits[s].toLowerCase()).contains(splitRes[i].toLowerCase())){
                    //if we havent found the first suit
                    if (suit1.equals("empty")){
                        suit1 = posSuits[s];
                    }
                    else{
                        suit2 = posSuits[s];
                    }
                }
            }
        }
        
        //add hand to array
        myHand.add(new Hand (card1, suit1));
        myHand.add(new Hand (card2, suit2));

    }

}