package tuan3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JFrameQuestion3 extends JFrame{

    public JFrameQuestion3() {
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
        pTop.add(rbtnCV);
        pTop.add(rbtnDT);
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
        
//        Button group
        rbtnCV.setBounds(iWinHeight/6, iWinWitdh/3, 200, 50);
        rbtnDT.setBounds(iWinHeight/6, iWinWitdh/2, 200, 50);
        
        rbtnCV.setFont(Arial);
        rbtnDT.setFont(Arial);
        
        grpbtn.add(rbtnCV);
        grpbtn.add(rbtnDT);
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
        if ( !Q.isNumeric(tfdRadius.getText()) ) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập số", "ERROE", JOptionPane.ERROR_MESSAGE);
            tfdRadius.requestFocus();
            return false;
        }
        Q.setdRadius( Double.parseDouble(tfdRadius.getText()) );
        
        if (rbtnCV.isSelected()) {
            lbl.setText( String.valueOf(Q.circumference()) );
        }
        if (rbtnDT.isSelected()) {
            lbl.setText( String.valueOf(Q.area()) );
        }
        return true;
    }
    
//    
    public static void main(String[] args){
        new JFrameQuestion3().setVisible(true);
    }
//    
    
//    Đừng cố mà thay đổi
    private int iWinHeight = 1280;
    private int iWinWitdh  = 640;
    private String strTieuDe = "Nhập bán kính hình tròn.";
    private Question3 Q = new Question3();
    private Font Arial = new Font("Arial", Font.BOLD, 30);
    private JPanel pTop = new JPanel();
    private JPanel pBot = new JPanel();
    private JButton btnDelete = new JButton("Xóa tất cả số");
    private JButton btnExit = new JButton("Thoát");
    private JLabel lbl = new JLabel(strTieuDe);
    private JTextField tfdRadius = new JTextField();
    private JRadioButton rbtnCV = new JRadioButton("Chu Vi");
    private JRadioButton rbtnDT = new JRadioButton("Diện Tích");
    private ButtonGroup grpbtn = new ButtonGroup();
    private JButton btnSol = new JButton("Tính");
//    End.
}
