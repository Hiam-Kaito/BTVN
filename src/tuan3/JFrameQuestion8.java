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
        
//        label 
        lbl.setFont(Arial);
        lbl.setBounds(0, 0, 300, 50);
        
//        text field
        tfdNumb.setFont(Arial);
        tfdNumb.setBounds(300, 5, 100, 50);
                
//        Arrays
        Random rand = new Random();
        for (int i=0 ; i<10 ; i++) {
            int iKey = rand.nextInt(9);
            btnArrays[i] = new JButton();
            btnArrays[i].setText( String.valueOf(iKey) );
            btnArrays[i].setFont(Arial);
        }
        
//        Panel Arrays
        pArrays.setBounds(0, 100, 1280, 320);
        pArrays.setBackground(Color.cyan);
        pArrays.setLayout(new GridLayout(2, iCols));
        
        for (int i=0 ; i<10 ; i++) {
            pArrays.add( btnArrays[i] );
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
        pButtons.setBounds(0, 420, 1280, 280);
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
        btnList[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                for (int i=0 ; i <10 ; i++) {
                    btnArrays[i].setVisible(false);
                }
                
                iCols = Integer.parseInt(tfdNumb.getText());
                pArrays.setLayout(new GridLayout(iCols, iCols));
                
                for (int i=0 ; i <10 ; i++) {
                    btnArrays[i].setVisible(true);
                }
                
            }
        });
                
//        End
    }
    
    
    
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
    JButton[] btnArrays = new JButton[100];
    int iCols = 5;
//    End.
}
