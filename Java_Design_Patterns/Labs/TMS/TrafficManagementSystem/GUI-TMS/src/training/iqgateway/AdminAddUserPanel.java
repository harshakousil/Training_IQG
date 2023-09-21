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
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;

public class AdminAddUserPanel extends JFrame {
    private BorderLayout layoutMain = new BorderLayout();
    private JPanel panelCenter = new JPanel();
    private JMenuBar menuBar = new JMenuBar();
    private JMenu menuFile = new JMenu();
    private JMenuItem menuFileExit = new JMenuItem();
    private JToolBar toolBar = new JToolBar();
    private JButton buttonOpen = new JButton();
    private JButton buttonClose = new JButton();
    private JButton buttonHelp = new JButton();
    private ImageIcon imageOpen = new ImageIcon(AdminAddUserPanel.class.getResource("openfile.gif"));
    private ImageIcon imageClose = new ImageIcon(AdminAddUserPanel.class.getResource("closefile.gif"));
    private ImageIcon imageHelp = new ImageIcon(AdminAddUserPanel.class.getResource("help.gif"));
    private JLabel jLabel1 = new JLabel();
    private JList jList1 = new JList();
    private JLabel jLabel2 = new JLabel();
    private JLabel jLabel3 = new JLabel();
    private JLabel jLabel4 = new JLabel();
    private JTextField jTextField1 = new JTextField();
    private JTextField jTextField2 = new JTextField();
    private JComboBox jComboBox1 = new JComboBox();
    private JButton jButton1 = new JButton();

    public AdminAddUserPanel() {
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
        this.setTitle( "AdminAddUserPanel" );
        menuFile.setText( "File" );
        menuFileExit.setText( "Exit" );
        menuFileExit.addActionListener( new ActionListener() { public void actionPerformed( ActionEvent ae ) { fileExit_ActionPerformed( ae ); } } );
        buttonOpen.setToolTipText( "Open File" );
        buttonOpen.setIcon( imageOpen );
        buttonClose.setToolTipText( "Close File" );
        buttonClose.setIcon( imageClose );
        buttonHelp.setToolTipText( "About" );
        buttonHelp.setIcon( imageHelp );
        jLabel1.setText("Add User");
        jLabel1.setBounds(new Rectangle(155, 10, 95, 30));
        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel1.setFont(new Font("Tahoma", 1, 18));
        jList1.setBounds(new Rectangle(70, 65, 0, 0));
        jLabel2.setText("Username :");
        jLabel2.setBounds(new Rectangle(75, 65, 90, 25));
        jLabel2.setFont(new Font("Tahoma", 0, 13));
        jLabel3.setText("Password :");
        jLabel3.setBounds(new Rectangle(75, 110, 85, 25));
        jLabel3.setFont(new Font("Tahoma", 0, 13));
        jLabel4.setText("Assign Role : ");
        jLabel4.setBounds(new Rectangle(70, 150, 95, 20));
        jLabel4.setFont(new Font("Tahoma", 0, 13));
        jTextField1.setBounds(new Rectangle(155, 70, 115, 20));
        jTextField2.setBounds(new Rectangle(155, 115, 115, 20));
        jComboBox1.setBounds(new Rectangle(155, 150, 115, 20));
        jComboBox1.setToolTipText("select role");
        jButton1.setText("Create");
        jButton1.setBounds(new Rectangle(240, 190, 75, 21));
        jComboBox1.addItem("RTO OFFICER");
        jComboBox1.addItem("CLERK");
        jComboBox1.addItem("COP");
        jComboBox1.addItem("ADMIN");
        menuFile.add( menuFileExit );
        menuBar.add( menuFile );
        toolBar.add( buttonOpen );
        toolBar.add( buttonClose );
        toolBar.add( buttonHelp );
        this.getContentPane().add( toolBar, BorderLayout.NORTH );
        this.getContentPane().add( panelCenter, BorderLayout.CENTER);
        panelCenter.add(jButton1, null);
        panelCenter.add(jComboBox1, null);
        panelCenter.add(jTextField2, null);
        panelCenter.add(jTextField1, null);
        panelCenter.add(jLabel4, null);
        panelCenter.add(jLabel3, null);
        panelCenter.add(jLabel2, null);
        panelCenter.add(jList1, null);
        panelCenter.add(jLabel1, null);
    }

    void fileExit_ActionPerformed(ActionEvent e) {
        System.exit(0);
    }
}
