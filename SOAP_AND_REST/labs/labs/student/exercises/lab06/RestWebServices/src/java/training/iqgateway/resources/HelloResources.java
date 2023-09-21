/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training.iqgateway.resources;

//import static com.sun.jersey.server.impl.model.HttpHelper.produces;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author kousil.lakkapragada
 */
@Path("hello")
public class HelloResources {
    
    
    private  String message="Welcome to rest services";
    
    
    @GET
    @Produces({MediaType.TEXT_PLAIN})
    public String sayHello()
    {
        return this.message;
    }
    @GET
    @Produces({MediaType.TEXT_HTML})
    public String getHello()
    {
      return "<h1>"+ this.message+"</h1>";
    }
    @PUT
    public void setHello(@QueryParam("newMsg")String Message)
    {
        this.message=Message;
    }
    
}
