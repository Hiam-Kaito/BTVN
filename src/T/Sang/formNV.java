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
        lblHoChieu = new Label("Thông tin Hộ chiếu");
        lblLienHe = new Label("Thông tin liên hệ");
        lblBot = new Label("Thông tin khac");
        lblChucNang = new Label("Công cụ");
        cbbNoiCap = new JComboBox<>();
        cbbNoiCap.setModel(new DefaultComboBoxModel<>(new String[] 
            {"TP.HCM", "Hà Nội", "Vũng tàu", "Nha Trang"}
        ));
        lblNoiCap = new JLabel("Nơi cấp");
        lblCMT = new JLabel("Số CMND");
        tfCMT = new JTextField();
        tfNgayCap = new JTextField();
        lblNgayCap = new JLabel("Ngày cấp");
        pButtonChucNang = new JPanel();
        btnSua = new JButton("Sửa");
        btnThem = new JButton("Thêm");
        btnXoa = new JButton("Xóa");
        pContentLienHe = CreatePanel_LienHe();
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
        lblInfor.setAlignment(Label.CENTER);
        lblInfor.setBackground(TieuDe);
        
        pImage.setBackground(Color.BLACK);
        pImage.setBounds(20, 40, 150, 200);
        
        pContentInfor.setBounds(240, 30, 390, 250);
        
//        panel chuc nang
        pChucNang.setBounds(660, 10, 600, 80);
        pChucNang.setLayout(null);
        pChucNang.setBorder(BorderFactory.createLineBorder(TieuDe));

        pChucNang.add(lblChucNang);
        pChucNang.add(pButtonChucNang);
        
        lblChucNang.setBounds(0, 0, 600, 20);
        lblChucNang.setFont(Arial);
        lblChucNang.setAlignment(java.awt.Label.CENTER);
        lblChucNang.setBackground(TieuDe);
        
        pButtonChucNang.setBounds(10, 30, 580, 40);
        pButtonChucNang.setLayout(new FlowLayout());
        
        pButtonChucNang.add(btnSua);
        pButtonChucNang.add(btnThem);
        pButtonChucNang.add(btnXoa);
        
        btnThem.setFont(Arial);
        btnSua.setFont(Arial);
        btnXoa.setFont(Arial);
        
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
        lblCMND.setAlignment(Label.CENTER);
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
        pHoChieu.setLayout(new BorderLayout());
        
        pHoChieu.add(lblHoChieu, BorderLayout.NORTH);
        
        lblHoChieu.setAlignment(Label.CENTER);
        lblHoChieu.setBackground(TieuDe);
        lblHoChieu.setFont(Arial);
        
//        panel thong tin lien he
        pLienHe.setBounds(10, 320, 1250, 150 );
        pLienHe.setLayout(null);
        pLienHe.setBorder(BorderFactory.createLineBorder(TieuDe));
        
        pLienHe.add(lblLienHe);
        pLienHe.add(pContentLienHe);
        
        lblLienHe.setFont(Arial);
        lblLienHe.setBackground(TieuDe);
        lblLienHe.setBounds(0, 0, 1250, 20);
        lblLienHe.setAlignment(Label.CENTER);
        
        pContentLienHe.setBounds(10, 30, 1230, 115);
        
//        panel thong tin phai cu
        pBot.setBounds(10, 480, 1250, 200);
        pBot.setLayout(null);
        pBot.setBorder(BorderFactory.createLineBorder(TieuDe));
        
        pBot.add(lblBot);
        
        lblBot.setFont(Arial);
        lblBot.setBackground(TieuDe);
        lblBot.setBounds(0, 0, 1250, 20);
        lblBot.setAlignment(Label.CENTER);
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
    
    public JPanel CreatePanel_LienHe() {
        JPanel LienHe = new JPanel();
        list_cbbLienHe = new JComboBox[5];
        list_tfLienHe = new JTextField[5];
        list_lblLienHe = new JLabel[10];
        int iNumbTextField = 3, iNumbComboBox = 3;
        LienHe.setLayout(null);
        
        String[] arr = {"Chỗ ở hiện tại", "Hộ Khẩu HT", "Nơi làm việc"
                , "Thuộc tỉnhh thành", "Thuộc tỉnh thành", "Nơi sinh"};
        int toadoxLabel = 0, toadoyLabel = 0;
        int toadoxFill = 130 , toadoyFill = 0;
        for (int i=0 ; i < iNumbTextField ; i++) {
            list_lblLienHe[i] = new JLabel(arr[i]);
            list_lblLienHe[i].setFont(Arial);
            list_lblLienHe[i].setBounds(toadoxLabel, toadoyLabel, 100, 30);
            
            list_tfLienHe[i] = new JTextField();
            list_tfLienHe[i].setFont(Arial);
            list_tfLienHe[i].setBounds(toadoxFill, toadoyFill, 700, 30);
            
            LienHe.add(list_tfLienHe[i]);
            LienHe.add(list_lblLienHe[i]);
            
            toadoyLabel += 40;
            toadoyFill += 40;
        }
        
        toadoxLabel = 850;
        toadoyLabel = 0;
        toadoxFill = 1000;
        toadoyFill = 0;
        for (int i=0 ; i < iNumbComboBox ; i++) {
            list_lblLienHe[i] = new JLabel(arr[i]);
            list_lblLienHe[i].setFont(Arial);
            list_lblLienHe[i].setBounds(toadoxLabel, toadoyLabel, 100, 30);
            
            list_cbbLienHe[i] = new JComboBox<>();
            list_cbbLienHe[i].setModel(new DefaultComboBoxModel<>(new String[] 
                {"TP.HCM", "Hà Nội", "Vũng tàu", "Nha Trang"}
            ));
            list_cbbLienHe[i].setFont(Arial);
            list_cbbLienHe[i].setBounds(toadoxFill, toadoyFill, 200, 30);
            list_cbbLienHe[i].setBackground(Color.WHITE);
            
            LienHe.add(list_lblLienHe[i]);
            LienHe.add(list_cbbLienHe[i]);
            System.out.println(i);
            toadoyLabel += 40;
            toadoyFill += 40;
        }
        return LienHe;
    }
    
    public static void main(String[] args) {
        new formNV().setVisible(true);
    }
    
//    
    private Font Arial;
    private Color TieuDe;
    private JPanel pInfor, pCMND, pHoChieu, pLienHe, pBot, pImage , pChucNang, pButtonChucNang;
    private Label lblInfor, lblCMND, lblHoChieu, lblLienHe, lblBot, lblChucNang;
    private JPanel pContentInfor,pContentLienHe;
    private ImageIcon image;
    private JLabel[] list_lblInfor, list_lblLienHe; 
    private JTextField[] list_tflInfor, list_tfLienHe;
    private JComboBox<String>[] list_cbbLienHe; 
    private JTextField tfCMT, tfNgayCap;
    private JComboBox<String> cbbNoiCap;
    private JLabel lblNoiCap, lblCMT, lblNgayCap;
    private JButton btnThem, btnSua, btnXoa;
//    private 
//    End.
}
