/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package training.iqgateway.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kousil.lakkapragada
 */
public class ChannelCollectionImpl implements ChannelCollection {

    
    private List<Channel> channelList;
    
    public ChannelCollectionImpl()
    {
         this.channelList= new ArrayList<>();
    }
    @Override
    public void addChannel(Channel c) {
       this.channelList.add(c);
    }

    @Override
    public void removeChannel(Channel c) {
        this.channelList.remove(c);
    }

    @Override
    public ChannelIterator iterator(ChannelTypeEnum type) {
        return new ChannelIteratorImpl(type,this.channelList);
    }
    private class ChannelIteratorImpl implements ChannelIterator{

        
        private ChannelTypeEnum type;
        private List<Channel>channels;
        private int position;

        public ChannelIteratorImpl(ChannelTypeEnum type, List<Channel> channels) {
            this.type = type;
            this.channels = channels;
        }
        
        
        @Override
        public boolean hasNext() {
           while(position<channels.size()){
               Channel c= channels.get(position);
               if(c.getTYPE().equals(type)|| type.equals(ChannelTypeEnum.ALL))
               {
                   return true;
               }
               else{
                   position++;
               }
               
           }
           return false;
        }

        @Override
        public Channel next() {
            Channel c= channels.get(position);
            position++;
            return c;
        }
        
    } 
}
