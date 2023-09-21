/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carddeckseclient;

import cards.CardDeckSessionBean;
import cards.CardDeckSessionBeanService;
import cards.CardType;
import cards.StackType;
import java.util.List;

/**
 *
 * @author kousil.lakkapragada
 */
public class CardDeckSEClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       // CardDeckSessionBeanService service =new CardDeckSessionBeanService();
        
        //CardDeckSessionBean port =service.getCardDeckSessionBeanPort();
        
       // int deckId1=port.createDeck(0);
       // port.shuffleDeck(deckId1);
        
       // StackType deck =port.getDeck(deckId1);
       
       int deckId1 =createDeck(0);
       shuffleDeck(deckId1);
       StackType deck=getDeck(deckId1);
        
        List<CardType> cards=deck.getCard();
        
        for(CardType card: cards)
        {
            if(card.getRank().equalsIgnoreCase("JOKER"))
            {
                System.out.println(card.getColor()+" "+card.getRank());
            }
            else
            {
                System.out.println(card.getRank()+" "+" of "+card.getSuit());

            }
        }
        
    }

    private static Integer createDeck(int arg0) {
        cards.CardDeckSessionBeanService service = new cards.CardDeckSessionBeanService();
        cards.CardDeckSessionBean port = service.getCardDeckSessionBeanPort();
        return port.createDeck(arg0);
    }

    private static boolean shuffleDeck(int arg0) {
        cards.CardDeckSessionBeanService service = new cards.CardDeckSessionBeanService();
        cards.CardDeckSessionBean port = service.getCardDeckSessionBeanPort();
        return port.shuffleDeck(arg0);
    }

    private static StackType getDeck(int arg0) {
        cards.CardDeckSessionBeanService service = new cards.CardDeckSessionBeanService();
        cards.CardDeckSessionBean port = service.getCardDeckSessionBeanPort();
        return port.getDeck(arg0);
    }
    
}
