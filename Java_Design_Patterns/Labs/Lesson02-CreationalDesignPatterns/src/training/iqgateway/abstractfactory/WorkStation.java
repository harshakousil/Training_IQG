/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package training.iqgateway.abstractfactory;

import training.iqgateway.*;

/**
 *
 * @author sai.krishna
 */
public abstract  class WorkStation {
    public abstract String getRam();
    public abstract String getSSD();
    public abstract String getCPU();
    @Override
    public String toString(){
        return "RAM : "+this.getRam() +" ,SSD :" +this.getSSD()+" ,CPU : "+this.getCPU();
       
    }
  
}
