package oe;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class OrderEntryMDIFrame extends JFrame {
    private BorderLayout layoutMain = new BorderLayout();
    private JDesktopPane desktopPane = new JDesktopPane();
    private JMenuBar menuBar = new JMenuBar();
    private JLabel statusBar = new JLabel();
    private JMenu Order = new JMenu();
    private JMenuItem jMenuItem1 = new JMenuItem();
    private JMenuItem jMenuItem2 = new JMenuItem();
    private JMenuItem jMenuItem3 = new JMenuItem();
    private JMenuItem jMenuItem4 = new JMenuItem();
    private JMenuItem jMenuItem5 = new JMenuItem();
    private JMenuItem jMenuItem6 = new JMenuItem();

    public OrderEntryMDIFrame() {
        try {
            jbInit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        OrderEntryFrame iFrame = new OrderEntryFrame();
                        iFrame.setVisible(true);
                        desktopPane.add(iFrame);

    }

    private void jbInit() throws Exception {
        this.setJMenuBar( menuBar );
        this.getContentPane().setLayout( layoutMain );
        desktopPane.setLayout( null );
        this.setSize( new Dimension(700, 500) );
        this.setTitle( "Order Entry Application" );
        statusBar.setText( "" );
        Order.setText("Menu");
        jMenuItem1.setText("New");
        jMenuItem2.setText("Open");
        jMenuItem3.setText("Save");
        jMenuItem4.setText("Close");
        jMenuItem5.setText("<Separator>");
        jMenuItem6.setText("Print");
        Order.add(jMenuItem1);
        Order.add(jMenuItem2);
        Order.add(jMenuItem3);
        Order.add(jMenuItem4);
        Order.add(jMenuItem5);
        Order.add(jMenuItem6);
        menuBar.add(Order);
        this.getContentPane().add(statusBar, BorderLayout.SOUTH);
        this.getContentPane().add(desktopPane, BorderLayout.CENTER);
    }

    void fileExit_ActionPerformed(ActionEvent e) {
        System.exit(0);
    }
}
