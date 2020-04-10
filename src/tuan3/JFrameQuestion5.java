package tuan3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JFrameQuestion5 extends JFrame{

    public JFrameQuestion5() {
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
        
//        JPanel top
        pTop.setBounds(0, 0, iWinHeight, 500);
        pTop.setLayout(null);
        
        pTop.add(tfdRadius);
        pTop.add(lbl);
        pTop.add(btnSol);
        
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
        
//        Button solution
        btnSol.setFont(Arial);
        btnSol.setBounds(iWinHeight/2, iWinWitdh/3, 200, 50);

        btnSol.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                actionbtnSol();
            }
        });

//        label
        lbl.setFont(Arial);
        lbl.setBounds(iWinHeight/5, iWinWitdh/100, iWinHeight, 100);
        
//        text field number 1
        tfdRadius.setFont(Arial);
        tfdRadius.setBounds(iWinHeight/5, iWinWitdh/5, 200, 50);
        
        tfdRadius.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent key){
                if (key.getKeyCode() == KeyEvent.VK_ENTER) {
                    actionbtnSol();
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
    
    private void actionbtnDelete(){
        tfdRadius.setText("");
        tfdRadius.requestFocus();
        lbl.setText(strTieuDe);
    }
    
    private boolean actionbtnSol(){
        if ( !Q.isInteger( tfdRadius.getText()) ) 
            return false;
        Q.setiNumber( Integer.parseInt(tfdRadius.getText()) );
        
        if ( Q.getiNumber() == 0) {
            lbl.setText("Là số Zero");
        }
        else {
            if ( Q.isPosiNumber() ) {
                lbl.setText("Là số dương");
            }
            else {
                lbl.setText("Là số âm");
            } 
        }
        return true;
    }
    
//    
    public static void main(String[] args){
        new JFrameQuestion5().setVisible(true);
    }
//    
    
//    Đừng cố mà thay đổi
    private int iWinHeight = 1280;
    private int iWinWitdh  = 640;
    private String strTieuDe = "Nhập số nguyên N.";
    private Question5 Q = new Question5();
    private Font Arial = new Font("Arial", Font.BOLD, 30);
    private JPanel pTop = new JPanel();
    private JPanel pBot = new JPanel();
    private JButton btnDelete = new JButton("Xóa tất cả số");
    private JButton btnExit = new JButton("Thoát");
    private JLabel lbl = new JLabel(strTieuDe);
    private JTextField tfdRadius = new JTextField();
    private JButton btnSol = new JButton("Kiểm tra");
//    End.
}
