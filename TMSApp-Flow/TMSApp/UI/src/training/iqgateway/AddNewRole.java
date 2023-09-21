package training.iqgateway;

import java.awt.Dimension;

import java.awt.Rectangle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import training.iqgateway.business.AdminOperations;
import training.iqgateway.business.impl.AdminOperationsImpl;
import training.iqgateway.entities.RoleEO;

public class AddNewRole extends JFrame {
    private JTextField roleNameTxtFld = new JTextField();
    private JLabel jLabel1 = new JLabel();
    private JLabel jLabel2 = new JLabel();
    private JTextField roleDescTxtFld = new JTextField();
    private JButton jButton1 = new JButton();

    public AddNewRole() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.getContentPane().setLayout( null );
        this.setSize( new Dimension(400, 300) );
        this.setTitle( "Add New Role" );
        roleNameTxtFld.setBounds(new Rectangle(170, 30, 160, 35));
        jLabel1.setText("RoleName");
        jLabel1.setBounds(new Rectangle(15, 25, 160, 35));
        jLabel2.setText("Role Description");
        jLabel2.setBounds(new Rectangle(15, 75, 160, 35));
        roleDescTxtFld.setBounds(new Rectangle(170, 80, 160, 35));
        jButton1.setText("Add Role");
        jButton1.setBounds(new Rectangle(155, 170, 90, 20));
        jButton1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    jButton1_actionPerformed(e);
                }
            });
     
        this.getContentPane().add(jButton1, null);
        this.getContentPane().add(roleDescTxtFld, null);
        this.getContentPane().add(jLabel2, null);
        this.getContentPane().add(jLabel1, null);
        this.getContentPane().add(roleNameTxtFld, null);
    }

    private void jButton1_actionPerformed(ActionEvent e) {
        // Step 1 Gather the Data from the UI Elements 
        String enteredRoleName = roleNameTxtFld.getText();
        String enteredRoleDescription = roleDescTxtFld.getText();
        
        // Step 2 Create an Entity Object 
        RoleEO roleEORef = new RoleEO(enteredRoleName, enteredRoleDescription);
        
        // Step 3 Invoke the Business Operation From Business Layer
        AdminOperations adminOpers = new AdminOperationsImpl();
        String result  = adminOpers.addNewRole(roleEORef);
        
        if(result != null) {
            JOptionPane.showMessageDialog(this, "Role Add with " + result);
        }
    }
}
