package T.Sang;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author nguyen thanh sang
 */
public  class  clsGiaoDien implements ActionListener{
    private JFrame f;
    JButton[] buttons; // khai báo mảng button
    JButton[] btntitle;
    JTextField[] textfields;
    public clsGiaoDien()
    {
        init();
    }
    
    public void init()
    {
        f=new JFrame();
        f.setSize(400,400);
        f.setLayout(null);
        
        
        
        
        JPanel content=CreatePanel_SinhVien();
        content.setBounds(0, 100, 500, 250);
        f.add(content);
        
        
        
        
        f.setVisible(true);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
     public JPanel CreatePanel_SinhVien() {
        JPanel pSinhVien = new JPanel();
        buttons = new JButton[5];
        textfields=new JTextField[5];
        String[] arrSinhVien = {"Mã SV", "Họ Tên"} ;       
        pSinhVien.setLayout(null);
        int toadoxButton=0,toadoyButton=10;
        int toadoxTextField=130, toadoyTextField=10;
        for(int i=0;i<arrSinhVien.length; i++)
        {
            buttons [i] = new JButton(arrSinhVien[i]); //khỡi tạo đối tượng thuộc Jbutton
            buttons [i].setBounds(toadoxButton, toadoyButton, 120, 30); //đinh vị trí cho từng đối tượng button
            buttons [i].setHorizontalAlignment(JButton.RIGHT); // canh phải cho text button
            buttons[i].setName("btn"+i);
            System.out.println(buttons [i]);
            pSinhVien.add(buttons [i]);
            toadoyButton=toadoyButton+35;
            
            textfields[i]=new JTextField();
            textfields [i].setBounds(toadoxTextField, toadoyTextField, 180, 30);
            pSinhVien.add(textfields[i]);
            toadoyTextField=toadoyTextField+35;
            buttons[i].addActionListener((ActionListener) this);
        }
        return pSinhVien; 
    }
    
    public void actionPerformed(ActionEvent e)
    {
      JButton src = (JButton) e.getSource();
      System.out.println(e);
      //if(src.getName().equals("btnclose"))
        //    {
        //        System.out.println("Ban đang nhấn btnclose");
        //    }
      //else
        for (int i = 0; i < buttons.length; i++) 
        {
            if (src==buttons[i]) 
            {
                System.out.println(src.getName());
            }
        }
        for (int i = 0; i < buttons.length; i++) 
        {
            if(src.getName().equals("btn0"))
            {
                System.out.println("Ban đang nhấn vào button 0");
                break;
            }
            else if(src.getName().equals("btn1"))
            {
                 System.out.println("Ban đang nhấn vào button 1");
                 break;
            }
           else if(src.getName().equals("btn2"))
            {
                 System.out.println("Ban đang nhấn btn2");
                 break;
            }
           else if(src.getName().equals("btntitle0"))
           {
               System.out.println("Ban dang nhan cuc tieu");
               break;
           }
           else if(src.getName().equals("btntitle1"))
           {
               System.out.println("Ban dang nhan cuc đại");
               break;
           }
           else if(src.getName().equals("btntitle2"))
           {
               System.out.println("Ban dang nhan close");
              
               break;
           }
        }
    }
    
    public static void main(String[] args) {
        clsGiaoDien VDCB=new clsGiaoDien();
        
    }
}