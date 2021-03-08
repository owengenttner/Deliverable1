/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deliverable1;

public class main {
    public static void main(String[] args) {
        Card[][] hands = new Card[2][1];
        Deck myDeck = new Deck();
        int player1Score = 0;
        int player2Score = 0;

        //reduced this to 26 iterations because two cards are dealt each iteration
        for (int i = 1; i < 26; i++) {
            System.out.printf("\n Round %s of The War \n", i);

            //Assigns the card to hands[player][0] since that's the only option
            //for (int c = 0; c < 1; c++)

            for (int player = 0; player < hands.length; player++)
                hands[player][0] = myDeck.dealCard();

            for (int player = 0; player < hands.length; player++) {
                System.out.printf("Player %d: ", player);
                System.out.println(hands[player][0]);
            }
            int player1 = hands[0][0].getValue(); //get the value from the Card object
            int player2 = hands[1][0].getValue();

            //Keeps score of which player wins each round
            if (player1 > player2) {
                System.out.println("Player 1 Wins this round!");
                player1Score++;
            } else if (player2 > player1) {
                System.out.println("Player 2 Wins this round!");
                player2Score++;
            } else {
                System.out.println("The War Is A Tie");
            }
        }
        System.out.println();
        System.out.println("Score:");
        System.out.println("Player 1: "+player1Score);
        System.out.println("Player 2: "+player2Score);
    }
}
