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

public class Example extends JFrame {
    private BorderLayout layoutMain = new BorderLayout();
    private JPanel panelCenter = new JPanel();
    private JMenuBar menuBar = new JMenuBar();
    private JMenu menuFile = new JMenu();
    private JMenuItem menuFileExit = new JMenuItem();
    private JToolBar toolBar = new JToolBar();
    private JButton buttonOpen = new JButton();
    private JButton buttonClose = new JButton();
    private JButton buttonHelp = new JButton();
    private ImageIcon imageOpen = new ImageIcon(Example.class.getResource("openfile.gif"));
    private ImageIcon imageClose = new ImageIcon(Example.class.getResource("closefile.gif"));
    private ImageIcon imageHelp = new ImageIcon(Example.class.getResource("help.gif"));
    private JLabel jLabel1 = new JLabel();
    private JTextField jTextField1 = new JTextField();

    public Example() {
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
        panelCenter.setFont(new Font("Dialog", 1, 14));
        this.setSize( new Dimension(400, 300) );
        this.setTitle( "Example" );
        menuFile.setText( "File" );
        menuFileExit.setText( "Exit" );
        menuFileExit.addActionListener( new ActionListener() { public void actionPerformed( ActionEvent ae ) { fileExit_ActionPerformed( ae ); } } );
        buttonOpen.setToolTipText( "Open File" );
        buttonOpen.setIcon( imageOpen );
        buttonClose.setToolTipText( "Close File" );
        buttonClose.setIcon( imageClose );
        buttonHelp.setToolTipText( "About" );
        buttonHelp.setIcon( imageHelp );
        jLabel1.setText("Username : ");
        jLabel1.setBounds(new Rectangle(85, 25, 115, 50));
        jLabel1.setFont(new Font("Tahoma", 1, 14));
        jTextField1.setBounds(new Rectangle(175, 40, 75, 20));
        menuFile.add( menuFileExit );
        menuBar.add( menuFile );
        toolBar.add( buttonOpen );
        toolBar.add( buttonClose );
        toolBar.add( buttonHelp );
        this.getContentPane().add( toolBar, BorderLayout.CENTER);
        this.getContentPane().add( panelCenter, BorderLayout.NORTH);
        panelCenter.add(jTextField1, null);
        panelCenter.add(jLabel1, null);
    }

    void fileExit_ActionPerformed(ActionEvent e) {
        System.exit(0);
    }
}
