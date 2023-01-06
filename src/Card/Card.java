package Card;

public class Card {
    private final Suit suit;
    private final Rank rank;

    public Card(String suit, String rank) {
        this.suit = stringToSuit(suit);
        this.rank = stringToRank(rank);
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    public Suit stringToSuit(String cardSuit) {
        for (Suit suit : Suit.values()) {
            if (suit.toString().equals(cardSuit)) {
                return suit;
            }
        }

        System.out.println("One or more suits/ranks do not exist...");
        System.exit(1);
        return null;
    }

    public Rank stringToRank(String cardRank) {
        for (Rank rank : Rank.values()) {
            if (rank.toString().equals(cardRank)) {
                return rank;
            }
        }

        System.out.println("One or more suit/ranks do not exist...");
        System.exit(1);
        return null;
    }
}
