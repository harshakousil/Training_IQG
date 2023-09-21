/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training.iqgateway.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kousil.Lakkapragada
 */
public class ChatMediatorImpl implements ChatMediator{

    private List<User> users;

    public ChatMediatorImpl() {
        this.users = new ArrayList<>();
    }
    
    
    @Override
    public void sendMessage(String msg, User user) {
    for(User u: this.users){
    if(u != user){
    u.receive(msg);
    }
    }   
    }

    @Override
    public void addUser(User user) {
       this.users.add(user);
    }
    
    
}
