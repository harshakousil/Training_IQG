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
import javax.swing.JTextField;
import javax.swing.JToolBar;

public class AdminRemoveUserPanel extends JFrame {
    private BorderLayout layoutMain = new BorderLayout();
    private JPanel panelCenter = new JPanel();
    private JMenuBar menuBar = new JMenuBar();
    private JMenu menuFile = new JMenu();
    private JMenuItem menuFileExit = new JMenuItem();
    private JToolBar toolBar = new JToolBar();
    private JButton buttonOpen = new JButton();
    private JButton buttonClose = new JButton();
    private JButton buttonHelp = new JButton();
    private ImageIcon imageOpen = new ImageIcon(AdminRemoveUserPanel.class.getResource("openfile.gif"));
    private ImageIcon imageClose = new ImageIcon(AdminRemoveUserPanel.class.getResource("closefile.gif"));
    private ImageIcon imageHelp = new ImageIcon(AdminRemoveUserPanel.class.getResource("help.gif"));
    private JLabel jLabel1 = new JLabel();
    private JLabel jLabel2 = new JLabel();
    private JTextField jTextField1 = new JTextField();
    private JButton jButton1 = new JButton();

    public AdminRemoveUserPanel() {
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
        this.setTitle( "AdminRemoveUserPanel" );
        menuFile.setText( "File" );
        menuFileExit.setText( "Exit" );
        menuFileExit.addActionListener( new ActionListener() { public void actionPerformed( ActionEvent ae ) { fileExit_ActionPerformed( ae ); } } );
        buttonOpen.setToolTipText( "Open File" );
        buttonOpen.setIcon( imageOpen );
        buttonClose.setToolTipText( "Close File" );
        buttonClose.setIcon( imageClose );
        buttonHelp.setToolTipText( "About" );
        buttonHelp.setIcon( imageHelp );
        jLabel1.setText("Remove User");
        jLabel1.setBounds(new Rectangle(130, 0, 135, 35));
        jLabel1.setFont(new Font("Tahoma", 1, 18));
        jLabel2.setText("Username :");
        jLabel2.setBounds(new Rectangle(65, 60, 85, 30));
        jLabel2.setFont(new Font("Tahoma", 0, 13));
        jTextField1.setBounds(new Rectangle(155, 65, 100, 20));
        jButton1.setText("Delete");
        jButton1.setBounds(new Rectangle(215, 105, 75, 21));
        menuFile.add( menuFileExit );
        menuBar.add( menuFile );
        toolBar.add( buttonOpen );
        toolBar.add( buttonClose );
        toolBar.add( buttonHelp );
        this.getContentPane().add( toolBar, BorderLayout.NORTH );
        panelCenter.add(jButton1, null);
        panelCenter.add(jTextField1, null);
        panelCenter.add(jLabel2, null);
        panelCenter.add(jLabel1, null);
        this.getContentPane().add( panelCenter, BorderLayout.CENTER );
    }

    void fileExit_ActionPerformed(ActionEvent e) {
        System.exit(0);
    }
}
