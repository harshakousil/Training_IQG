/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package training.iqgateway.iterator;

/**
 *
 * @author kousil.lakkapragada
 */
public interface ChannelCollection {
    
    public void addChannel(Channel c);
    
    public void removeChannel(Channel c);
    
    public ChannelIterator iterator(ChannelTypeEnum type);
}
