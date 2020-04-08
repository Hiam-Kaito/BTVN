package tuan1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class InterfaceQuestion7 {
    JTextField tfTop ;
    Question7 Q;
     
    public InterfaceQuestion7() {
        JFrame frame = new JFrame("Question 7");
        Q = new Question7();
        Font Arial = new Font("Arial",Font.BOLD,20);
        
        Panel pTop = new Panel();
        Label lblTop = new Label("Nhập số tự nhiên N, xuất ra các số tự nhiên <=N và");
        tfTop = new JTextField();
        
        Panel pDisplay = new Panel();
        TextArea txtareaDisplay = new TextArea("0");
        
        //  a. Các số tự nhiên <=N và tổng của chúng
        //  b. Các số tự nhiên chẵn <=N và tổng của chúng
        //  c. Các số tự nhiên lẻ <=N và tổng của chúng
        //  d. Các số tự nhiên là số nguyên tố <=N và tổng của chúng
        //  e. N số nguyên tố đầu tiên
        Panel pButtons = new Panel();
        JButton[] buttons = new JButton[5];
        buttons[0] = new JButton("tổng của chúng");
        buttons[1] = new JButton("là số chẵn và tổng của chúng");
        buttons[2] = new JButton("Là số lẻ và tổng của chúng");        
        buttons[3] = new JButton("Là số nguyên tố <=N và tổng của chúng");
        buttons[4] = new JButton("N số nguyên tố đầu tiên");
        
        Panel pBottom = new Panel();
        JButton btnExit = new JButton("Trở về");
                
        ////////////////////////////////////////
        lblTop.setFont(Arial);
        tfTop.setFont(Arial);
        txtareaDisplay.setFont(Arial);
        for (int i = 0 ; i < 5 ; i++){
            buttons[i].setFont(Arial);
        }
        btnExit.setFont(Arial);
        /////////////////////////////////////////
        
        frame.setLayout(new GridLayout(4, 1));
        frame.add(pTop);
        frame.add(pDisplay);
        frame.add(pButtons);
        frame.add(pBottom);
        
        pTop.add(lblTop);
        pTop.add(tfTop);
        pTop.setBackground(Color.ORANGE);
        pTop.setLayout(new GridLayout(2, 1));
        
        pDisplay.setBackground(Color.CYAN);
        pDisplay.setLayout(new GridLayout(1,1));
        pDisplay.add(txtareaDisplay);
        
        pButtons.setLayout(new GridLayout(2, 3));
        pButtons.setBackground(Color.yellow);
        for (int i = 0 ; i < 5 ; i++){
            pButtons.add( buttons[i] );
        }
        
        pBottom.add(btnExit);
        pBottom.setLayout(new GridLayout(1, 1));
        
        ///////////////////////////////////////////
        buttons[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String string = getNumb_Export(0);
                txtareaDisplay.setText(string);
            }
        });
        buttons[1].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String string = getNumb_Export(1);
                txtareaDisplay.setText(string);
            }
        });
        buttons[2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String string = getNumb_Export(2);
                txtareaDisplay.setText(string);
            }
        });
        buttons[3].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String string = getNumb_Export(3);
                txtareaDisplay.setText(string);
            }
        });
        buttons[4].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String string = getNumb_Export(4);
                txtareaDisplay.setText(string);
            }
        });
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frame.setVisible(false);
                InterfaceMain A = new InterfaceMain();
            }
        });
        ///////////////////////////////////////////
        frame.setVisible(true);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public String getNumb_Export(int ikey) {
        String string = "";
        int tong = 0 , count = 0, cols = 20;
        int N = Q.getiNumber();
        
        Q.setiNumber( Integer.parseInt( tfTop.getText() ) );
        
        if ( ikey == 4 ) {
            
            for (int i=0 ; count <= N ; i++) {
                
                if ( Q.isPrimeNumber(i) ) {
                    string = string.concat(String.valueOf(i));
                    string = string.concat(" ");
                    count++;
                    if ( count%cols == 0) {
                       string = string.concat("\n");
                    }
                }
                
            }
        }
        else {
            for (int i = 1 ; i <= N ; i++){
                
                switch (ikey){
                    case 0:
                        string = string.concat(String.valueOf(i));
                        string = string.concat(" ");
                        tong = tong + i;
                        count++;
                        if ( count%cols == 0) {
                            string = string.concat("\n");
                        }
                        break;
                    case 1:
                        if ( Q.isEvenNumber(i) ) {
                            string = string.concat(String.valueOf(i));
                            string = string.concat(" ");
                            tong = tong + i;
                            count++;
                            if ( count%cols == 0) {
                                string = string.concat("\n");
                            }
                        }
                        break;
                    case 2:
                        if ( !Q.isEvenNumber(i) ) {
                            string = string.concat(String.valueOf(i));
                            string = string.concat(" ");
                            tong = tong + i;
                            count++;
                            if ( count%cols == 0) {
                                string = string.concat("\n");
                            }
                        }
                        
                        break;
                    case 3:
                        if ( Q.isPrimeNumber(i) ) {
                            string = string.concat(String.valueOf(i));
                            string = string.concat(" ");
                            tong = tong + i;
                            count++;
                            if ( count%cols == 0) {
                                string = string.concat("\n");
                            }
                        }
                        break;
                }
            }
            
            string = string.concat("\nVa tong: "+tong);
        
        }

        return string;
    }
}
