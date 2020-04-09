package T.Sang;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class MyFrame{

    public MyFrame() {
        initComponents();
    }
    
    static JFrame frame = new JFrame();
    Panel p1 = new Panel();
    Panel p2 = new Panel();
    Label lbl1 = new Label("Mã Sinh Viên");
    Label lbl2 = new Label("Họ và tên");
    TextField tf1 = new TextField();
    TextField tf2 = new TextField();
    Font Arial = new Font("Arial", Font.BOLD, 40);
    
    private void initComponents() {
        p1.setBounds(0, 0, 2000, 200);
        p1.setLayout(null);
        p1.add(lbl1);
        p1.add(lbl2);
        p1.add(tf1);
        p1.add(tf2);
        p1.setBackground(Color.cyan);
        
        p2.setBackground(Color.blue);
        
        lbl1.setBounds(50, 50, 250, 50);
        lbl1.setFont(Arial);
        
        lbl2.setBounds(50, 100, 250, 50);
        lbl2.setFont(Arial);
        
        tf1.setBounds(100, 50, 550, 50);
        tf1.setFont(Arial);
        
        tf2.setBounds(100, 100, 550, 50);
        tf2.setFont(Arial);
        
        frame.add(p1);
        frame.add(p2);
        
        frame.setLayout(null);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    
    public static void main(String[] args) {
        new MyFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
