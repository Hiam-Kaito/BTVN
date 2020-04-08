package tuan1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class InterfaceQuestion4 {
    
    Question4 Q = new Question4();
    JTextField tfNumb = new JTextField();
        
    public InterfaceQuestion4() {
        
        JFrame frame = new JFrame("eQuestion 4");
        Panel pTop = new Panel();
        Panel pBottom = new Panel();
        Panel pDisplay = new Panel();
        Panel pMiddle = new Panel();
        JTextField tfRes = new JTextField();
        JButton btnCheck = new JButton("Kiểm tra");
        JButton btnExit = new JButton("Trở lai");
        Label lblText = new Label("Nhập số nguyên N kiểm tra và xuất kết quả N là số chẵn/lẻ");
        Label lblNumb = new Label("Số nguyên"); 
        Label lblRes = new Label("Kết quả"); 
        
        
        lblText.setForeground(Color.DARK_GRAY);
        lblText.setFont(new Font("Arial",Font.BOLD,40));
        lblNumb.setFont(new Font("Arial",Font.BOLD,40));
        lblRes.setFont(new Font("Arial",Font.BOLD,40));
        tfNumb.setFont(new Font("Arial",Font.BOLD,40));
        tfRes.setFont(new Font("Arial",Font.BOLD,40));
        
        
        frame.add(pTop);
        frame.add(pDisplay);
        frame.add(pMiddle);
        frame.add(pBottom);
        
        pTop.add(lblText);
        pDisplay.add(lblNumb);
        pDisplay.add(lblRes);
        pDisplay.add(tfNumb);
        pDisplay.add(tfRes);
        pMiddle.add(btnCheck);
        pBottom.add(btnExit);
        
        frame.setLayout(new GridLayout(4, 0) ); 
        pDisplay.setLayout(new GridLayout(2, 2));
        pMiddle.setLayout(new GridLayout(1, 2));
        pBottom.setLayout(new GridLayout(1, 1));
        
        
        pTop.setBackground(Color.CYAN);
        
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frame.setVisible(false);
                InterfaceMain A = new InterfaceMain();
            }
        });
        
        btnCheck.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                getNumb();
                if ( Q.isEvenNumber() )
                    tfRes.setText("Là số chẵn");
                else
                    tfRes.setText("Là số lẽ");
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
        Q.setiNumber( Integer.parseInt(tfNumb.getText() ) );
    }
    
}
