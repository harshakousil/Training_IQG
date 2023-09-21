/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package training.iqgateway.bridge;

/**
 *
 * @author kousil.lakkapragada
 */
public class Square extends Shape{
    
    public Square(Color c){
        super(c);
     }

    @Override
    public void applyColor() {
        System.out.println("Colored Square ");
        color.applyColor();
    }
    
}
