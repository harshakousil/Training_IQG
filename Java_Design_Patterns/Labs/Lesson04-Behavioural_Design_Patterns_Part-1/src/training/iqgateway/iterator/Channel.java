/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package training.iqgateway.iterator;

/**
 *
 * @author kousil.lakkapragada
 */
public class Channel {
    
    private double frequency;
    
    private ChannelTypeEnum TYPE;

    public Channel(double frequency,ChannelTypeEnum TYPE) {
        this.frequency = frequency;
        this.TYPE=TYPE;
    }

    public double getFrequency() {
        return frequency;
    }

    public ChannelTypeEnum getTYPE() {
        return TYPE;
    }
    
    
    
    
}
