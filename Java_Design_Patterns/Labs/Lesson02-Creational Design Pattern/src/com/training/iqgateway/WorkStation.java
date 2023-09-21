/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.training.iqgateway;

/**
 *
 * @author kousil.lakkapragada
 */
public  abstract class WorkStation {
    public abstract String getRAM();
    public abstract String getSSD();
    public abstract String getCPU();
    
    @Override
    public String toString()
    {
        return "Details [RAM :"+this.getRAM()+",SSD :"+this.getSSD()+",CPU :"+this.getCPU() +"]";
    }
}
