/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package training.iqgateway.adapter;

/**
 *
 * @author kousil.lakkapragada
 */
public class socketClassAdapterImpl extends Socket implements SocketAdapter {

    @Override
    public Volt get120Volt() {
    return getVolt();
    }

    @Override
    public Volt get12Volt() {
            Volt v=getVolt();
            return convertVolt(v,10);
        }

    @Override
    public Volt get3Volt() {
        Volt v=getVolt();
          return convertVolt(v,40);
    }
    

    private Volt convertVolt(Volt v, int i) {
         return new Volt(v.getVolts()/i);
    }

}
