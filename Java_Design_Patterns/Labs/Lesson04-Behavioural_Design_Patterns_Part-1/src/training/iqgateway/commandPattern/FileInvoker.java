/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package training.iqgateway.commandPattern;

/**
 *
 * @author kousil.lakkapragada
 */
public class FileInvoker {
    
    public Command commandRef;

    public FileInvoker(Command commandRef) {
        this.commandRef = commandRef;
    }
    
   public void execute(){
       this.commandRef.execute();
   }
            
            
}
