/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tms.application.admin;

import javax.ws.rs.*;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author kousil.lakkapragada
 */
@Path("admin")
public class AdminOperations {
  
    private String Username=null;
    
    private String Password=null;
    
    @POST
    public void  createUser(String uname, String passWord){
        
        this.Username=uname;
        this.Password=passWord;
    
    }
    
    @GET
    public String fectchUser()
    {
        return ("Hello Mr . : "+Username +"Welcome to TMS Rest Web Service Application");
    }
    
    @PUT
    public void updateUser(String name, String pass)
    {
        if(Username != null)
        {
            this.Username=name;
        }
        if(Password !=null)
        {
            this.Password=pass;
        }
        
    }
    @DELETE
//  @Produces({MediaType.})
    public void removeUser(String name)
    {
        if(name == this.Username)
        {
            this.Username=null;
            this.Password=null;
        }
    }
     
    
}
