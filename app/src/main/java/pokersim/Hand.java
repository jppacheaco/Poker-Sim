package pokersim;

public class Hand<C,S>{
    private C card;

    private S suit;

    public String toString(){
        return card + " " + suit;
    }

    public Hand(C card, S suit){
        this.card = card;
        this.suit = suit;
    }
}