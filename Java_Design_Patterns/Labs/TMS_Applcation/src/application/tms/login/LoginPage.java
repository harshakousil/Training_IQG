/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application.tms.login;

/**
 *
 * @author kousil.lakkapragada
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class LoginPage extends JFrame implements ActionListener {

    //creating mandatory lable and field for login page
    JLabel lable1,lable2,lable3;
    JTextField userName;
    JPasswordField passWord;
    JButton loginButton;
    
    // constructor without parameters
    public LoginPage(){
        
        //deafult values for a frame that is to be displayed 
        setTitle(" TMS LOGIN PAGE ");
        setVisible(true);
        setSize(800,800);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        lable1=new JLabel("Login Here");
        lable1.setForeground(Color.green);
        lable1.setFont(new Font("Arail",Font.BOLD,20));
        lable1.setBounds(100, 30, 400, 30);
        
        lable2 =new JLabel("User Name :");
        lable2.setBounds(80, 70, 200, 30);
        
        lable3= new JLabel("Password :");
        lable3.setBounds(80,110,200,30);
        
        userName= new JTextField();
        userName.setBounds(300,70,200,30);
        
        passWord= new JPasswordField();
        passWord.setBounds(300,110,200,30);
        
        loginButton =new JButton("Submit");
        
        loginButton.setBounds(300, 160, 100, 30);
        
        
        add(lable1);
        add(lable2);
        add(lable3);
        
        add(userName);
        add(passWord);
        add(loginButton);
        //adding an event listner to the loginButton
        loginButton.addActionListener(this);
                      
    }
        

    @Override
    public void actionPerformed(ActionEvent e) {
        //calling showData function when button is clicked;
        showData();
    }
    
    public void showData(){
        
        //for now creating a frame to display the message , on succesfull login  redirect user to respective home_page
        JFrame messageFrame= new JFrame();
        JLabel label4;
        
        //getting the user details and storing them in string data type
        String UserName=userName.getText();
        
        char[] pass =passWord.getPassword();
        
        String PassWord = new String(pass);
        
        
        //connectiing to database  for authenticating the user details
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            //connection query
            Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","TMS","TMS");
            
            //creating a prepared statement to pass the username and password parameters  to query
            PreparedStatement LoginQuery= con.prepareStatement("select user_name from TM_USER where user_name= ? and Password= ?");
            
            LoginQuery.setString(1,UserName);
            LoginQuery.setString(2,PassWord);
            
            //storing the resukt in result
            ResultSet result=LoginQuery.executeQuery();
            
            //On Successfull data as of now,Showing a message, but redirect to home_page.
            if(result.next()){
            
                messageFrame.setVisible(true);
                messageFrame.setSize(600,600);
                messageFrame.setLayout(null);
                
                label4= new JLabel("Welcome "+ result.getString(1)+" You have sucessfully Loged In");
                
                label4.setForeground(Color.blue);
                label4.setFont(new Font("Arail",Font.BOLD,30));
                label4.setBounds(60,100,400,40);   
            }
            else {
                JOptionPane.showMessageDialog(null, "Incorrect Details... Try again");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Error happend while laoding the drivers");
        } catch (SQLException e) {
            
            System.out.println("Error happend while connecting to TMS DB");
        }
    }
    
    public static void main(String [] args) {
        new LoginPage();
    }
}
