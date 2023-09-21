/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package training.iqgateway.abstractfactory;

/**
 *
 * @author kousil.lakkapragada
 */
public class ServerFactory implements ComputerAbstractFactory {
 private String ram;
    private String ssd;
    private String cpu;

    public ServerFactory(String ram, String ssd, String cpu) {
        this.ram = ram;
        this.ssd = ssd;
        this.cpu = cpu;
    }
    
    
    @Override
    public WorkStation createWorkStation() {
            return new Laptop(ram,ssd,cpu);
    }

    
}
