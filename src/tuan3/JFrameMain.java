package tuan3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JFrameMain extends JFrame{

    public JFrameMain() {
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
        
//      panel buttons and  buttons
        pButton.setLayout(new GridLayout(2, 4));
        pButton.setBounds(0, iWinWitdh/7, iWinHeight, 400);
        
        for (int i=0 ; i <8 ; i++) {
            btnQuestion[i] = new JButton("Question "+(i+1));
        }
        
        for (int i=0 ; i <8 ; i++) {
            pButton.add( btnQuestion[i] );
        }
        
        for (int i=0 ; i <8 ; i++) {
            int iKey = i;
            
            btnQuestion[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    actionButtons(iKey);
                }
            });
        }
        
//        JPanel top
        pTop.setBounds(0, 0, iWinHeight, 500);
        pTop.setLayout(null);
        
        pTop.add(lbl);
        pTop.add(pButton);
        
//        JPanel bottom
        pBot.setBounds(0, 500, iWinHeight, 100);
        pBot.setLayout(new GridLayout(1, 1));
        
        pBot.add(btnExit);
        
//        Button Exit
        btnExit.setFont(Arial);
        
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                actionbtnExit();
            }
        });

//        label
        lbl.setFont(Arial);
        lbl.setBounds(iWinHeight/5, iWinWitdh/100, iWinHeight, 100);
        

//        End
    }
    
    private void actionButtons (int iKey) {
        switch (iKey) {
            case 0:
                JFrameQuestion1 frame = new JFrameQuestion1();
                frame.setVisible(true);
                setVisible(false);
                break;
//            case 1:
//                JFrameQuestion1 frame = new JFrameQuestion1();
//                frame.setVisible(true);
//                setVisible(false);
//                break;
//            case 2:
//                JFrameQuestion1 frame = new JFrameQuestion1();
//                frame.setVisible(true);
//                setVisible(false);
//                break;
//            case 3:
//                JFrameQuestion1 frame = new JFrameQuestion1();
//                frame.setVisible(true);
//                setVisible(false);
//                break;
//            case 4:
//                JFrameQuestion1 frame = new JFrameQuestion1();
//                frame.setVisible(true);
//                setVisible(false);
//                break;
//            case 5:
//                JFrameQuestion1 frame = new JFrameQuestion1();
//                frame.setVisible(true);
//                setVisible(false);
//                break;
//            case 6:
//                JFrameQuestion1 frame = new JFrameQuestion1();
//                frame.setVisible(true);
//                setVisible(false);
//                break;
//            case 7:
//                JFrameQuestion1 frame = new JFrameQuestion1();
//                frame.setVisible(true);
//                setVisible(false);
//                break;
        }
    }
    
    private void actionbtnExit() {
        System.exit(0);
    }
    
    public static void main(String[] args){
        new JFrameMain().setVisible(true);
    }
    
//    Đừng cố mà thay đổi
    private int iWinHeight = 1280;
    private int iWinWitdh  = 640;
    private Question1 Q = new Question1();
    private Font Arial = new Font("Arial", Font.BOLD, 30);
    private JPanel pTop = new JPanel();
    private JPanel pBot = new JPanel();
    private JButton btnExit = new JButton("Thoát");
    private JLabel lbl = new JLabel("JAVA SWING");
    private JButton[] btnQuestion = new JButton[8];
    private JPanel pButton = new JPanel();
    
//    End.
}
