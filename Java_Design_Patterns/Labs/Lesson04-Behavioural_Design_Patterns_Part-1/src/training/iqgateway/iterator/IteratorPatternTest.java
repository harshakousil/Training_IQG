/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package training.iqgateway.iterator;

/**
 *
 * @author kousil.lakkapragada
 */
public class IteratorPatternTest {
    
    private static ChannelCollection populateChannels(){
    ChannelCollection channels=new ChannelCollectionImpl();
    channels.addChannel(new Channel(98.5, ChannelTypeEnum.TELUGU));
    channels.addChannel(new Channel(99.5, ChannelTypeEnum.TAMIL));
    channels.addChannel(new Channel(100.5, ChannelTypeEnum.TELUGU));
    channels.addChannel(new Channel(101.5, ChannelTypeEnum.HINIDI));
    channels.addChannel(new Channel(104.5, ChannelTypeEnum.KANNADA));
    channels.addChannel(new Channel(105.5, ChannelTypeEnum.TELUGU));

    return channels;
    }
    
    public static void main(String[] args) {
        
        ChannelCollection channels =populateChannels();
        
        ChannelIterator baseIterator=channels.iterator(ChannelTypeEnum.ALL);
        
        System.out.println("********");
        while(baseIterator.hasNext()){
            Channel c=baseIterator.next();
            System.out.println(c.toString());
            
        }
        ChannelIterator teluguIterator=channels.iterator(ChannelTypeEnum.TELUGU);
        
        System.out.println("********");
        while(teluguIterator.hasNext()){
            Channel c=teluguIterator.next();
            System.out.println(c.toString());
            
        }
    }
}
