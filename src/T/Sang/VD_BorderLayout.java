package T.Sang;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class VD_BorderLayout extends JFrame{

    public VD_BorderLayout() {
        init();
    }
    
    
    public void init() {
        Arial = new Font("Arial", Font.BOLD, 30);
        ImageIcon imageGa = new ImageIcon("./image/ga.png");
        ImageIcon imageTim1 = new ImageIcon("./image/tim1.png");
        ImageIcon imageTim2 = new ImageIcon("./image/tim3.png");
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JPanel p4 = new JPanel();
        JPanel p5 = new JPanel();
        JLabel lbl21 = new JLabel("Home", imageGa, JLabel.LEFT);
        JLabel lbl22 = new JLabel("Main", imageTim1, JLabel.LEFT);
        JLabel lbl23 = new JLabel("Exit", imageTim2, JLabel.LEFT);
        
        setBounds(0, 0, 1000, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout(5, 5));
        
        add(p1, BorderLayout.NORTH);
        add(p2, BorderLayout.WEST);
        add(p3, BorderLayout.CENTER);
        add(p4, BorderLayout.EAST);
        add(p5, BorderLayout.SOUTH);
//        panel 1
        p1.setBackground(Color.BLACK);
        p1.setPreferredSize(new Dimension(0, 100));
//        panel 2
        p2.setBackground(Color.BLUE);
        p2.setPreferredSize(new Dimension(200, 0));
        p2.setLayout(null);
        
        p2.add(lbl21);
        p2.add(lbl22);
        p2.add(lbl23);
        
        lbl21.setBounds(0, 20, 200, 50);
        lbl21.setFont(Arial);
        lbl21.setOpaque(true);
        lbl21.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("clicked");
            }
        });
        
        lbl22.setBounds(0, 90, 200, 50);
        lbl22.setFont(Arial);
        lbl22.setOpaque(true);
        
        lbl23.setBounds(0, 160, 200, 50);
        lbl23.setFont(Arial);
        lbl23.setOpaque(true);
        
//        panel 3
        p3.setBackground(Color.CYAN);
//        panel 4
        p4.setBackground(Color.GREEN);
        p4.setPreferredSize(new Dimension(100, 0));
//        panel 5
        p5.setBackground(Color.GRAY);
        p5.setPreferredSize(new Dimension(0, 50));
        
    }
    
    public static void main(String[] args) {
        new VD_BorderLayout().setVisible(true);
    }
    
//    
    private Font Arial;
    private ImageIcon imageGa;
    private ImageIcon imageTim1;
    private ImageIcon imageTim2;
    private JPanel p1;
    private JPanel p2;
    private JPanel p3;
    private JPanel p4;
    private JPanel p5;
    private JLabel lbl21;
    private JLabel lbl22;
    private JLabel lbl23;
//    End.
}
