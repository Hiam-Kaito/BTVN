package T.Sang;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class MyFrame{

    public MyFrame() {
        initComponents();
    }
    
    JFrame frame = new JFrame();
    Panel p1 = new Panel();
    Panel p2 = new Panel();
//    Panel p3 = new Panel();
    
    private void initComponents() {
        p1.setBounds(0, 0, 50, 50);
        p2.setBounds(50, 50, 50, 50);

        p1.setBackground(Color.yellow);
        p2.setBackground(Color.blue);
        
        frame.add(p1);
        frame.add(p2);
        
        frame.setLayout(null);
        frame.setSize(500, 500);
        
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        new MyFrame();
    }
}
