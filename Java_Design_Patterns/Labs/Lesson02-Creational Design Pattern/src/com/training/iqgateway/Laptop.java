/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.training.iqgateway;


/**
 *
 * @author kousil.lakkapragada
 */
public class Laptop extends WorkStation{
    
    private String ram;
    private String ssd;
    private String cpu;
   
public Laptop()
{
}  
    public Laptop(String ram, String ssd,String cpu)
    {
        this.ram=ram;
        this.ssd=ssd;
        this.cpu=cpu;
    }
    @Override
    public String getRAM() {
        return this.ram;
    }
   @Override
    public String getSSD() {
        return this.ssd;
    }
    @Override
    public String getCPU() {
        return this.cpu;
    }

}
