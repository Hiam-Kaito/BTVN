package T.Sang;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class formNV extends JFrame implements ActionListener{
    
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
        pContentBot = CreatePanel_Bot();
        
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
        
        btnThem.setName("btn them");
        btnXoa.setName("btn xoa");
        btnSua.setName("btn sua");
        
        btnThem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                actionButtonThem();
            }
        });
        
        btnSua.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                actionButtonSua();
            }
        });
        
        btnXoa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                actionButtonXoa();
            }
        });
        
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
        cbbNoiCap.setName("cbbNoiCap");
        cbbNoiCap.addActionListener( (ActionListener) this);
        
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
        pBot.add(pContentBot);
        
        lblBot.setFont(Arial);
        lblBot.setBackground(TieuDe);
        lblBot.setBounds(0, 0, 1250, 20);
        lblBot.setAlignment(Label.CENTER);
        
        pContentBot.setBounds(10, 20, 1230, 175);
    }
    
    private void actionButtonXoa() {
//        to do code here
        System.out.println("button xoa");
    } 
    
    private void actionButtonSua() {
//        to do code here
        System.out.println("button sua");
    } 
    
    private void actionButtonThem() {
//        to do code here
        System.out.println("button them");
    } 
    
    private JPanel CreatePanel_NhanVien() {
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
    
    private JPanel CreatePanel_LienHe() {
        JPanel LienHe = new JPanel();
        list_cbbLienHe = new JComboBox[10];
        list_tfLienHe = new JTextField[10];
        list_lblLienHe = new JLabel[10];
        LienHe.setLayout(null);
        
        String[] arr = {"Chỗ ở hiện tại", "Hộ Khẩu HT", "Nơi làm việc"
                , "Thuộc tỉnh thành", "Thuộc tỉnh thành", "Nơi sinh"};
        
        int iNumbTextField = 3, iNumbComboBox = 3;
        
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
        for (int i=iNumbTextField ; i < iNumbComboBox + iNumbTextField  ; i++) {
            list_lblLienHe[i] = new JLabel(arr[i]);
            list_lblLienHe[i].setFont(Arial);
            list_lblLienHe[i].setBounds(toadoxLabel, toadoyLabel, 150, 30);
            
            list_cbbLienHe[i] = new JComboBox<>();
            list_cbbLienHe[i].setModel(new DefaultComboBoxModel<>(new String[] 
                {"TP.HCM", "Hà Nội", "Vũng tàu", "Nha Trang"}
            ));
            list_cbbLienHe[i].setFont(Arial);
            list_cbbLienHe[i].setBounds(toadoxFill, toadoyFill, 200, 30);
            list_cbbLienHe[i].setBackground(Color.WHITE);
            list_cbbLienHe[i].setName("cbbLienHe "+ (i - iNumbTextField));
            list_cbbLienHe[i].addActionListener( (ActionListener) this);
            
            LienHe.add(list_lblLienHe[i]);
            LienHe.add(list_cbbLienHe[i]);
            
            toadoyLabel += 40;
            toadoyFill += 40;
        }
        return LienHe;
    }
    
    private JPanel CreatePanel_Bot() {
        JPanel Bot = new JPanel();
        list_lblBot = new JLabel[20];
        list_tfBot = new JTextField[20];
        list_cbbBot = new JComboBox[20];
        int iNumbTextField = 5, iNumberComboBox = 5, iCols = 0;
        
        Bot.setLayout(null);
        
        String[] arr = {"Sở thích", "Điểm mạnh", "Điểm yếu", "Nghề hiện tại", "Nghề trước đây"
        , "A", "B", "C", "D", "E","F" ,"G"};
        
        int toadoxLabel = 0, toadoyLabel =0;
        int toadoxFill = 0, toadoyFill = 30;
        
        for (int i=0 ; i < iNumbTextField ; i++) {
            if ( iCols % 4 == 0 && iCols != 0) {
                toadoxLabel = 0;
                toadoxFill = 0;
                toadoyLabel += 55;
                toadoyFill +=  55;
            }
            
            list_lblBot[i] = new JLabel(arr[i]);
            list_lblBot[i].setFont(Arial);
            list_lblBot[i].setBounds(toadoxLabel, toadoyLabel, 150, 30);
            
            list_tfBot[i] = new JTextField();
            list_tfBot[i].setFont(Arial);
            list_tfBot[i].setBounds(toadoxFill, toadoyFill, 200, 30);
            
            Bot.add(list_lblBot[i]);
            Bot.add(list_tfBot[i]);
            
            toadoxLabel += 300;
            toadoxFill  += 300;
            iCols++;
        }
        
        for (int i=iNumbTextField ; i < iNumberComboBox + iNumbTextField ; i++) {
            if ( iCols % 4 == 0 && iCols != 0) {
                toadoxLabel = 0;
                toadoxFill = 0;
                toadoyLabel += 55;
                toadoyFill +=  55;
            }
            
            list_lblBot[i] = new JLabel(arr[i]);
            list_lblBot[i].setFont(Arial);
            list_lblBot[i].setBounds(toadoxLabel, toadoyLabel, 150, 30);
            
            list_cbbBot[i] = new JComboBox<>();
            list_cbbBot[i].setFont(Arial);
            list_cbbBot[i].setBounds(toadoxFill, toadoyFill, 200, 30);
            list_cbbBot[i].setBackground(Color.WHITE);
            list_cbbBot[i].setModel(new DefaultComboBoxModel<>(new String[] 
                {"TP.HCM", "Hà Nội", "Vũng tàu", "Nha Trang"}
            ));
            list_cbbBot[i].setName("cbbBot "+(i-iNumbTextField));
            list_cbbBot[i].addActionListener( (ActionListener) this);
            
            Bot.add(list_lblBot[i]);
            Bot.add(list_cbbBot[i]);
            
            toadoxLabel += 300;
            toadoxFill  += 300;
            iCols++;
        }
        return Bot;
    }
    
    public static void main(String[] args) {
        new formNV().setVisible(true);
    }
    
//    
    private Font Arial;
    private Color TieuDe;
    private JPanel pInfor, pCMND, pHoChieu, pLienHe, pBot, pImage , pChucNang, pButtonChucNang;
    private Label lblInfor, lblCMND, lblHoChieu, lblLienHe, lblBot, lblChucNang;
    private JPanel pContentInfor,pContentLienHe, pContentBot;
    private ImageIcon image;
    private JLabel[] list_lblInfor, list_lblLienHe, list_lblBot;
    private JTextField[] list_tflInfor, list_tfLienHe, list_tfBot;
    private JComboBox<String>[] list_cbbLienHe, list_cbbBot; 
    private JTextField tfCMT, tfNgayCap;
    private JComboBox<String> cbbNoiCap;
    private JLabel lblNoiCap, lblCMT, lblNgayCap;
    private JButton btnThem, btnSua, btnXoa;
//    private 
//    End.

    @Override
    public void actionPerformed(ActionEvent ae) {
        JComboBox<String> src = (JComboBox) ae.getSource();
        
        String str = String.valueOf( src.getSelectedItem() );
        
        if (src.getName().equals("cbbNoiCap")) System.out.println("cbbNoiCap "+str);
        if (src.getName().equals("cbbLienHe 0")) System.out.println("cbbLienHe 1 "+str);
        if (src.getName().equals("cbbLienHe 1")) System.out.println("cbbLienHe 2 "+str);
        if (src.getName().equals("cbbLienHe 2")) System.out.println("cbbLienHe 3 "+str);
        
        for (int i=0 ; i < 5 ; i++) {
            if ( src.getName().equals("cbbBot "+i))
                System.out.println("cbbBot "+ i+ " " + str);
        }
    }
}
