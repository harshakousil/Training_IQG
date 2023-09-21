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
import javax.swing.JToolBar;

public class AdminPanel extends JFrame {
    private BorderLayout layoutMain = new BorderLayout();
    private JPanel panelCenter = new JPanel();
    private JMenuBar menuBar = new JMenuBar();
    private JMenu menuFile = new JMenu();
    private JMenuItem menuFileExit = new JMenuItem();
    private JToolBar toolBar = new JToolBar();
    private JButton buttonOpen = new JButton();
    private JButton buttonClose = new JButton();
    private JButton buttonHelp = new JButton();
    private ImageIcon imageOpen = new ImageIcon(AdminPanel.class.getResource("openfile.gif"));
    private ImageIcon imageClose = new ImageIcon(AdminPanel.class.getResource("closefile.gif"));
    private ImageIcon imageHelp = new ImageIcon(AdminPanel.class.getResource("help.gif"));
    private JLabel jLabel1 = new JLabel();
    private JLabel jLabel2 = new JLabel();
    private JButton jButton1 = new JButton();
    private JButton jButton2 = new JButton();
    private JButton jButton3 = new JButton();
    private JButton jButton4 = new JButton();
    private JButton jButton5 = new JButton();

    public AdminPanel() {
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
        this.setTitle( "AdminPanel" );
        menuFile.setText( "File" );
        menuFileExit.setText( "Exit" );
        menuFileExit.addActionListener( new ActionListener() { public void actionPerformed( ActionEvent ae ) { fileExit_ActionPerformed( ae ); } } );
        buttonOpen.setToolTipText( "Open File" );
        buttonOpen.setIcon( imageOpen );
        buttonClose.setToolTipText( "Close File" );
        buttonClose.setIcon( imageClose );
        buttonHelp.setToolTipText( "About" );
        buttonHelp.setIcon( imageHelp );
        jLabel1.setText("Admin");
        jLabel1.setBounds(new Rectangle(170, 5, 70, 35));
        jLabel1.setFont(new Font("Tahoma", 1, 18));
        jLabel2.setText("--Manege Users--");
        jLabel2.setBounds(new Rectangle(25, 30, 150, 40));
        jLabel2.setFont(new Font("Tahoma", 0, 13));
        jButton1.setText("Search User");
        jButton1.setBounds(new Rectangle(40, 75, 100, 20));
        jButton2.setText("Add User");
        jButton2.setBounds(new Rectangle(40, 110, 100, 20));
        jButton3.setText("Remove User");
        jButton3.setBounds(new Rectangle(40, 145, 100, 20));
        jButton4.setText("Edit User");
        jButton4.setBounds(new Rectangle(40, 180, 100, 20));
        jButton5.setText("Change password");
        jButton5.setBounds(new Rectangle(255, 195, 120, 20));
        menuFile.add( menuFileExit );
        menuBar.add( menuFile );
        toolBar.add( buttonOpen );
        toolBar.add( buttonClose );
        toolBar.add( buttonHelp );
        this.getContentPane().add( toolBar, BorderLayout.NORTH );
        panelCenter.add(jButton5, null);
        panelCenter.add(jButton4, null);
        panelCenter.add(jButton3, null);
        panelCenter.add(jButton2, null);
        panelCenter.add(jButton1, null);
        panelCenter.add(jLabel2, null);
        panelCenter.add(jLabel1, null);
        this.getContentPane().add( panelCenter, BorderLayout.CENTER );
    }

    void fileExit_ActionPerformed(ActionEvent e) {
        System.exit(0);
    }
}
