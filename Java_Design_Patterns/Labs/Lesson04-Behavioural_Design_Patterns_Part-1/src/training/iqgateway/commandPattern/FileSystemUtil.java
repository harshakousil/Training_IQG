/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package training.iqgateway.commandPattern;

/**
 *
 * @author kousil.lakkapragada
 */
public class FileSystemUtil {
    
    public static FileSystemReceiver getUnderLyingFileSystem()
    {
      String osName=System.getProperty("os.name");
      System.out.println("Underlying Os is :"+osName);
      if(osName.contains("Windows")){
          return new WindowsFileSystemReceiver();
      }
      else{
          return new UnixFileSystemReceiver();
      }
    }
    
}
