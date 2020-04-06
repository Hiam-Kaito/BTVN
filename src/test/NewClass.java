package test;

import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;

public class NewClass {
    public static void main(String[] args) {
        JFrame f = new JFrame("tne de tai");
        JButton btn = new JButton();
        
        btn.setBackground(Color.yellow);
        btn.setText("hello wolerw");
        btn.setBounds(50,50,200,200);
        f.setTitle("chao mnungbaga");
        f.setSize(500,500);
        f.setVisible(true);
        f.getContentPane().setBackground(Color.blue);
        f.add(btn);
        f.setLayout(null);
        
        ///nam giua man hinh
        f.setLocationRelativeTo(null);
    }
}
