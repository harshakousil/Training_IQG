/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package training.iqgateway.abstractfactory;

/**
 *
 * @author kousil.lakkapragada
 */
public  abstract class WorkStation_1 {
    public abstract String getRAM();
    public abstract String getSSD();
    public abstract String getCPU();
    
    @Override
    public String toString()
    {
        return "Details [RAM :"+this.getRAM()+",SSD :"+this.getSSD()+",CPU :"+this.getCPU() +"]";
    }
}
