/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package training.iqgateway.proxy;

/**
 *
 * @author kousil.lakkapragada
 */
public class CommandExcuterImpl implements CommandExecutor {

    @Override
    public void runCommand(String cmd) throws Exception {
        Runtime.getRuntime().exec(cmd);
        System.out.println("'"+ cmd +" ' Command Exceuted....");
        
        
    }
    
}
