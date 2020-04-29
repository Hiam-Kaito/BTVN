package tuan5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class JFrameMain extends JFrame{
    
    public JFrameMain() throws Exception {
        init();
    }
    
    public void init() throws Exception {
        qlsv = new QuanLySinhVien();
        Arial = new Font("Arial", Font.BOLD, 15);
        imageAvatar = new ImageIcon("./src/tuan5/avatar.png");
        lblAvatar = new JLabel(imageAvatar);
        pTop = new JPanel();
        pRight = new JPanel();
        pMid = new JPanel();
        pBot = new JPanel();
        btnLeft = new JButton("Left");
        btnRight = new JButton("right");
        lblContent = new JLabel("Quản lý sinh viên");
        model = new DefaultTableModel();
        btnThem = new JButton("Thêm");
        btnXoa = new JButton("Xóa");
        btnSua = new JButton("Sửa");
        btnHienThi = new JButton("Hiện thị");
        pButton = new JPanel();
        pMaSv = createPanel_MaSv();
        pContentMaSv = new JPanel();
        
        String[] arrLeft = {"Sinh viên", "Môn học", "Điểm"};
        pLeft = createPanel_Label(arrLeft,0 , 200);
        
        String[] arrRight = {"Tìm kiếm", "Sắp xếp", "Thống kê"};
        pRight = createPanel_Label(arrRight,0 ,20);
        
        setSize(1280, 640);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setResizable(false);
        
        add(pTop, BorderLayout.NORTH);
        add(pLeft, BorderLayout.WEST);
        add(pMid, BorderLayout.CENTER);
        add(pRight, BorderLayout.EAST);
        add(pBot, BorderLayout.SOUTH);
        
        
        //panel top
        pTop.setBackground(Color.ORANGE);
        pTop.setLayout(null);
        pTop.setPreferredSize(new Dimension(0, 50));
        
        pTop.add(lblContent);
        
        lblContent.setFont(Arial);
        lblContent.setBounds(540, 10, 500, 40);
        
        //panel left
        pLeft.setBackground(Color.PINK);
        pLeft.setPreferredSize(new Dimension(0, 0));
        
        pLeft.add(lblAvatar);
        
        lblAvatar.setBounds(10, 10, 180, 180);

        //panel mid
        pMid.setLayout(new GridLayout(1, 1));
        
       pMid.add(pContentMaSv);
    
        pContentMaSv.add(scrollPanel);
        pContentMaSv.add(pMaSv);
        pContentMaSv.setLayout(null);
        
        scrollPanel.setBounds(50, 10, 1000, 300);
        pMaSv.setBounds(50, 320, 1000, 200);
        table.setModel(new DefaultTableModel(
                new Object[][] {},
                new String[] {"Mã sinh viên","Họ và tên","Ngày sinh","Giới tính","Địa chỉ"}
        ));
        scrollPanel.setViewportView(table);
        
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        
        //panel right
        pRight.setBackground(Color.RED);
        pRight.setPreferredSize(new Dimension(0, 0));
        
        // Panel bot
        pBot.setBackground(Color.yellow);
        pBot.setPreferredSize(new Dimension(0, 50));
        pBot.setLayout(null);
        
        pBot.add(btnLeft);
        pBot.add(btnRight);
        pBot.add(pButton);
        
        btnLeft.setBounds(0, 0, 100, 50);
        btnRight.setBounds(1175, 0, 100, 50);
        
        pButton.setBounds(400, 0, 400, 50);
        pButton.setLayout(new GridLayout(0, 4));
        
        pButton.add(btnThem);
        pButton.add(btnXoa);
        pButton.add(btnSua);
        pButton.add(btnHienThi);
        
        btnLeft.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                actionButtonMenuOff();
                actionButtonMenu(pLeft);
            }
        });
        
        btnRight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                actionButtonMenuOff();
                actionButtonMenu(pRight);
            }
        });
        
        btnThem.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                try {
                    btnThemMouseClicked(evt);
                } catch (Exception ex) {
                    Logger.getLogger(JFrameMain.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        btnXoa.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                try {
                    btnXoaMouseClicked(evt);
                } catch (Exception ex) {
                    Logger.getLogger(JFrameMain.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        btnSua.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                try {
                    btnSuaMouseClicked(evt);
                } catch (Exception ex) {
                    Logger.getLogger(JFrameMain.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        btnHienThi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                actionButtondisplay();
            }
        });
        
    }
        
    private void actionButtonMenu(JPanel Panel) {
        if ( Panel.getSize().width == 0) {
            Panel.setVisible(false);
            Panel.setPreferredSize(new Dimension(200, 0)); 
            Panel.setVisible(true);
        }
        else {
            Panel.setVisible(false);
            Panel.setPreferredSize(new Dimension(0, 0)); 
            Panel.setVisible(true);
       }
    }
    
    private void actionButtonMenuOff() {
        pLeft.setVisible(false);
        pLeft.setPreferredSize(new Dimension(0, 0)); 
        pLeft.setVisible(true);
        
        pRight.setVisible(false);
        pRight.setPreferredSize(new Dimension(0, 0)); 
        pRight.setVisible(true);
    }
    
    private JPanel createPanel_MaSv() {
        JPanel Panel = new JPanel();
        list_lblThongtin = new JLabel[10];
        tfDiachi = new JTextField();
        tfHovaten = new JTextField();
        tfMasv = new JTextField();
        tfNgaySinh = new JTextField();
        cbbGioitinh = new JComboBox<>();
                
        
        Panel.setLayout(null);
        
        String[] arr = {"Mã sinh viên","Họ và tên","Ngày sinh","Giới tính","Địa chỉ"};
        
        int iXLabel = 0, iYLabel = 0;
        for (int i=0 ; i < arr.length ; i++) {
            if (i == 4) {
                iXLabel = 0;
                iYLabel = 90;
            }
            list_lblThongtin[i] = new JLabel(arr[i]);
            list_lblThongtin[i].setFont(Arial);
            list_lblThongtin[i].setBounds(iXLabel, iYLabel, 150, 50);
            
            Panel.add(list_lblThongtin[i]);
            
            iXLabel += 200;
        }
        
        Panel.add(tfDiachi);
        Panel.add(tfHovaten);
        Panel.add(tfMasv);
        Panel.add(tfNgaySinh);
        Panel.add(cbbGioitinh);
        
        tfDiachi.setFont(Arial);
        tfHovaten.setFont(Arial);
        tfMasv.setFont(Arial);
        tfNgaySinh.setFont(Arial);
        
        tfMasv.setBounds(0, 50, 100, 30);
        tfHovaten.setBounds(200, 50, 150, 30);
        tfNgaySinh.setBounds(400, 50, 80, 30);
        tfDiachi.setBounds(0, 140, 500, 30);
        
        cbbGioitinh.setBounds(600, 50, 100, 30);
        cbbGioitinh.setModel(new DefaultComboBoxModel<>(new String[] 
                {"Nam", "Nu", "Khac"}
        ));
        cbbGioitinh.setBackground(Color.WHITE);        
        
        return Panel;
    }
    
    private JPanel createPanel_Label(String[] arr,int iMarginLeft, int iMarginTop) {
        JPanel Panel = new JPanel();
        list_lbl = new JLabel[10];
        imageGa = new ImageIcon("./image/ga.png");
        
        Panel.setLayout(null);
        
        for (int i=0; i < arr.length ; i++) {
            list_lbl[i] = new JLabel(arr[i], imageGa, JLabel.LEFT);
            list_lbl[i].setBounds(iMarginLeft, iMarginTop, 200, 50);
            list_lbl[i].setFont(Arial);
            list_lbl[i].setName(arr[i]);
            list_lbl[i].setOpaque(true);
            
            Panel.add(list_lbl[i]);
            
            iMarginTop += 70;
        }
        
        return Panel;
    }
    
    private void tableMouseClicked(java.awt.event.MouseEvent evt) {
        int  i=table.getSelectedRow();
//        JOptionPane.showMessageDialog(null, "row:"+i);
        tfMasv.setText(table.getModel().getValueAt(i, 0).toString());
        tfHovaten.setText(table.getModel().getValueAt(i, 1).toString());
        tfNgaySinh.setText(table.getModel().getValueAt(i, 2).toString());         
        cbbGioitinh.setSelectedItem(table.getModel().getValueAt(i, 3));
        tfDiachi.setText(table.getModel().getValueAt(i, 4).toString());
    }
     
    private void btnSuaMouseClicked(MouseEvent evt) throws Exception {
        int  iSelect = table.getSelectedRow();
        int iMasv = (int) table.getValueAt( iSelect, 0);
        
        if (iSelect >= 0)
        {
            SinhVien sv = new SinhVien();
            
            sv.setInfor(Integer.parseInt(tfMasv.getText()) , tfHovaten.getText(),
                    Integer.parseInt(tfNgaySinh.getText()) , (String) cbbGioitinh.getSelectedItem(),
                    tfDiachi.getText());
            
            String Query = "UPDATE sinhvien SET "+
                    "MaSV =" + tfMasv.getText() +
                    ", Hovaten = '" + tfHovaten.getText() +
                    "', Ngaysinh = " + tfNgaySinh.getText() + 
                    ", Gioitinh = '" + cbbGioitinh.getSelectedItem() +
                    "', Diachi = '" + tfDiachi.getText() + 
                    "' where Masv = " + iMasv;
            
            System.out.println(qlsv.updateSV(iMasv,sv, Query));
            
            model.setValueAt(tfMasv.getText(), iSelect, 0);
            model.setValueAt(tfHovaten.getText(), iSelect, 1);
            model.setValueAt(tfNgaySinh.getText(), iSelect, 2);
            model.setValueAt(cbbGioitinh.getSelectedItem(), iSelect, 3);
            model.setValueAt(tfDiachi.getText(), iSelect, 4);
            
            table.setModel(model);
        }
        
        actionButtondisplay();
    }
    
    private void btnXoaMouseClicked(MouseEvent evt) throws Exception {
        int  iSelect = table.getSelectedRow();
        int iMasv = (int) table.getValueAt( iSelect, 0);
        
        if (iSelect >= 0) {
            String Query = "DELETE FROM `sinhvien` WHERE Masv ="+iMasv;
            System.out.println(Query);
            System.out.println( qlsv.deleteSV(iMasv, Query) );
            
            model.removeRow(iSelect);
            table.setModel(model);
        }
        
        actionButtondisplay();
    }
    
    private void btnThemMouseClicked(MouseEvent evt) throws Exception {
        createVectorHeader();
        
        SinhVien sv = new SinhVien();
        
        Vector row=new Vector();
        row.add(tfMasv.getText());
        row.add(tfHovaten.getText());
        row.add(tfNgaySinh.getText());
        row.add(cbbGioitinh.getSelectedItem());
        row.add(tfDiachi.getText());
        
        sv.setiMaSv( Integer.parseInt(tfMasv.getText()) );
        sv.setStrHovaTen(tfHovaten.getText());
        sv.setiNgaySinh( Integer.parseInt(tfNgaySinh.getText()) );
        sv.setStrGioiTinh((String) cbbGioitinh.getSelectedItem());
        sv.setStrDiaChi(tfDiachi.getText());
        
        String Query = "INSERT INTO sinhvien VALUES(" + sv.getiMaSv() + ","
                + "'" + sv.getStrHovaTen() +"',"
                + "" + sv.getiNgaySinh() +","
                + "'" + sv.getStrGioiTinh() +"',"
                + "'" + sv.getStrDiaChi() +"')";
        
        System.out.println(Query);
        
        qlsv.createSV(sv, Query);
        
        model.addRow(row);
        table.setModel(model);
        
        actionButtondisplay();
    }
    
    private void createVectorHeader() {
        if (model.getRowCount()==0) {
            Vector<String> header = new Vector();
            header.add("Mã sinh viên");
            header.add("Họ và tên");
            header.add("Ngày sinh");
            header.add("Giới tính");
            header.add("Địa chỉ");
            
            model = new DefaultTableModel(header, 0);
        }
    }
    
    private void actionButtondisplay() {
        model = new DefaultTableModel();
        
        createVectorHeader();
        for (int i=0 ; i < qlsv.getSoSinhVien() ; i++) {
            SinhVien sv = new SinhVien();
            
            sv = qlsv.getInfor(i);
            
            createVectorHeader();
            
            Vector row=new Vector();
            row.add(sv.getiMaSv());
            row.add(sv.getStrHovaTen());
            row.add(sv.getiNgaySinh());
            row.add(sv.getStrGioiTinh());
            row.add(sv.getStrDiaChi());
            
            model.addRow(row);
        }
        
        table.setModel(model);
        
    }
    
    public static void main(String[] args) throws Exception {
        new JFrameMain().setVisible(true);
    }
    
//  
    private QuanLySinhVien qlsv;
    private Font Arial;
    private ImageIcon imageGa, imageAvatar;
    private JLabel lblAvatar, lblContent;
    private JPanel pTop, pLeft, pMid, pRight, pBot;
    private JButton btnLeft, btnRight;
    private JLabel[] list_lbl, list_lblThongtin;
    private DefaultTableModel model ;
    private JTable table = new JTable();
    private JScrollPane scrollPanel= new JScrollPane();
    private JButton btnThem, btnXoa, btnSua, btnHienThi;
    private JPanel pButton, pMaSv, pContentMaSv, pContentDiem;
    private JTextField tfMasv, tfHovaten, tfNgaySinh, tfDiachi;
    private JComboBox<String> cbbGioitinh;
//    private JPanel pContent

}
