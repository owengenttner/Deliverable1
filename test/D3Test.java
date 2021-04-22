/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import deliverable1.Deck;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author doubl
 */
public class D3Test {

    private static boolean CardSelector(int ranks) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public D3Test() {
    }
    
    public static boolean getCard(int ranks) {
        boolean win = false;
        if (ranks > 11) {
            win = true;
        } return win;
    }
    
    //Wouldn't run with the @Test above
    @Test
    public void testCardSelectorDeny() {
        System.out.println("Card Selected");
        int ranks = 7;
        boolean expResult = true;
        boolean result = D3Test.CardSelector(ranks);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testCardSelectorUnsure() {
        System.out.println("Card Selected");
        int ranks = 5;
        boolean expResult = true;
        boolean result = D3Test.CardSelector(ranks);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCardSelectorWin() {
        System.out.println("Card Selected");
        int ranks = 9;
        boolean expResult = true;
        boolean result = D3Test.CardSelector(ranks);
        assertEquals(expResult, result);
    }
}
