/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package training.iqgateway.commandPattern;

/**
 *
 * @author kousil.lakkapragada
 */
public class UnixFileSystemReceiver  implements FileSystemReceiver   {

    @Override
    public void openFile() {
        System.out.println("Opening  File in Unix Os");
    }

    @Override
    public void writeFile() {
        System.out.println("Writing File in Unix OS");
        
    }

    @Override
    public void closeFile() {
        System.out.println("Closing  File in Unix Os");
    }
    
}
