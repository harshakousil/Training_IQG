package com.example.lambda;

import java.util.List;
import java.util.function.Predicate;

/**
 * @author Oracle
 * Streams and filters
 */
public class RoboMailTest01 {
  
  public static void main(String[] args) {
    
    List<Employee> pl = Employee.createShortList();
    RoboMail01 robo = new RoboMail01();

   
    System.out.println("\n==== RoboMail 01");
    System.out.println("\n=== Male Eng Under 65");
    
    // Mail mail, Eng employees < 65

    
    Predicate<Employee> maleEngineers = 
      p -> p.getGender() == Gender.MALE
        && p.getDept().equals("Eng") && p.getAge()<66;
    
    pl.stream().filter(maleEngineers).forEach(p ->robo.roboMail(p));
  }
}
