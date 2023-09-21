package training.iqgateway;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;

public class RtoOfficerPanel extends JFrame {
    private BorderLayout layoutMain = new BorderLayout();
    private JPanel panelCenter = new JPanel();
    private JMenuBar menuBar = new JMenuBar();
    private JMenu menuFile = new JMenu();
    private JMenuItem menuFileExit = new JMenuItem();
    private JToolBar toolBar = new JToolBar();
    private JButton buttonOpen = new JButton();
    private JButton buttonClose = new JButton();
    private JButton buttonHelp = new JButton();
    private ImageIcon imageOpen = new ImageIcon(RtoOfficerPanel.class.getResource("openfile.gif"));
    private ImageIcon imageClose = new ImageIcon(RtoOfficerPanel.class.getResource("closefile.gif"));
    private ImageIcon imageHelp = new ImageIcon(RtoOfficerPanel.class.getResource("help.gif"));
    private JLabel jLabel1 = new JLabel();
    private JLabel jLabel2 = new JLabel();
    private JLabel jLabel3 = new JLabel();
    private JLabel jLabel4 = new JLabel();
    private JButton jButton1 = new JButton();
    private JButton jButton2 = new JButton();
    private JLabel jLabel5 = new JLabel();
    private JButton jButton3 = new JButton();
    private JButton jButton4 = new JButton();
    private JLabel jLabel6 = new JLabel();

    public RtoOfficerPanel() {
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
        this.setSize(new Dimension(492, 456));
        this.setTitle( "RtoOfficerPanel" );
        menuFile.setText( "File" );
        menuFileExit.setText( "Exit" );
        menuFileExit.addActionListener( new ActionListener() { public void actionPerformed( ActionEvent ae ) { fileExit_ActionPerformed( ae ); } } );
        buttonOpen.setToolTipText( "Open File" );
        buttonOpen.setIcon( imageOpen );
        buttonClose.setToolTipText( "Close File" );
        buttonClose.setIcon( imageClose );
        buttonHelp.setToolTipText( "About" );
        buttonHelp.setIcon( imageHelp );
        jLabel1.setText("RTO");
        jLabel1.setBounds(new Rectangle(195, 5, 115, 30));
        jLabel1.setFont(new Font("Tahoma", 1, 18));
        jLabel2.setText("Traffic Management Logo");
        jLabel2.setBounds(new Rectangle(115, 20, 260, 50));
        jLabel2.setFont(new Font("Tahoma", 1, 18));
        jLabel3.setText("jLabel3");
        jLabel3.setBounds(new Rectangle(-130, 60, 34, 14));
        jLabel4.setText("--Vehicle Details --");
        jLabel4.setBounds(new Rectangle(30, 80, 155, 30));
        jLabel4.setFont(new Font("Tahoma", 1, 13));
        jButton1.setText("jButton1");
        jButton1.setBounds(new Rectangle(75, 125, 75, 21));
        jButton2.setText("jButton2");
        jButton2.setBounds(new Rectangle(75, 155, 75, 21));
        jLabel5.setText("-- Owner Details --");
        jLabel5.setBounds(new Rectangle(30, 210, 125, 20));
        jLabel5.setFont(new Font("Tahoma", 1, 13));
        jButton3.setText("jButton3");
        jButton3.setBounds(new Rectangle(75, 245, 75, 21));
        jButton4.setText("jButton4");
        jButton4.setBounds(new Rectangle(75, 280, 75, 21));
        jLabel6.setText("jLabel6");
        jLabel6.setBounds(new Rectangle(325, 95, 34, 14));
        menuFile.add( menuFileExit );
        menuBar.add( menuFile );
        toolBar.add( buttonOpen );
        toolBar.add( buttonClose );
        toolBar.add( buttonHelp );
        this.getContentPane().add( toolBar, BorderLayout.NORTH );
        this.getContentPane().add( panelCenter, BorderLayout.CENTER);
        panelCenter.add(jLabel6, null);
        panelCenter.add(jButton4, null);
        panelCenter.add(jButton3, null);
        panelCenter.add(jLabel5, null);
        panelCenter.add(jButton2, null);
        panelCenter.add(jButton1, null);
        panelCenter.add(jLabel4, null);
        panelCenter.add(jLabel3, null);
        panelCenter.add(jLabel2, null);
        panelCenter.add(jLabel1, null);
    }

    void fileExit_ActionPerformed(ActionEvent e) {
        System.exit(0);
    }
}
