/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training.iqgateway.composite;


public class CompositePatternTester {
    
    public static void main(String[] args) {
        Shape triangleShape1 = new Triangle();
         Shape triangleShape2 = new Triangle();  
         
         Shape circleref1 = new Circle();
          Shape circleref2 = new Circle();
          
          Drawing drawRef = new Drawing();
          
          drawRef.add(triangleShape1);
          drawRef.add(triangleShape2);
          drawRef.add(circleref1);
           drawRef.add(circleref2);
           drawRef.draw("Blue");
           
           drawRef.clear();
           
           drawRef.add(triangleShape1);
          drawRef.add(triangleShape2);
          drawRef.add(circleref1);
           drawRef.add(circleref2);
           drawRef.draw("Green");
    }
}
