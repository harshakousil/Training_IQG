/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package training.iqgateway.commandPattern;

/**
 *
 * @author kousil.lakkapragada
 */
public class CommandPatternTester {
    FileSystemReceiver fs= FileSystemUtil.getUnderLyingFileSystem();
    
    OpenFileCommand openFileCommandRef =new OpenFileCommand(fs);
    
    FileInvoker f1 =new FileInvoker(openFileCommandRef);  
    //  f1.execute();
    
    WriteFileCommand w =new WriteFileCommand(fs);
    
    FileInvoker f2=new FileInvoker(w);
    
   // f2.execute();
    
}
