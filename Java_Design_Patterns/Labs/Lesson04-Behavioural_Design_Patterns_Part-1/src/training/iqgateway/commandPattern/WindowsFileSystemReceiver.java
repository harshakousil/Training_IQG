/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package training.iqgateway.commandPattern;

/**
 *
 * @author kousil.lakkapragada
 */
public class WindowsFileSystemReceiver  implements FileSystemReceiver   {

    @Override
    public void openFile() {
        System.out.println("Opening  File in Windows Os");
    }

    @Override
    public void writeFile() {
        System.out.println("Writing File in Windows OS");
        
    }

    @Override
    public void closeFile() {
        System.out.println("Closing  File in Windows Os");
    }
    
}
