package tuan3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JFrameQuestion1 extends JFrame{

    public JFrameQuestion1() {
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
        
        pTop.add(tfdNumb1);
        pTop.add(tfdNumb2);
        pTop.add(lbl);
        pTop.add(rbtnCong);
        pTop.add(rbtnTru);
        pTop.add(rbtnNhan);
        pTop.add(rbtnChia);
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
        tfdNumb1.setFont(Arial);
        tfdNumb1.setBounds(iWinHeight/5, iWinWitdh/5, 200, 50);
        
        tfdNumb1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent key){
                if (key.getKeyCode() == KeyEvent.VK_ENTER) {
                    tfdNumb2.requestFocus();
                }
            }
        });
//        text field number 2
        tfdNumb2.setFont(Arial);
        tfdNumb2.setBounds(iWinHeight/2, iWinWitdh/5, 200, 50);
        
        tfdNumb2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent key) {
                if (key.getKeyCode() == KeyEvent.VK_ENTER) {
                    
                }
            }
        });
        
//        Button group
        rbtnCong.setBounds(iWinHeight/6, iWinWitdh/3, 200, 50);
        rbtnTru.setBounds(iWinHeight/3, iWinWitdh/3, 200, 50);
        rbtnNhan.setBounds(iWinHeight/6, iWinWitdh/2, 200, 50);
        rbtnChia.setBounds(iWinHeight/3, iWinWitdh/2, 200, 50);
        
        rbtnCong.setFont(Arial);
        rbtnTru.setFont(Arial);
        rbtnNhan.setFont(Arial);
        rbtnChia.setFont(Arial);
        
        grpbtn.add(rbtnCong);
        grpbtn.add(rbtnTru);
        grpbtn.add(rbtnNhan);
        grpbtn.add(rbtnChia);
//        End
    }
    
//    
    private void actionbtnExit() {
        JFrameMain frame = new JFrameMain();
        frame.setVisible(true);
        setVisible(false);
    }
    
    private void actionbtnDelete(){
        tfdNumb1.setText("");
        tfdNumb2.setText("");
        tfdNumb1.requestFocus();
        lbl.setText("Nhập 2 số nguyên, xuất tổng, hiệu, tích, thương.");
    }
    
    private void actionbtnSol(){
        Q.setiNumbOne( Integer.parseInt(tfdNumb1.getText()) );
        Q.setiNumbTwo( Integer.parseInt(tfdNumb2.getText()) );
        
        if (rbtnCong.isSelected()) {
            lbl.setText( String.valueOf(Q.sum()) );
        }
        if (rbtnTru.isSelected()) {
            lbl.setText( String.valueOf(Q.difference()) );
        }
        if (rbtnNhan.isSelected()) {
            lbl.setText( String.valueOf(Q.product()) );
        }
        if (rbtnChia.isSelected()) {
            lbl.setText( String.valueOf(Q.quotient()) );
        }
    }
    
//    
    public static void main(String[] args){
        new JFrameQuestion1().setVisible(true);
    }
//    
    
//    Đừng cố mà thay đổi
    private int iWinHeight = 1280;
    private int iWinWitdh  = 640;
    private Question1 Q = new Question1();
    private Font Arial = new Font("Arial", Font.BOLD, 30);
    private JPanel pTop = new JPanel();
    private JPanel pBot = new JPanel();
    private JButton btnDelete = new JButton("Xóa tất cả số");
    private JButton btnExit = new JButton("Thoát");
    private JLabel lbl = new JLabel("Nhập 2 số nguyên, xuất tổng, hiệu, tích, thương.");
    private JTextField tfdNumb1 = new JTextField();
    private JTextField tfdNumb2 = new JTextField();
    private JRadioButton rbtnCong = new JRadioButton("Cộng");
    private JRadioButton rbtnTru = new JRadioButton("Trừ");
    private JRadioButton rbtnNhan = new JRadioButton("Nhân");
    private JRadioButton rbtnChia = new JRadioButton("Chia");
    private ButtonGroup grpbtn = new ButtonGroup();
    private JButton btnSol = new JButton("Tính");
//    End.
}
