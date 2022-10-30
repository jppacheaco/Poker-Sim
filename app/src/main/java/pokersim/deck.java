package pokersim;
//deckbuilder
import java.util.ArrayList;

public class deck{
    //create the deck
    public Integer[] cards = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
    public String[] suits = {"Spades", "Clubs", "Hearts", "Diamonds"};

    
    public ArrayList<Hand> getDeck(){
        ArrayList<Hand> fulldeck = new ArrayList<Hand>();
        //populate the deck
        for(int i=0; i<13; i++){
            for (int j = 0; j < 4; j++){
                fulldeck.add(new Hand <String, Integer> (cards[i], suits[j]));
            }
        }
        return fulldeck;
    }
}
