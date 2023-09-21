/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package training.iqgateway.adapter;

/**
 *
 * @author kousil.lakkapragada
 */
//Objecta adapter  based on composition
public class SocketObjectAdapterImpl implements SocketAdapter {
     private Socket socketRef= new Socket();
     
    @Override
    public Volt get120Volt() {
        return socketRef.getVolt();
             }

    @Override
    public Volt get12Volt() {
        Volt v=socketRef.getVolt();
           return convertVolt(v,10);

    }

    @Override
    public Volt get3Volt() {
         Volt v=socketRef.getVolt();
           return convertVolt(v,40);
    }

    private Volt convertVolt(Volt v, int i)
    {
           return new Volt(v.getVolts()/i);
    }
}
