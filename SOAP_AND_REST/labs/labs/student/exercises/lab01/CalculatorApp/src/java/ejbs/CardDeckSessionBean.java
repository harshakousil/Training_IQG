/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejbs;

import java.util.HashMap;
import java.util.Map;
import javax.ejb.Singleton;
import javax.jws.WebService;
import playingcards.CardCollection;
import playingcards.FrenchCardDeck;

/**
 *
 * @author kousil.lakkapragada
 */
@WebService
@Singleton
public class CardDeckSessionBean {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    private int nextDeckId=0;
    
    private Map<Integer, FrenchCardDeck> decks= new HashMap<>();
    
    
    public Integer createDeck(int jokerCount)
    {
        int deckId =nextDeckId++;
        decks.put(deckId, new FrenchCardDeck(jokerCount));
        return deckId;
        
    }
    public Integer[] listDeckIds()
    {
        return decks.keySet().toArray(new Integer[0]);
    }
    public boolean deleteDeck(int id)
    {
     FrenchCardDeck deck = decks.remove(id);
     if(deck==null)
     {
         return false;
     }
     else{
         return true;
     }
     }
    
    public boolean shuffleDeck(int id)
    {
        FrenchCardDeck deck =decks.get(id);
        if(deck ==null)
        {
            return false;
        }
        else{
            deck.shuffle();
            return true;
        }
    }
    public CardCollection getDeck(int id)
    {
        FrenchCardDeck deck =decks.get(id);
        return deck;
    }
}
