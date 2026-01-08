package Level3_8_01_2026;

import java.util.Scanner;
public class DeckOfCards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] deck = initializeDeck();
        String[] shuffledDeck = shuffleDeck(deck);
        int players = sc.nextInt();
        int cardsPerPlayer = sc.nextInt();
        String[][] distributed = distributeCards(shuffledDeck, players, cardsPerPlayer);
        if (distributed != null) {
            printCards(distributed);
        } else {
            System.out.println("Not enough cards.");
        }
        sc.close();
    }
    public static String[] initializeDeck() {
        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
        String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        int k = 0;
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck[k++] = ranks[j] + " of " + suits[i];
            }
        }
        return deck;
    }
    public static String[] shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int) (Math.random() * (n - i));
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        return deck;
    }
    public static String[][] distributeCards(String[] deck, int players, int cardsPerPlayer) {
        if (players * cardsPerPlayer > deck.length) {
            return null;
        }
        String[][] hands = new String[players][cardsPerPlayer];
        int cardIdx = 0;
        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                hands[i][j] = deck[cardIdx++];
            }
        }
        return hands;
    }
    
    public static void printCards(String[][] hands) {
        for (int i = 0; i < hands.length; i++) {
            System.out.println("Player " + (i + 1) + " cards:");
            for (int j = 0; j < hands[i].length; j++) {
                System.out.println("  " + hands[i][j]);
            }
            System.out.println();
        }
    }
}
