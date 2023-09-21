/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package training.iqgateway;

/**
 *
 * @author sai.krishna
 */
public class FactoryMethodAppTest {
    
    public static void main(String[] args){
        WorkStation lapRef = WorkStationFactory.getWorkStation("laptop", "8 GB", "480 GB", "2.4 GHZ");
        
        WorkStation serverRef = WorkStationFactory.getWorkStation("Server", "16 GB", "600 GB", "4.8 GHZ");
        
        System.out.println(lapRef.toString());
        System.out.println(serverRef.toString());
                
    }
}
