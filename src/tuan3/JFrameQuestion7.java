package tuan3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JFrameQuestion7 extends JFrame{

    public JFrameQuestion7() {
        initComponents();
    }
    
    private void initComponents() {
//        JFrame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(iWinHeight, iWinWitdh);
        setLocation(50, 0);
        setLayout(null);
        
        add(pTop);
        add(pBot);
        
//        Buttons
        buttons[0] = new JButton("tổng của chúng");
        buttons[1] = new JButton("là số chẵn và tổng của chúng");
        buttons[2] = new JButton("Là số lẻ và tổng của chúng");        
        buttons[3] = new JButton("Là số nguyên tố <=N và tổng của chúng");
        buttons[4] = new JButton("N số nguyên tố đầu tiên");
        
        for (int i = 0 ; i < 5 ; i++){
            buttons[i].setFont(Arial);
        }
        
        pButtons.setLayout(new GridLayout(3, 3));
        pButtons.setBounds(0, iWinWitdh/2, iWinHeight, 180);
        
        for (int i = 0 ; i < 5 ; i++){
            pButtons.add( buttons[i] );
        }
        
        for (int i = 0 ; i < 5 ; i++){
            int iKey = i;
            buttons[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    txtArea.setText( getNumb_Export(iKey) );
                }
            });
        }
//        text area
        txtArea.setFont(Arial);
        txtArea.setBounds(0, iWinWitdh/4, iWinHeight-20, 150);

//        JPanel top
        pTop.setBounds(0, 0, iWinHeight, 500);
        pTop.setLayout(null);
        
        pTop.add(tfdNumb);
        pTop.add(lbl);
        pTop.add(pButtons);
        pTop.add(txtArea);
        
//        JPanel bottom
        pBot.setBounds(0, 500, iWinHeight, 100);
        pBot.setLayout(new GridLayout(1, 2));
        
        pBot.add(btnDelete);
        pBot.add(btnExit);
        
//        Button Exit
        btnExit.setFont(Arial);
        
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                actionbtnExit();
            }
        });
        
//        Button Delete
        btnDelete.setFont(Arial);
        
        btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                actionbtnDelete();
            }
        });
        

//        label
        lbl.setFont(Arial);
        lbl.setBounds(iWinHeight/10, iWinWitdh/100, iWinHeight, 100);
        
//        text field number 1
        tfdNumb.setFont(Arial);
        tfdNumb.setBounds(iWinHeight/9, iWinWitdh/9, 200, 50);
        
        tfdNumb.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent key){
                if (key.getKeyCode() == KeyEvent.VK_ENTER) {
                }
            }
        });
        
//        End
    }
    
//    
    private void actionbtnExit() {
        JFrameMain frame = new JFrameMain();
        frame.setVisible(true);
        setVisible(false);
    }
    
    public String getNumb_Export(int ikey) {
        String string = "";
        int tong = 0 , count = 0, cols = 20;
        
        if ( !Q.isInteger( tfdNumb.getText()) ) 
            return null;
        
        Q.setiNumber( Integer.parseInt( tfdNumb.getText() ) );
        
        int N = Q.getiNumber();
        
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
    
    private void actionbtnDelete(){
        tfdNumb.setText("");
        txtArea.setText("");
        tfdNumb.requestFocus();
        lbl.setText(strTieuDe);
    }
    
//    
    public static void main(String[] args){
        new JFrameQuestion7().setVisible(true);
    }
//    
    
//    Đừng cố mà thay đổi
    private int iWinHeight = 1280;
    private int iWinWitdh  = 640;
    private String strTieuDe = "Nhập số tự nhiên N, xuất ra các số tự nhiên <=N và";
    private Question7 Q = new Question7();
    private Font Arial = new Font("Arial", Font.BOLD, 30);
    private JPanel pTop = new JPanel();
    private JPanel pBot = new JPanel();
    private JButton btnDelete = new JButton("Xóa tất cả số");
    private JButton btnExit = new JButton("Thoát");
    private JLabel lbl = new JLabel(strTieuDe);
    private JTextField tfdNumb = new JTextField();
    private JPanel pButtons = new JPanel();
    private JButton[] buttons = new JButton[5];
    private TextArea txtArea = new TextArea();
//    End.
}
