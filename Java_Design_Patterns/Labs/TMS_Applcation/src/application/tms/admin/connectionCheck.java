/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application.tms.admin;


import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kousil.lakkapragada
 */
public class connectionCheck {
    public static void main(String[] args)
    {
        
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException ex) {
           System.out.println("driver load ille");
        }
        try {
            //connection query
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","TMS","TMS");
            
            String query="Select * from TM_USER";
            
           Statement st = con.createStatement();
           
          ResultSet rs= st.executeQuery(query);
          System.out.println("Hello");
          while(rs.next())
          {
              System.out.println("Hello");
          }
        } catch (SQLException ex) {
            Logger.getLogger(connectionCheck.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
}
