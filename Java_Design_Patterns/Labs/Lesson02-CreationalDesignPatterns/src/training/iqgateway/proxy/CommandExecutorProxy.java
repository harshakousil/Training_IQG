/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package training.iqgateway.proxy;

/**
 *
 * @author kousil.lakkapragada
 */
public class CommandExecutorProxy implements CommandExecutor {

    private boolean isAdmin;
    private CommandExecutor executor;
    
    
    
    public CommandExecutorProxy(String username,String pwd){
        if(username.equals("Kousil") &&pwd.equals("123")){
        
                isAdmin=true;
                executor =new CommandExcuterImpl();
                
        }
        
    }
    
    
    @Override
    public void runCommand(String cmd) throws Exception {
        if(isAdmin){
            if(cmd.trim().startsWith("mk"))
            {
                throw new Exception("mk Command is Not Allowed....");
            }
            else{
            executor.runCommand(cmd);
            }
        }
        else{
            if(cmd.contains("mk"))
            {
                throw new Exception("mk Command is Not Allowed....");
            }
            else
            {
                executor.runCommand(cmd);
            }
        }
    }
    
    
    
}
