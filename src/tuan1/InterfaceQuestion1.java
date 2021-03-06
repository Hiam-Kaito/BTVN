package tuan1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class InterfaceQuestion1 {
    
    Question1 Q = new Question1();
    JTextField tfNumb1 = new JTextField();
    JTextField tfNumb2 = new JTextField();    
    JFrame frame = new JFrame("eQuestion 1");
    Panel pTop = new Panel();
    Panel pBottom = new Panel();
    Panel pDisplay = new Panel();
    Panel pMiddle = new Panel();
    JTextField tfRes = new JTextField("0");
    JButton btnCong = new JButton("Cộng");
    JButton btnTru = new JButton("Trừ");
    JButton btnNhan = new JButton("Nhân");
    JButton btnChia = new JButton("Chia");
    JButton btnExit = new JButton("Trở lai");
    Label lblText = new Label("Nhập 2 số nguyên, xuất tổng, hiệu, tích, thương.");
    Label lblNumb1 = new Label("Số thứ 1"); 
    Label lblNumb2 = new Label("Số thứ 2"); 
    Label lblRes = new Label("Kết quả"); 
    Font Arial = new Font("Arial",Font.BOLD,40);
        
    public InterfaceQuestion1() {       
        lblText.setForeground(Color.DARK_GRAY);
        lblText.setFont(Arial);
        lblNumb1.setFont(Arial);
        lblNumb2.setFont(Arial);
        lblRes.setFont(Arial);
        tfNumb1.setFont(Arial);
        tfNumb2.setFont(Arial);
        tfRes.setFont(Arial);
        
        frame.add(pTop);
        frame.add(pDisplay);
        frame.add(pMiddle);
        frame.add(pBottom);
        
        pTop.add(lblText);
        pDisplay.add(lblNumb1);
        pDisplay.add(lblNumb2);
        pDisplay.add(lblRes);
        pDisplay.add(tfNumb1);
        pDisplay.add(tfNumb2);
        pDisplay.add(tfRes);
        pMiddle.add(btnCong);
        pMiddle.add(btnTru);
        pMiddle.add(btnNhan);
        pMiddle.add(btnChia);
        pBottom.add(btnExit);
        
        frame.setLayout(new GridLayout(4, 0) ); 
        pDisplay.setLayout(new GridLayout(2, 3));
        pMiddle.setLayout(new GridLayout(2, 4));
        pBottom.setLayout(new GridLayout(1, 1));
        
        
        pTop.setBackground(Color.CYAN);
        
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frame.setVisible(false);
                InterfaceMain A = new InterfaceMain();
            }
        });
        
        btnCong.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                getNumb();
                lblRes.setText("Tong");
                tfRes.setText( String.valueOf( Q.sum() ) );
            }
        });
        
        btnTru.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                getNumb();
                lblRes.setText("Hieu");
                tfRes.setText( String.valueOf( Q.difference()) );
            }
        });
        
        btnNhan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                getNumb();
                lblRes.setText("Tich");
                tfRes.setText( String.valueOf( Q.product()) );
            }
        });
        
        btnChia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                getNumb();
                lblRes.setText("Thuong");
                tfRes.setText( String.valueOf( Q.quotient() ) );
            }
        });
        
        tfNumb1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if ( e.getKeyCode() == 10 ) {
                    tfNumb2.requestFocus();
                }
            }
        });

        //full mang hinh
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        //tat khi su dung
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //hien thi
        frame.setVisible(true); 
    }
    
    private void getNumb() {
        Q.setiNumbOne( Integer.parseInt( tfNumb1.getText() ) );
        Q.setiNumbTwo( Integer.parseInt( tfNumb2.getText() ) );
    }
    
}
