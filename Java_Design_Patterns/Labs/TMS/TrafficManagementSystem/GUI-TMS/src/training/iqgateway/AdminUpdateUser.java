package training.iqgateway;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;

public class AdminUpdateUser extends JFrame {
    private BorderLayout layoutMain = new BorderLayout();
    private JPanel panelCenter = new JPanel();
    private JMenuBar menuBar = new JMenuBar();
    private JMenu menuFile = new JMenu();
    private JMenuItem menuFileExit = new JMenuItem();
    private JToolBar toolBar = new JToolBar();
    private JButton buttonOpen = new JButton();
    private JButton buttonClose = new JButton();
    private JButton buttonHelp = new JButton();
    private ImageIcon imageOpen = new ImageIcon(AdminUpdateUser.class.getResource("openfile.gif"));
    private ImageIcon imageClose = new ImageIcon(AdminUpdateUser.class.getResource("closefile.gif"));
    private ImageIcon imageHelp = new ImageIcon(AdminUpdateUser.class.getResource("help.gif"));
    private JLabel jLabel1 = new JLabel();
    private JLabel jLabel2 = new JLabel();
    private JLabel jLabel3 = new JLabel();
    private JLabel jLabel4 = new JLabel();
    private JComboBox jComboBox1 = new JComboBox();
    private JComboBox jComboBox2 = new JComboBox();
    private JTextField jTextField1 = new JTextField();
    private JButton jButton1 = new JButton();

    public AdminUpdateUser() {
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
        this.setSize(new Dimension(389, 300));
        this.setTitle( "AdminUpdateUser" );
        menuFile.setText( "File" );
        menuFileExit.setText( "Exit" );
        menuFileExit.addActionListener( new ActionListener() { public void actionPerformed( ActionEvent ae ) { fileExit_ActionPerformed( ae ); } } );
        buttonOpen.setToolTipText( "Open File" );
        buttonOpen.setIcon( imageOpen );
        buttonClose.setToolTipText( "Close File" );
        buttonClose.setIcon( imageClose );
        buttonHelp.setToolTipText( "About" );
        buttonHelp.setIcon( imageHelp );
        jLabel1.setText("Update User");
        jLabel1.setBounds(new Rectangle(140, 15, 135, 25));
        jLabel1.setFont(new Font("Tahoma", 1, 18));
        jLabel2.setText("Username :");
        jLabel2.setBounds(new Rectangle(50, 60, 70, 30));
        jLabel2.setFont(new Font("Tahoma", 0, 13));
        jLabel3.setText("Role :");
        jLabel3.setBounds(new Rectangle(50, 90, 45, 35));
        jLabel3.setFont(new Font("Tahoma", 0, 13));
        jLabel4.setText("New Role :");
        jLabel4.setBounds(new Rectangle(50, 130, 85, 20));
        jLabel4.setFont(new Font("Tahoma", 0, 13));
        jComboBox1.setBounds(new Rectangle(125, 95, 115, 20));
        jComboBox1.addItem("RTO OFFICER");
        jComboBox1.addItem("CLERK");
        jComboBox1.addItem("COP");
        jComboBox1.addItem("ADMIN");
        jComboBox2.setBounds(new Rectangle(125, 130, 115, 20));
        jComboBox2.addItem("RTO OFFICER");
        jComboBox2.addItem("CLERK");
        jComboBox2.addItem("COP");
        jComboBox2.addItem("ADMIN");
        jTextField1.setBounds(new Rectangle(125, 65, 115, 20));
        jButton1.setText("Update");
        jButton1.setBounds(new Rectangle(205, 175, 75, 21));
        menuFile.add( menuFileExit );
        menuBar.add( menuFile );
        toolBar.add( buttonOpen );
        toolBar.add( buttonClose );
        toolBar.add( buttonHelp );
        this.getContentPane().add( toolBar, BorderLayout.NORTH );
        panelCenter.add(jButton1, null);
        panelCenter.add(jTextField1, null);
        panelCenter.add(jComboBox2, null);
        panelCenter.add(jComboBox1, null);
        panelCenter.add(jLabel4, null);
        panelCenter.add(jLabel3, null);
        panelCenter.add(jLabel2, null);
        panelCenter.add(jLabel1, null);
        this.getContentPane().add( panelCenter, BorderLayout.CENTER );
    }

    void fileExit_ActionPerformed(ActionEvent e) {
        System.exit(0);
    }
}
