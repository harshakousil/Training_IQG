/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package training.iqgateway.commandPattern;

/**
 *
 * @author kousil.lakkapragada
 */
public class OpenFileCommand  implements Command{
 private FileSystemReceiver fRef;
 
 public OpenFileCommand(FileSystemReceiver fs){
     this.fRef=fs;
 }
    @Override
    public void execute() {
        this.fRef.openFile();
    }
    
}
