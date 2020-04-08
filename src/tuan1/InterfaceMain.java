package tuan1;

import java.awt.Panel;
import java.awt.Label;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;

public class InterfaceMain extends JFrame{
    JFrame frame = new JFrame("Main");
    Panel pTop = new Panel();
    Panel pBottom = new Panel();
    Panel pMiddle = new Panel();
    JButton btnQuestion1 = new JButton("Bài 1");
    JButton btnQuestion2 = new JButton("Bài 2");
    JButton btnQuestion3 = new JButton("Bài 3");
    JButton btnQuestion4 = new JButton("Bài 4");
    JButton btnQuestion5 = new JButton("Bài 5");
    JButton btnQuestion6 = new JButton("Bài 6");
    JButton btnQuestion7 = new JButton("Bài 7");
    JButton btnQuestion8 = new JButton("Bài 8");
    JButton btnExit = new JButton("Thoát");
    Label lblText = new Label();
     
    public InterfaceMain() {
        lblText.setText("bài tập chương 0: java căn bản");
        lblText.setForeground(Color.DARK_GRAY);
        lblText.setFont(new Font("Arial",Font.BOLD,50));
        
        //frame.setSize(1280,720);
        frame.setLayout(new GridLayout(3, 1) ); 
        
        frame.add(pTop);
        frame.add(pMiddle);
        frame.add(pBottom);
        
        pTop.add(lblText);
        pMiddle.add(btnQuestion1);
        pMiddle.add(btnQuestion2);
        pMiddle.add(btnQuestion3);
        pMiddle.add(btnQuestion4);
        pMiddle.add(btnQuestion5);
        pMiddle.add(btnQuestion6);
        pMiddle.add(btnQuestion7);
        pMiddle.add(btnQuestion8);
        pBottom.add(btnExit);
        
        pMiddle.setLayout(new GridLayout(2, 4));
        pBottom.setLayout(new GridLayout(1, 1));
        
        pTop.setBackground(Color.CYAN);
        
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });
        
        btnQuestion1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frame.setVisible(false);
                InterfaceQuestion1 A = new InterfaceQuestion1();
            }
        });
        
        btnQuestion2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frame.setVisible(false);
                InterfaceQuestion2 A = new InterfaceQuestion2();
            }
        });
        
        btnQuestion3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frame.setVisible(false);
                InterfaceQuestion3 A = new InterfaceQuestion3();         
            }
        });
        
        btnQuestion4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frame.setVisible(false);
                InterfaceQuestion4 A = new InterfaceQuestion4();                
            }
        });
        
        btnQuestion5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frame.setVisible(false);
                InterfaceQuestion5 A = new InterfaceQuestion5();                
            }
        });
        
        btnQuestion6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frame.setVisible(false);
                InterfaceQuestion6 A = new InterfaceQuestion6();                 
            }
        });
        
        btnQuestion7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frame.setVisible(false);
                InterfaceQuestion7 A = new InterfaceQuestion7();                 
            }
        });
        
        btnQuestion8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //frame.setVisible(false);
                //InterfaceQuestion8 A = new InterfaceQuestion8();                // 
            }
        });
        
        //full mang hinh
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        //xoa bo cac thanh window
        //frame.setUndecorated(true);

        //tat khi su dung
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //hien thi
        frame.setVisible(true); 
        
        ///nam giua man hinh
        //frame.setLocationRelativeTo(null);
    }
    
}
