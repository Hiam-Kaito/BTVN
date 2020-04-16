package T.Sang;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class formNV extends JFrame{
    
    public formNV() {
        init();
    }
    
    public void init() {
        image = new ImageIcon("image/Stardew-Valley.jpg");
        pImage = new JPanel();
        Arial = new Font("String", Font.BOLD, 14);
        pInfor = new JPanel();
        pCMND = new JPanel();
        pHoChieu = new JPanel();
        pBot = new JPanel();
        pLienHe = new JPanel();
        pContent = CreatePanel_SinhVien();
        
//        Jframe
        setLayout(null);
        setBounds(50, 0, 1280, 720);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        
        add(pInfor);
        add(pCMND);
        add(pHoChieu);
        add(pLienHe);
        add(pBot);
        
//        panel thong tin nhan vien
        pInfor.setBounds(10, 10, 640, 300);
//        pInfor.setBackground(Color.CYAN);
        pInfor.setLayout(null);
        pInfor.setBorder(BorderFactory.createLineBorder(Color.black));
        
        pInfor.add(pImage);
        pInfor.add(pContent);
        
        pImage.setBackground(Color.BLACK);
        pImage.setBounds(20, 20, 200, 250);
        
        pContent.setBounds(240, 10, 390, 270);
        
        
//        panel chung minh nhan dan
        pCMND.setBounds(660, 10, 600, 100);
//        pCMND.setBackground(Color.BLUE);
        pCMND.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
//        panel thong tin hop dong va ho chieu
        pHoChieu.setBounds(660, 120, 600, 190);
//        pHoChieu.setBackground(Color.ORANGE);
        pHoChieu.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
//        panel thong tin lien he
        pLienHe.setBounds(10, 320, 1250, 150 );
//        pLienHe.setBackground(Color.PINK);
        pLienHe.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
//        panel thong tin phai cu
        pBot.setBounds(10, 480, 1250, 200);
//        pBot.setBackground(Color.yellow);
        pBot.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }
    
    public JPanel CreatePanel_SinhVien() {
        JPanel pSinhVien = new JPanel();
        list_lbl = new JLabel[10];
        textfields=new JTextField[10];
        
        String[] arrSinhVien = {"Tên đầy đủ", "Ngày Sinh", "Giới tính", "Dân Tộc", "Hôn nhân", "Trình độ"}; 
        
        pSinhVien.setLayout(null);
        
        int toadoxButton=0,toadoyButton=10;
        int toadoxTextField=130, toadoyTextField=10;
        
        for(int i=0;i<arrSinhVien.length; i++) {
            
            list_lbl[i] = new JLabel(arrSinhVien[i]);
            
            list_lbl[i].setFont(Arial);
            list_lbl[i].setBounds(toadoxButton, toadoyButton, 120, 30);
            list_lbl[i].setHorizontalAlignment(JButton.LEFT);
            
            pSinhVien.add(list_lbl [i]);
            
            textfields[i]=new JTextField();
            
            textfields[i].setFont(Arial);
            textfields [i].setBounds(toadoxTextField, toadoyTextField, 180, 30);
            pSinhVien.add(textfields[i]);
            
            toadoyButton = toadoyButton + 40;
            toadoyTextField = toadoyTextField + 40;
        }
        return pSinhVien; 
    }
    
    
    
    public static void main(String[] args) {
        new formNV().setVisible(true);
    }
    
//    
    private Font Arial;
    private JPanel pInfor, pCMND, pHoChieu, pLienHe, pBot, pImage;
    private JPanel pContent;
    private ImageIcon image;
    JLabel[] list_lbl; 
    JTextField[] textfields;
//    End.
}
