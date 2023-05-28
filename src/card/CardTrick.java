/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 * @author Urvish Shah
 * Student Id :- 991669737
 */
package card;

import java.util.*;

public class CardTrick {
    
    public static void main(String[] args) {
        Card[] magicHand = new Card[7];

        int[] magicCards = new int[7]; 
        
        for (int i = 0; i < magicHand.length; i++) {
            Card card = new Card();
            
            int generatedValue = (int) (Math.random() * 13) + 1;
            magicCards[i] = generatedValue;
            card.setValue(generatedValue);
            
            int generatedSuitIndex = (int) (Math.floor(Math.random() * 4));
            card.setSuit(Card.SUITS[generatedSuitIndex]);
            
            magicHand[i] = card;
        }
                
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your card value (1-13): ");
        int chosenValue = scan.nextInt();
        
        System.out.println("Enter your card suit (Hearts, Diamonds, Spades, Clubs): ");
        String chosenSuit = scan.next();
        
        Card userChoice = new Card();
        userChoice.setValue(chosenValue);
        userChoice.setSuit(chosenSuit);
        
        boolean appear = false;
        for (Card maincard : magicHand) {
            if (maincard.getSuit().equalsIgnoreCase(userChoice.getSuit()) && maincard.getValue() == userChoice.getValue()){
                appear = true;
                break;
            }
        }
        
        if (appear) {
            System.out.println("Your guess is matched, you win.");
        } else {
            System.out.println("Your guess is not matched, you lose.");
        }
        
        scan.close();
    }
}