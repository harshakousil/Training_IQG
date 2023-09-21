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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JToolBar;

public class LogInPanel extends JFrame implements ActionListener{
    private BorderLayout layoutMain = new BorderLayout();
    private JPanel panelCenter = new JPanel();
    private JMenuBar menuBar = new JMenuBar();
    private JMenu menuFile = new JMenu();
    private JMenuItem menuFileExit = new JMenuItem();
    private JToolBar toolBar = new JToolBar();
    private JButton buttonOpen = new JButton();
    private JButton buttonClose = new JButton();
    private JButton buttonHelp = new JButton();
    private ImageIcon imageOpen = new ImageIcon(LogInPanel.class.getResource("openfile.gif"));
    private ImageIcon imageClose = new ImageIcon(LogInPanel.class.getResource("closefile.gif"));
    private ImageIcon imageHelp = new ImageIcon(LogInPanel.class.getResource("help.gif"));
    private JLabel jLabel1 = new JLabel();
    private JLabel jLabel2 = new JLabel();
    private JLabel jLabel3 = new JLabel();
    private JTextField jTextField1 = new JTextField();
    private JPasswordField jPasswordField1 = new JPasswordField();
    private JButton jButton1 = new JButton();
    private JButton jButton2 = new JButton();

    public LogInPanel() {
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
        this.setTitle( "LogInPanel" );
        menuFile.setText( "File" );
        menuFileExit.setText( "Exit" );
        menuFileExit.addActionListener( new ActionListener() { public void actionPerformed( ActionEvent ae ) { fileExit_ActionPerformed( ae ); } } );
        buttonOpen.setToolTipText( "Open File" );
        buttonOpen.setIcon( imageOpen );
        buttonClose.setToolTipText( "Close File" );
        buttonClose.setIcon( imageClose );
        buttonHelp.setToolTipText( "About" );
        buttonHelp.setIcon( imageHelp );
        jLabel1.setText("Traffic Management System Login");
        jLabel1.setBounds(new Rectangle(35, 5, 325, 30));
        jLabel1.setFont(new Font("Tahoma", 1, 18));
        jLabel2.setText("Username :");
        jLabel2.setBounds(new Rectangle(70, 75, 85, 20));
        jLabel2.setFont(new Font("Tahoma", 0, 14));
        jLabel3.setText("Password :");
        jLabel3.setBounds(new Rectangle(75, 110, 70, 25));
        jLabel3.setFont(new Font("Tahoma", 0, 14));
        jTextField1.setBounds(new Rectangle(155, 75, 100, 20));
        jPasswordField1.setBounds(new Rectangle(155, 110, 100, 20));
        jButton1.setText("Login");
        jButton1.setBounds(new Rectangle(190, 165, 75, 21));
        jButton2.setText("Reset");
        jButton2.setBounds(new Rectangle(75, 165, 75, 21));
        menuFile.add( menuFileExit );
        menuBar.add( menuFile );
        toolBar.add( buttonOpen );
        toolBar.add( buttonClose );
        toolBar.add( buttonHelp );
        this.getContentPane().add( toolBar, BorderLayout.NORTH );
        this.getContentPane().add( panelCenter, BorderLayout.CENTER);
        panelCenter.add(jButton2, null);
        panelCenter.add(jButton1, null);
        panelCenter.add(jPasswordField1, null);
        panelCenter.add(jTextField1, null);
        panelCenter.add(jLabel3, null);
        panelCenter.add(jLabel2, null);
        panelCenter.add(jLabel1, null);
        jButton1.addActionListener(this);
        jButton2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                jTextField1.setText("");
                jPasswordField1.setText("");
            }
        });
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        String username =  jTextField1.getText();
        String Password =   jPasswordField1.getText();
        if(username.equals("saikrishna") &&Password.equals("Krishna")){
            JOptionPane.showMessageDialog(LogInPanel.this,"Log In Success");
        }
                else {
                    JOptionPane.showMessageDialog(LogInPanel.this,"Invalid Username or password");
                }
        System.out.println("Button Clicked");
    }
    void fileExit_ActionPerformed(ActionEvent e) {
        System.exit(0);
    }
    public static void main(String[] args) {
       new LogInPanel();
       
    }
}
