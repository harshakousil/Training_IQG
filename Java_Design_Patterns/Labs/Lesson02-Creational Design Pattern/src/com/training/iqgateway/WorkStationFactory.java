/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.training.iqgateway;
import training.iqgateway.abstractfactory.Laptop;

/**
 *
 * @author kousil.lakkapragada
 */
public class WorkStationFactory {
    
    public static WorkStation getWorkStation(String givenType,String givenRam,String givenSsd,String givenCpu)
    {
        if("Laptop".equalsIgnoreCase(givenType))
        {
            return new Laptop(givenRam,givenSsd,givenCpu);
            
        }
        else if("Server".equalsIgnoreCase(givenType))
        {
            return new Server(givenRam,givenSsd,givenCpu);
        }
        return null;
    }
    
}
