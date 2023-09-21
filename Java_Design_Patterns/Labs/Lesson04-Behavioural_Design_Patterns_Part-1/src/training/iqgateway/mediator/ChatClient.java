/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training.iqgateway.mediator;

/**
 *
 * @author Kousil.Lakkapragada
 */
public class ChatClient {

    public static void main(String[] args) {
        
        ChatMediator mediator = new ChatMediatorImpl();
        User user1 = new UserImpl(mediator,"A");
        User user2 = new UserImpl(mediator,"B");
        User user3 = new UserImpl(mediator,"C");
        
        mediator.addUser(user1);
         mediator.addUser(user2);
        mediator.addUser(user3);
        
        user1.send("Hello everyone");
    }
    
}
