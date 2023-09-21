/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package training.iqgateway.chainOfResponsibility;

/**
 *
 * @author kousil.lakkapragada
 */
public class CORTester {
    
    private DispenseChain c1;
    
    public CORTester()
    {
        this.c1=new Rupee500Dispenser();
        DispenseChain c2=new  Rupee200Dispenser();
        DispenseChain c3=new  Rupee100Dispenser();

        
        c1.setNextCXhain(c2);
        c2.setNextCXhain(c3);
    }
    public static void main(String[] args) {
        CORTester obj= new CORTester();
        
        while(true){
            
            int amount=0;
            
            System.out.println("Enter the Withdrawl Amount :");
            
            java.util.Scanner sc=new java.util.Scanner(System.in);
            
            amount=sc.nextInt();
            
            if(amount %100 !=0){
                System.out.println("Amount Should be In Multiples of 100's");
            }
            else{
            obj.c1.dispense(new Currency(amount));
            }
            return;
        }
    }
    
}
