/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package training.iqgateway.chainOfResponsibility;

/**
 *
 * @author kousil.lakkapragada
 */
public interface DispenseChain {
    
    
    public void setNextCXhain(DispenseChain nextChain);
    
    public void dispense(Currency cur);
}
