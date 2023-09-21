/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package training.iqgateway.abstractfactory;

/**
 *
 * @author sai.krishna
 */
public class WorkStationFactory {
    
    public static WorkStation getWorkStation(ComputerAbstractFactory factory){
        return factory.createWorkStation();
    }
    
}
