package tuan1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class InterfaceQuestion2 {
    
    Question2 Q = new Question2();
    JTextField tfLength = new JTextField();
    JTextField tfWitdh = new JTextField();    
        
    public void main() {
        
        JFrame frame = new JFrame("eQuestion 2");
        Panel pTop = new Panel();
        Panel pBottom = new Panel();
        Panel pDisplay = new Panel();
        Panel pMiddle = new Panel();
        JTextField tfRes = new JTextField("0");
        JButton btnCV = new JButton("Chu vi");
        JButton btnDT = new JButton("Diện tích");
        JButton btnExit = new JButton("Trở lai");
        Label lblText = new Label("Nhập chiều dài, chiều rộng hình chữ nhật");
        Label lblLength = new Label("Chiều dài"); 
        Label lblWitdh = new Label("Chiều rộng"); 
        Label lblRes = new Label("Kết quả"); 
        
        
        lblText.setForeground(Color.DARK_GRAY);
        lblText.setFont(new Font("Arial",Font.BOLD,40));
        lblLength.setFont(new Font("Arial",Font.BOLD,40));
        lblWitdh.setFont(new Font("Arial",Font.BOLD,40));
        lblRes.setFont(new Font("Arial",Font.BOLD,40));
        tfLength.setFont(new Font("Arial",Font.BOLD,40));
        tfWitdh.setFont(new Font("Arial",Font.BOLD,40));
        tfRes.setFont(new Font("Arial",Font.BOLD,40));
        
        
        frame.add(pTop);
        frame.add(pDisplay);
        frame.add(pMiddle);
        frame.add(pBottom);
        
        pTop.add(lblText);
        pDisplay.add(lblLength);
        pDisplay.add(lblWitdh);
        pDisplay.add(lblRes);
        pDisplay.add(tfLength);
        pDisplay.add(tfWitdh);
        pDisplay.add(tfRes);
        pMiddle.add(btnCV);
        pMiddle.add(btnDT);
        pBottom.add(btnExit);
        
        frame.setLayout(new GridLayout(4, 0) ); 
        pDisplay.setLayout(new GridLayout(2, 3));
        pMiddle.setLayout(new GridLayout(1, 2));
        pBottom.setLayout(new GridLayout(1, 1));
        
        
        pTop.setBackground(Color.CYAN);
        
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frame.setVisible(false);
                InterfaceMain A = new InterfaceMain();
                A.main();
            }
        });
        
        btnCV.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                getNumb();
                lblRes.setText("Chu vi");
                tfRes.setText( String.valueOf( Q.circumference() ) );
            }
        });
        
        btnDT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                getNumb();
                lblRes.setText("Dien Tich");
                tfRes.setText( String.valueOf( Q.area() ) );
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
        frame.setLocationRelativeTo(null);
    }
    
    private void getNumb() {
        Q.setiLength(Integer.parseInt( tfLength.getText() ) );
        Q.setiWitdh(Integer.parseInt( tfWitdh.getText() ) );
    }
    
}
