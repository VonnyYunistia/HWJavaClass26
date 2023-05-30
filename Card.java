package HWJavaClass26;

import java.util.LinkedList;

public class Card {

    private double interestRate;
    private String cardType;
    public Card(double interestRate, String cardType) {
        this.interestRate = interestRate;
        this.cardType = cardType;
    }
    public void displayInterest() {
        System.out.println("Interest rate for " + cardType + " card: " + interestRate + "%");
    }
    public void displayType() {
        System.out.println("This is a " + cardType + " card");
    }
}
class CreditCard extends Card {
    public CreditCard(double interestRate) {
        super(interestRate, "credit");
    }
}
class DebitCard extends Card {
    public DebitCard(double interestRate) {
        super(interestRate, "debit");
    }
}
class PrepaidCard extends Card {
    public PrepaidCard(double interestRate) {
        super(interestRate, "prepaid");
    }
}
class CardTest {
    public static void main(String[] args) {
        LinkedList<Card> cards = new LinkedList<>();

        cards.add(new CreditCard(5.0));
        cards.add(new DebitCard(3.5));
        cards.add(new PrepaidCard(1.0));

        for (Card card : cards) {
            card.displayInterest();
            card.displayType();
        }
    }









}
