/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.training.iqgateway.test;

import training.iqgateway.abstractfactory.WorkStation;
import com.training.iqgateway.WorkStationFactory;

/**
 *
 * @author kousil.lakkapragada
 */
public class FactoryMethodPatternTest {
    
    public static void main(String[] args) {
        WorkStation laptopRef = WorkStationFactory.getWorkStation("Laptop", "8 GB", "256 GB","2.4 GHZ");
        
        WorkStation serverRef=WorkStationFactory.getWorkStation("Server", "32 GB", "556 GB", "5.6 GHZ");
    
    System.out.println("Factory Laptop Config Details :"+ laptopRef);
    
    System.out.println("Factory Server Config Details :"+ serverRef);

    
    }
    
}
