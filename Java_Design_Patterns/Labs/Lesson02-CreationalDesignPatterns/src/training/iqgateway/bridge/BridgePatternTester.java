/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package training.iqgateway.bridge;

/**
 *
 * @author kousil.lakkapragada
 */
public class BridgePatternTester {
    public static void main(String[] args) {
        
        Shape triangleRef =new Traingle(new RedColor());
        triangleRef.applyColor();
        
        Shape SquareRef =new Square(new BlueColor());
        SquareRef.applyColor();
    }
    
}
