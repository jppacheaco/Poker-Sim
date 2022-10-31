package pokersim;
//deckbuilder
import java.util.ArrayList;

public class Deck{
    //create the deck
    Integer[] cards = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
    String[] suits = {"Spades", "Clubs", "Hearts", "Diamonds"};

    ArrayList<Hand<Integer, String>> fulldeck = new ArrayList<Hand<Integer, String>>();

    public ArrayList<Hand<Integer, String>> getDeck(){
        //populate the deck
        for(int i=0; i<13; i++){
            for (int j = 0; j < 4; j++){
                fulldeck.add(new Hand (cards[i], suits[j]));
            }
        }
        return fulldeck;
    }
}
