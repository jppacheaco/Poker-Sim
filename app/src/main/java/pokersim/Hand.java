package pokersim;
//an object the will operate as a holder for the users hand
public class Hand<C, S> {
    //store the card
    private C card;
    //store the suit
    private S suit;

    public C getCard(){
        return card;
    }

    public S getSuit(){
        return suit;
    }

    public Hand(C card, S suit){
        this.card = card;
        this.suit = suit;
    }

    public String toString(){
        return card + " " + suit;
    }
}