/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package training.iqgateway.commandPattern;

/**
 *
 * @author kousil.lakkapragada
 */
public class WriteFileCommand  implements Command{
 private FileSystemReceiver fRef;
 
 public WriteFileCommand(FileSystemReceiver fs){
     this.fRef=fs;
 }
    @Override
    public void execute() {
        this.fRef.writeFile();
    }
    
}
