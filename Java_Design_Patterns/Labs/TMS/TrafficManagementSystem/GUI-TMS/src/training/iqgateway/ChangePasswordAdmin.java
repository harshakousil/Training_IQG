package training.iqgateway;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JToolBar;

public class ChangePasswordAdmin extends JFrame {
    private BorderLayout layoutMain = new BorderLayout();
    private JPanel panelCenter = new JPanel();
    private JMenuBar menuBar = new JMenuBar();
    private JMenu menuFile = new JMenu();
    private JMenuItem menuFileExit = new JMenuItem();
    private JToolBar toolBar = new JToolBar();
    private JButton buttonOpen = new JButton();
    private JButton buttonClose = new JButton();
    private JButton buttonHelp = new JButton();
    private ImageIcon imageOpen = new ImageIcon(ChangePasswordAdmin.class.getResource("openfile.gif"));
    private ImageIcon imageClose = new ImageIcon(ChangePasswordAdmin.class.getResource("closefile.gif"));
    private ImageIcon imageHelp = new ImageIcon(ChangePasswordAdmin.class.getResource("help.gif"));
    private JLabel jLabel1 = new JLabel();
    private JLabel jLabel2 = new JLabel();
    private JLabel jLabel3 = new JLabel();
    private JLabel jLabel4 = new JLabel();
    private JPasswordField jPasswordField1 = new JPasswordField();
    private JPasswordField jPasswordField2 = new JPasswordField();
    private JPasswordField jPasswordField3 = new JPasswordField();
    private JButton jButton1 = new JButton();

    public ChangePasswordAdmin() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void jbInit() throws Exception {
        this.setJMenuBar( menuBar );
        this.getContentPane().setLayout( layoutMain );
        panelCenter.setLayout( null );
        this.setSize( new Dimension(400, 300) );
        this.setTitle( "ChangePasswordAdmin" );
        menuFile.setText( "File" );
        menuFileExit.setText( "Exit" );
        menuFileExit.addActionListener( new ActionListener() { public void actionPerformed( ActionEvent ae ) { fileExit_ActionPerformed( ae ); } } );
        buttonOpen.setToolTipText( "Open File" );
        buttonOpen.setIcon( imageOpen );
        buttonClose.setToolTipText( "Close File" );
        buttonClose.setIcon( imageClose );
        buttonHelp.setToolTipText( "About" );
        buttonHelp.setIcon( imageHelp );
        jLabel1.setText("Change Password");
        jLabel1.setBounds(new Rectangle(120, 15, 195, 25));
        jLabel1.setFont(new Font("Tahoma", 1, 18));
        jLabel2.setText("Old Password :");
        jLabel2.setBounds(new Rectangle(70, 100, 120, 20));
        jLabel2.setFont(new Font("Tahoma", 0, 13));
        jLabel3.setText("New Password :");
        jLabel3.setBounds(new Rectangle(65, 130, 100, 15));
        jLabel3.setFont(new Font("Tahoma", 0, 13));
        jLabel4.setText("Confirm Password  :");
        jLabel4.setBounds(new Rectangle(40, 155, 125, 25));
        jLabel4.setFont(new Font("Tahoma", 0, 13));
        jPasswordField1.setBounds(new Rectangle(175, 125, 100, 20));
        jPasswordField2.setBounds(new Rectangle(175, 95, 100, 20));
        jPasswordField3.setBounds(new Rectangle(175, 155, 100, 20));
        jButton1.setText("Reset Password");
        jButton1.setBounds(new Rectangle(235, 190, 125, 20));
        menuFile.add( menuFileExit );
        menuBar.add( menuFile );
        toolBar.add( buttonOpen );
        toolBar.add( buttonClose );
        toolBar.add( buttonHelp );
        this.getContentPane().add( toolBar, BorderLayout.SOUTH);
        panelCenter.add(jButton1, null);
        panelCenter.add(jPasswordField3, null);
        panelCenter.add(jPasswordField2, null);
        panelCenter.add(jPasswordField1, null);
        panelCenter.add(jLabel4, null);
        panelCenter.add(jLabel3, null);
        panelCenter.add(jLabel2, null);
        panelCenter.add(jLabel1, null);
        this.getContentPane().add(panelCenter, BorderLayout.CENTER);
    }

    void fileExit_ActionPerformed(ActionEvent e) {
        System.exit(0);
    }
}
