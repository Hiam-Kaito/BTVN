package tuan3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class JFrameQuestion8 extends JFrame{
    
    public JFrameQuestion8() {
        initComponents();
    }
    
    private void initComponents() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(50, 0, 1280, 720);
        setLayout(null);
        
        add(pTop);
        add(pArrays);
        add(pButtons);
//        Panel Top
        pTop.setBounds(0, 0, 1280, 100);
        pTop.setBackground(Color.yellow);
        pTop.setLayout(null);
        
        pTop.add(lbl);
        pTop.add(tfdNumb);
        pTop.add(lblRes);
        pTop.add(tfdRes);
        
//        label 
        lbl.setFont(Arial);
        lbl.setBounds(0, 0, 300, 50);
        
        lblRes.setFont(Arial);
        lblRes.setBounds(500, 0, 300, 50);
        
//        text field
        tfdNumb.setFont(Arial);
        tfdNumb.setBounds(300, 5, 100, 50);
        
        tfdRes.setFont(Arial);
        tfdRes.setBounds(650, 5, 100, 50);
                
//        Arrays
        createTextFieldArrays();
        
//        Panel Arrays
        pArrays.setBounds(0, 100, 1280, 430);
        pArrays.setBackground(Color.cyan);
        pArrays.setLayout(null);
        
        for (int i=0 ; i < tfdArrays.length ; i++) {
            pArrays.add( tfdArrays[i] );
        }

//        buttons
        btnList[0] = new JButton("Tổng của chúng");
        btnList[1] = new JButton("Chẵn của mảng a");
        btnList[2] = new JButton("Lẻ của mảng a");
        btnList[3] = new JButton("Là số nguyên tố");
        btnList[4] = new JButton("Thêm 1 phần tử");
        btnList[5] = new JButton("Xoá phần tử");
        btnList[6] = new JButton("Tìm số");
        
        for (int i=0 ; i < 7 ; i++) {
            btnList[i].setFont(Arial);
        }
        
//        Panel buttons
        pButtons.setBounds(0, 530, 1280, 150);
        pButtons.setBackground(Color.black);
        pButtons.setLayout(new GridLayout(3, 2));
        
        for (int i=0 ; i <7 ; i++) {
            pButtons.add( btnList[i] );
        }
        
        pButtons.add(btnDelete);
        pButtons.add(btnExit);
        
//        button delete and exit
        btnDelete.setFont(Arial);
        btnExit.setFont(Arial);
        
//        button 
        for (int i=0 ; i < tfdArrays.length -1 ; i++) {
            int iNext = i + 1;
            tfdArrays[i].addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent key){
                    if (key.getKeyCode() == KeyEvent.VK_ENTER) {
                        tfdArrays[iNext].requestFocus();
                    }
                }
            });
        }
        
        tfdNumb.addKeyListener(new KeyAdapter() {
            @Override
                public void keyPressed(KeyEvent key){
                    if (key.getKeyCode() == KeyEvent.VK_ENTER) {
                        tfdArrays[0].requestFocus();
                        newBie();
                        addArraysToPanel();
                    }
                }
        });

        btnList[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
               tinhtong();
            }
        });
                
        btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                actionDelete();
            }
        });
//        End
    }
    
//  • ˚ ˚ ˛ ˚ ˛  • ˚ •˛•˚ * 。 • ˚ ˚ ˛ ˚ ˛ • • ˚ ˚ ˛ ˚ ˚ ˛ ˚ ˛ ˚ ˛  ˛ ˚ ˛ • • ˚ ˚ ˛ ˚ ˚ ˛ ˚ ˛  ˛ ˚ ˛ • • ˚ ˚ ˛ ˚ ˚ ˛ ˚ ˛  ˛ ˚ ˛ • • ˚ ˚ ˛ ˚ ˚ ˛ ˚ ˛ 
//  • ˚ ˚ ˛ ˚ ˛  • ˚Happy★* 。 • ˚ ˚ ˛ ˚ ˛ • ˚ ˛ ˛ ˚ ˛    ˛ ˚ ˛ • • ˚ ˚ ˛ ˚ ˚ ˛ ˚ ˛  ˛ ˚ ˛ • • ˚ ˚ ˛ ˚ ˚ ˛ ˚ ˛  ˛ ˚ ˛ • • ˚ ˚ ˛ ˚ ˚ ˛ ˚ ˛ 
// ˚ ˛˚ ˚ ˛ ˚ •˛  ˚ ˛•。★Holidays!★ 。* • ˚•。     • ˚ ˚ ˛ ˚ ˛     ˚ ˛ ˚ ˛  ˚ ˚ ˛ ˚ ˛  ˚ ˛ ˚ ˛  ˚ • ˚ ˚ ˛ ˚ ˚ ˛ ˚ ˛  ˛ ˚ ˛ • • ˚ ˚ ˛ ˚ ˚ ˛
//  • ˚ ˚ ˛ •˚ ˛  ° 。 ° ˛˚˛ *__Π____*。*˚     ˚ ˛ ˚ ˛ ˛ ˚ ˛ • • ˚ ˚ ˛ ˚ ˚ ˛ ˚ ˛  ˚ ˛ • • ˚ ˚ ˛ ˚ ˚ ˛ ˚ ˛  ˛ ˚ ˛ • • ˚ ˚ ˛ ˚ ˚ ˛ ˚ ˛  ˚ ˛ ˚ ˛ 
//   ˚ ˛˚ ˚ ˛ ˚ ˛  ˚ ˛ •˛•˚ */______/~＼。˚ ˚ ˛        ˛ ˚ ˛ • • ˚ ˚ ˛ ˚ ˚ ˛ ˚ ˛  ˛ ˚ ˛ • • ˚ ˚ ˛ ˚ ˚ ˛ ˚ ˛  ˛ ˚ ˛ • • ˚ ˚ ˛ ˚ ˚ ˛ ˚ ˛ 
//  • ˚ ˚ ˛ ˚ ˛   ˚˛• •˛• ˚ ｜ 田田 ｜門｜ ˚        • ˚ ˚ ˛ ˚ ˛   ˛ ˚ ˛ • • ˚ ˚ ˛ ˚ ˚ ˛ ˚ ˛  ˛ ˚ ˛ • • ˚ ˚ ˛ ˚ ˚ ˛ ˚ ˛  ˛ ˚ ˛ • • ˚ ˚ ˛ ˚ ˚ ˛ ˚ ˛  
    
    private void createTextFieldArrays() {
        int toaDoXTextField = 0, toaDoYTextField = 0;
        for (int i=0 ; i<tfdArrays.length ; i++) {
            tfdArrays[i] = new JTextField();
            tfdArrays[i].setFont(Arial);
            tfdArrays[i].setBounds(toaDoXTextField, toaDoYTextField, 60, 60);
            toaDoXTextField +=60;
            if ( (i+1)%20 == 0) {
                toaDoXTextField = 0;
                toaDoYTextField += 60;
            }
        }
    }

    private void newBie() {
        for (int i=0 ; i<tfdArrays.length ; i++) {
            tfdArrays[i].setVisible(false);
        }
                
        int iNumb = Integer.parseInt( tfdNumb.getText() );
        tfdArrays = new JTextField[iNumb];
        createTextFieldArrays();
    }
    
    private void addArraysToPanel () {
        for (int i=0 ; i < tfdArrays.length ; i++) {
            pArrays.add( tfdArrays[i] );
        }
    }
    
    private void actionDelete() {
        newBie();
        tfdNumb.setText(null);
        tfdRes.setText(null);
        tfdNumb.requestFocus();
    }
    
    private void loadArrays() {
        int[] iArrays = new int[tfdArrays.length];
        
        for (int i=0 ; i < tfdArrays.length ; i++) {
            iArrays[i] = Integer.parseInt( tfdArrays[i].getText() );
        }
        
        Q.setiArrays(iArrays);
        Q.setiNumber(iArrays.length);
    }
    
    private void tinhtong() {
        loadArrays();
        tfdRes.setText( String.valueOf(Q.sum()));
    }
    
    
//  • ˚ ˚ ˛ ˚ ˛  • ˚ •˛•˚ * 。 • ˚ ˚ ˛ ˚ ˛ • • ˚ ˚ ˛ ˚ ˚ ˛ ˚ ˛ ˚ ˛  ˛ ˚ ˛ • • ˚ ˚ ˛ ˚ ˚ ˛ ˚ ˛  ˛ ˚ ˛ • • ˚ ˚ ˛ ˚ ˚ ˛ ˚ ˛  ˛ ˚ ˛ • • ˚ ˚ ˛ ˚ ˚ ˛ ˚ ˛ 
//  • ˚ ˚ ˛ ˚ ˛  • ˚Happy★* 。 • ˚ ˚ ˛ ˚ ˛ • ˚ ˛ ˛ ˚ ˛    ˛ ˚ ˛ • • ˚ ˚ ˛ ˚ ˚ ˛ ˚ ˛  ˛ ˚ ˛ • • ˚ ˚ ˛ ˚ ˚ ˛ ˚ ˛  ˛ ˚ ˛ • • ˚ ˚ ˛ ˚ ˚ ˛ ˚ ˛ 
// ˚ ˛˚ ˚ ˛ ˚ •˛  ˚ ˛•。★Holidays!★ 。* • ˚•。     • ˚ ˚ ˛ ˚ ˛     ˚ ˛ ˚ ˛  ˚ ˚ ˛ ˚ ˛  ˚ ˛ ˚ ˛  ˚ • ˚ ˚ ˛ ˚ ˚ ˛ ˚ ˛  ˛ ˚ ˛ • • ˚ ˚ ˛ ˚ ˚ ˛
//  • ˚ ˚ ˛ •˚ ˛  ° 。 ° ˛˚˛ *__Π____*。*˚     ˚ ˛ ˚ ˛ ˛ ˚ ˛ • • ˚ ˚ ˛ ˚ ˚ ˛ ˚ ˛  ˚ ˛ • • ˚ ˚ ˛ ˚ ˚ ˛ ˚ ˛  ˛ ˚ ˛ • • ˚ ˚ ˛ ˚ ˚ ˛ ˚ ˛  ˚ ˛ ˚ ˛ 
//   ˚ ˛˚ ˚ ˛ ˚ ˛  ˚ ˛ •˛•˚ */______/~＼。˚ ˚ ˛        ˛ ˚ ˛ • • ˚ ˚ ˛ ˚ ˚ ˛ ˚ ˛  ˛ ˚ ˛ • • ˚ ˚ ˛ ˚ ˚ ˛ ˚ ˛  ˛ ˚ ˛ • • ˚ ˚ ˛ ˚ ˚ ˛ ˚ ˛ 
//  •
    
    public static void main(String[] args) {
        new JFrameQuestion8().setVisible(true);
    }
    
//    Đừng có mà thay đổi
    Font Arial = new Font("Arial", Font.BOLD, 30);
    String strTieuDe = "Nhập số tự nhiên N:";
    Question8 Q = new Question8();
    JPanel pTop = new JPanel();
    JPanel pArrays = new JPanel();
    JPanel pButtons = new JPanel();
    JButton btnExit = new JButton("Thoát");
    JButton btnDelete = new JButton("Xóa tất cả");
    JButton[] btnList = new JButton[7];
    JLabel lbl = new JLabel(strTieuDe);
    JTextField tfdNumb = new JTextField("10");
    JTextField[] tfdArrays = new JTextField[10];
    JLabel lblRes = new JLabel("kết quả");
    JTextField tfdRes = new JTextField();
//    End.
}
