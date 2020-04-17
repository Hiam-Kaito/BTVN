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
        TieuDe = new Color(123, 234, 210);
        pImage = new JPanel();
        Arial = new Font("String", Font.BOLD, 14);
        pInfor = new JPanel();
        pCMND = new JPanel();
        pHoChieu = new JPanel();
        pBot = new JPanel();
        pLienHe = new JPanel();
        pChucNang = new JPanel();
        pContentInfor = CreatePanel_NhanVien();
        lblInfor = new Label("Thông tin cơ bản của nhân viên");
        lblCMND = new Label("Số chứng mình nhân dân");
        cbbNoiCap = new JComboBox<>();
        cbbNoiCap.setModel(new DefaultComboBoxModel<>(new String[] 
            {"TP.HCM", "Hà Nội"}
        ));
        lblNoiCap = new JLabel("Nơi cấp");
        lblCMT = new JLabel("Số CMND");
        tfCMT = new JTextField();
        tfNgayCap = new JTextField();
        lblNgayCap = new JLabel("Ngày cấp");
        
        
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
        add(pChucNang);
//        panel thong tin nhan vien
        pInfor.setBounds(10, 10, 640, 300);
        pInfor.setLayout(null);
        pInfor.setBorder(BorderFactory.createLineBorder(TieuDe));
        
        pInfor.add(pImage);
        pInfor.add(pContentInfor);
        pInfor.add(lblInfor);
        
        lblInfor.setBounds(0, 0, 640, 20);
        lblInfor.setFont(Arial);
        lblInfor.setAlignment(java.awt.Label.CENTER);
        lblInfor.setBackground(TieuDe);
        
        pImage.setBackground(Color.BLACK);
        pImage.setBounds(20, 40, 150, 200);
        
        pContentInfor.setBounds(240, 30, 390, 250);
        
//        panel chuc nang
        pChucNang.setBounds(660, 10, 600, 100);
        pChucNang.setLayout(new FlowLayout());
        pChucNang.setBorder(BorderFactory.createLineBorder(TieuDe));

//        panel chung minh nhan dan
        pCMND.setBounds(660, 100, 600, 100);
        pCMND.setLayout(null);
        pCMND.setBorder(BorderFactory.createLineBorder(TieuDe));
        
        pCMND.add(lblCMND);
        pCMND.add(cbbNoiCap);
        pCMND.add(lblNoiCap);
        pCMND.add(lblCMT);
        pCMND.add(tfCMT);
        pCMND.add(lblNgayCap);
        pCMND.add(tfNgayCap);
        
        lblCMND.setBounds(0, 0, 600, 20);
        lblCMND.setFont(Arial);
        lblCMND.setAlignment(java.awt.Label.CENTER);
        lblCMND.setBackground(TieuDe);
        
        lblNoiCap.setBounds(10, 20, 100, 50);
        lblNoiCap.setFont(Arial);
        
        cbbNoiCap.setBounds(10, 60, 100, 30);
        cbbNoiCap.setFont(Arial);
        cbbNoiCap.setBackground(Color.WHITE);
        
        lblCMT.setFont(Arial);
        lblCMT.setBounds(170, 20, 100, 50);
        
        tfCMT.setFont(Arial);
        tfCMT.setBounds(170, 60, 100, 30);
        
        lblNgayCap.setFont(Arial);
        lblNgayCap.setBounds(330, 20, 100, 50);
        
        tfNgayCap.setFont(Arial);
        tfNgayCap.setBounds(330, 60, 100, 30);
        
//        panel thong tin hop dong va ho chieu
        pHoChieu.setBounds(660, 210, 600, 100);
        pHoChieu.setBorder(BorderFactory.createLineBorder(TieuDe));
        
//        panel thong tin lien he
        pLienHe.setBounds(10, 320, 1250, 150 );
        
        pLienHe.setBorder(BorderFactory.createLineBorder(TieuDe));
        
//        panel thong tin phai cu
        pBot.setBounds(10, 480, 1250, 200);
        pBot.setBorder(BorderFactory.createLineBorder(TieuDe));
    }
    
    public JPanel CreatePanel_NhanVien() {
        JPanel pNhanVien = new JPanel();
        list_lblInfor = new JLabel[10];
        list_tflInfor=new JTextField[10];
        
        String[] arrNV = {"Tên đầy đủ", "Ngày Sinh", "Giới tính", "Dân Tộc", "Hôn nhân", "Trình độ"};
        
        pNhanVien.setLayout(null);
        
        int toadoxButton=0,toadoyButton=10;
        int toadoxTextField=130, toadoyTextField=10;
        
        for(int i=0;i<arrNV.length; i++) {
            
            list_lblInfor[i] = new JLabel(arrNV[i]);
            
            list_lblInfor[i].setFont(Arial);
            list_lblInfor[i].setBounds(toadoxButton, toadoyButton, 120, 30);
            list_lblInfor[i].setHorizontalAlignment(JButton.LEFT);
            
            list_tflInfor[i]=new JTextField();
            
            list_tflInfor[i].setFont(Arial);
            list_tflInfor [i].setBounds(toadoxTextField, toadoyTextField, 180, 30);
            
            pNhanVien.add(list_lblInfor [i]);
            pNhanVien.add(list_tflInfor[i]);
            
            toadoyButton = toadoyButton + 35;
            toadoyTextField = toadoyTextField + 35;
        }
        return pNhanVien; 
    }
    
    public static void main(String[] args) {
        new formNV().setVisible(true);
    }
    
//    
    private Font Arial;
    private Color TieuDe;
    private JPanel pInfor, pCMND, pHoChieu, pLienHe, pBot, pImage , pChucNang;
    private Label lblInfor, lblCMND, lblHoChieu, lblLienHe, lblBot;
    private JPanel pContentInfor;
    private ImageIcon image;
    private JLabel[] list_lblInfor; 
    private JTextField[] list_tflInfor;
    private JTextField tfCMT, tfNgayCap;
    private JComboBox<String> cbbNoiCap;
    private JLabel lblNoiCap, lblCMT, lblNgayCap;
//    private 
//    End.
}
